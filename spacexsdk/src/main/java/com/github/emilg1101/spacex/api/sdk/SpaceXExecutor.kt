package com.github.emilg1101.spacex.api.sdk

import android.os.Handler
import com.github.emilg1101.spacex.api.sdk.converter.Converter
import com.github.emilg1101.spacex.api.sdk.converter.GsonConverter
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Response
import java.io.IOException
import java.lang.reflect.Type

class SpaceXExecutor(private val client: OkHttpClient, private val handler: Handler?) {

    private var converter: Converter = GsonConverter()

    fun <T> execute(request: SpaceXRequest<T>, callback: SpaceXCallback<T>, type: Type) {
        client.newCall(request.buildHttpRequest()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                handler?.post {
                    callback.fail(e)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                handler?.post {
                    try {
                        callback.success(converter.convert(response.body, type))
                    } catch (e: Exception) {
                        callback.fail(e)
                    }
                }
            }
        })
    }

    fun <T> execute(request: SpaceXRequest<T>, type: Type): T {
        val response = client.newCall(request.buildHttpRequest()).execute()
        return converter.convert(response.body, type)
    }
}
