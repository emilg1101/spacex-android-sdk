package com.github.emilg1101.spacex.api.sdk

import android.content.Context
import android.os.Handler
import com.google.gson.Gson
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import java.io.IOException
import java.lang.reflect.Type

object SpaceX {

    private var client = OkHttpClient()

    var mainHandler: Handler? = null

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
                val gson = Gson()
                mainHandler?.post {
                    callback.success(gson.fromJson(response.body?.string(), type))
                }
            }
        })
    }

    fun <T> execute(request: SpaceXRequest<T>, type: Type): T {
        val gson = Gson()
        val response = client.newCall(request.buildHttpRequest()).execute()
        return gson.fromJson(response.body?.string(), type)
    }
}
