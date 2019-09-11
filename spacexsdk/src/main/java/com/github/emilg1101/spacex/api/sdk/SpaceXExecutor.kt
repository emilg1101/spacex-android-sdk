package com.github.emilg1101.spacex.api.sdk

import android.os.Handler
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Response
import java.io.IOException

class SpaceXExecutor(private val client: OkHttpClient, private val handler: Handler?) {

    fun <T> execute(request: SpaceXRequest<T>, callback: ExecutionCallback) {
        client.newCall(request.buildHttpRequest()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                handler?.post {
                    callback.fail(e)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                handler?.post {
                    try {
                        callback.success(response)
                    } catch (e: Exception) {
                        callback.fail(e)
                    }
                }
            }
        })
    }

    fun <T> execute(request: SpaceXRequest<T>): Response {
        return client.newCall(request.buildHttpRequest()).execute()
    }

    interface ExecutionCallback {
        fun success(response: Response)
        fun fail(exception: Exception)
    }
}
