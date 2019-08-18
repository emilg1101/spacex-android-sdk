package com.github.emilg1101.spacex.api.sdk

import android.content.Context
import android.os.Handler
import com.github.emilg1101.spacex.api.sdk.converter.Converter
import com.github.emilg1101.spacex.api.sdk.converter.GsonConverter
import okhttp3.Call
import okhttp3.Callback
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import java.io.IOException
import java.lang.reflect.Type

object SpaceX {

    private var client = OkHttpClient()

    private var mainHandler: Handler? = null

    private var converter: Converter = GsonConverter()

    fun init(context: Context) {
        mainHandler = Handler(context.mainLooper)
    }

    fun setLoggingInterceptor(loggingInterceptor: HttpLoggingInterceptor) {
        client = OkHttpClient.Builder()
            .addInterceptor(loggingInterceptor)
            .build()
    }

    fun <T> execute(request: SpaceXRequest<T>, callback: SpaceXCallback<T>, type: Type) {
        client.newCall(request.buildHttpRequest()).enqueue(object : Callback {
            override fun onFailure(call: Call, e: IOException) {
                mainHandler?.post {
                    callback.fail(e)
                }
            }

            override fun onResponse(call: Call, response: Response) {
                mainHandler?.post {
                    callback.success(converter.convert(response.body, type))
                }
            }
        })
    }

    fun <T> execute(request: SpaceXRequest<T>, type: Type): T {
        val response = client.newCall(request.buildHttpRequest()).execute()
        return converter.convert(response.body, type)
    }
}
