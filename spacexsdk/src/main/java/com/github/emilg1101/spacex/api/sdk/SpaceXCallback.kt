package com.github.emilg1101.spacex.api.sdk

interface SpaceXCallback<T> {

    fun success(result: T)

    fun fail(error: Exception)
}
