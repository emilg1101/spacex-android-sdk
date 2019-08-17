package com.github.emilg1101.spacex.api.sdk

import okhttp3.Request

abstract class SpaceXRequest {

    abstract val method: String

    private val spaceXURLBuilder: SpaceXURLBuilder = SpaceXURLBuilder()

    init {

    }

    fun addParam(name: String, value: String) {
        spaceXURLBuilder.addParam(name, value)
    }

    fun buildHttpRequest(): Request {
        spaceXURLBuilder.addMethod(method)
        return Request.Builder().url(spaceXURLBuilder.build())
            .build()
    }
}
