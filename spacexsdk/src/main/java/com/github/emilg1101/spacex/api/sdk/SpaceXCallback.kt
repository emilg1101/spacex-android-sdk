package com.github.emilg1101.spacex.api.sdk

interface SpaceXCallback {
    fun success(result: String)
    fun fail(error: Exception)
}
