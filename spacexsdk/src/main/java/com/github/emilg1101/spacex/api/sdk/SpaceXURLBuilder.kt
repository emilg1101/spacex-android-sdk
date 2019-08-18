package com.github.emilg1101.spacex.api.sdk

import okhttp3.HttpUrl

class SpaceXURLBuilder {

    companion object {
        private const val BASE_HOST = "api.spacexdata.com"
    }

    private val httpUrlBuilder: HttpUrl.Builder

    init {
        httpUrlBuilder = HttpUrl.Builder()
            .scheme("https")
            .host(BASE_HOST)
            .addPathSegment("v3")
    }

    fun addMethod(method: String) {
        method.split("/").forEach {
            httpUrlBuilder.addPathSegment(it)
        }
    }

    fun addParam(name: String, value: String) {
        httpUrlBuilder.addQueryParameter(name, value)
    }

    fun build(): HttpUrl {
        return httpUrlBuilder.build()
    }
}
