package com.github.emilg1101.spacex.api.sdk

import okhttp3.Request
import java.lang.Exception
import java.lang.reflect.ParameterizedType

abstract class SpaceXRequest<T> {

    abstract val method: String

    private val spaceXURLBuilder: SpaceXURLBuilder = SpaceXURLBuilder()

    fun addParam(name: String, value: String) {
        spaceXURLBuilder.addParam(name, value)
    }

    fun buildHttpRequest(): Request {
        spaceXURLBuilder.addMethod(method)
        return Request.Builder().url(spaceXURLBuilder.build())
            .build()
    }

    open fun onStartExecute() {}

    fun execute(callback: SpaceXCallback<T>) {
        onStartExecute()
        SpaceX.execute(
            this,
            callback,
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] ?: throw Exception()
        )
    }

    fun execute(): T {
        onStartExecute()
        return SpaceX.execute(
            this,
            (javaClass.genericSuperclass as ParameterizedType).actualTypeArguments[0] ?: throw Exception()
        )
    }
}
