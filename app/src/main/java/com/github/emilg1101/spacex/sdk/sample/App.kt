package com.github.emilg1101.spacex.sdk.sample

import android.app.Application
import com.github.emilg1101.spacex.api.sdk.SpaceX
import okhttp3.logging.HttpLoggingInterceptor

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        SpaceX.init(this)
        SpaceX.setLoggingInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
    }
}
