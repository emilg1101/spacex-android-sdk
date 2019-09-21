package com.github.emilg1101.spacex.api.sdk

import com.github.emilg1101.spacex.api.sdk.converter.Converter
import com.github.emilg1101.spacex.api.sdk.converter.GsonConverter
import com.github.emilg1101.spacex.api.sdk.exception.SpaceXConvertException
import com.github.emilg1101.spacex.api.sdk.exception.SpaceXException
import com.github.emilg1101.spacex.api.sdk.exception.SpaceXHttpException
import com.google.gson.JsonSyntaxException
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
                    try {
                        if (response.isSuccessful) {
                            callback.success(converter.convert(response.body, getType()))
                        } else {
                            callback.fail(SpaceXHttpException(response.code, response.message))
                        }
                    } catch (e: JsonSyntaxException) {
                        callback.fail(SpaceXConvertException(getType(), this@SpaceXRequest))
                    }
                }

                override fun fail(exception: Exception) {
                    callback.fail(exception)
                }
            }
        )
    }

    fun execute(): T {
        onStartExecute()
        try {
            val response = spaceXExecutor?.execute(this) ?: throw SpaceXException("Execution error")
            if (response.isSuccessful) {
                val body = response.body ?: throw SpaceXException("Request body is null")
                return converter.convert(body, getType())
            }
            throw SpaceXHttpException(response.code, response.message)
        } catch (e: JsonSyntaxException) {
            throw SpaceXConvertException(getType(), this)
        }
    }

    private fun getType(): Type {
        return (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0]
            ?: throw SpaceXException("Request type is null")
    }
}
