package com.github.emilg1101.spacex.api.sdk

import android.content.Context
import android.os.Handler
import com.github.emilg1101.spacex.api.sdk.request.AllHistoricalEventsRequest
import com.github.emilg1101.spacex.api.sdk.request.OneHistoricalEventsRequest
import okhttp3.Interceptor
import okhttp3.OkHttpClient

class SpaceX(context: Context, client: OkHttpClient = OkHttpClient()) : SpaceXApi {

    private val executor: SpaceXExecutor

    init {
        val mainHandler = Handler(context.mainLooper)
        executor = SpaceXExecutor(client, mainHandler)
    }

    class Builder(private val context: Context) {

        private val okHttpClientBuilder = OkHttpClient.Builder()

        fun addInterceptor(interceptor: Interceptor) = apply {
            okHttpClientBuilder.addInterceptor(interceptor)
        }

        fun build(): SpaceXApi {
            return SpaceX(context, okHttpClientBuilder.build())
        }
    }

    override fun allHistoricalEvents(): AllHistoricalEventsRequest {
        return AllHistoricalEventsRequest().apply { addExecutor(executor) }
    }

    override fun oneHistoricalEvent(id: Int): OneHistoricalEventsRequest {
        return OneHistoricalEventsRequest(id).apply { addExecutor(executor) }
    }
}
