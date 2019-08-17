package com.github.emilg1101.spacex.api.sdk

import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Response
import java.io.IOException

object SpaceX {

    private val client = OkHttpClient()

    fun execute(request: SpaceXRequest, callback: SpaceXCallback) {
        client.newCall(request.buildHttpRequest()).enqueue(object: Callback {
            override fun onFailure(call: Call, e: IOException) {
                callback.fail(e)
            }

            override fun onResponse(call: Call, response: Response) {
                callback.success(response.body?.string() ?: "")
            }
        })
    }
}
