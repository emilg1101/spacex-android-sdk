package com.github.emilg1101.spacex.api.sdk

import com.github.emilg1101.spacex.api.sdk.converter.Converter
import com.github.emilg1101.spacex.api.sdk.converter.GsonConverter
import okhttp3.Request
import okhttp3.Response
import java.lang.reflect.ParameterizedType
import java.lang.reflect.Type

abstract class SpaceXRequest<T> {

    abstract val method: String

    private val spaceXURLBuilder: SpaceXURLBuilder = SpaceXURLBuilder()

    private var converter: Converter = GsonConverter()

    private var spaceXExecutor: SpaceXExecutor? = null

    fun addParam(name: String, value: String?) = apply {
        value?.let { spaceXURLBuilder.addParam(name, it) }
    }

    fun addParam(name: String, value: Int?) = apply {
        value?.let { spaceXURLBuilder.addParam(name, it.toString()) }
    }

    fun addParam(name: String, value: Boolean?) = apply {
        value?.let { spaceXURLBuilder.addParam(name, it.toString()) }
    }

    fun addExecutor(executor: SpaceXExecutor) = apply {
        spaceXExecutor = executor
    }

    fun buildHttpRequest(): Request {
        spaceXURLBuilder.addMethod(method)
        return Request.Builder().url(spaceXURLBuilder.build())
            .build()
    }

    open fun onStartExecute() {}

    fun execute(callback: SpaceXCallback<T>) {
        onStartExecute()
        spaceXExecutor?.execute(
            this,
            object : SpaceXExecutor.ExecutionCallback {
                override fun success(response: Response) {
                    callback.success(converter.convert(response.body, getType()))
                }

                override fun fail(exception: Exception) {
                    callback.fail(exception)
                }
            }
        )
    }

    fun execute(): T {
        onStartExecute()
        return converter.convert(
            spaceXExecutor?.execute(this)?.body ?: throw Exception(),
            getType()
        )
    }

    private fun getType(): Type {
        return (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
            ?: throw Exception()
    }
}
