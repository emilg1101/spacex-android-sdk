package com.github.emilg1101.spacex.sdk.sample

import android.app.Application
import com.github.emilg1101.spacex.api.sdk.SpaceX
import com.github.emilg1101.spacex.api.sdk.rx.RxSpaceX
import com.github.emilg1101.spacex.api.sdk.rx.SpaceXApi
import okhttp3.logging.HttpLoggingInterceptor

class App : Application() {

    fun getSpaceXApi(): SpaceXApi {
        return RxSpaceX(SpaceX.Builder(this)
            .addInterceptor(HttpLoggingInterceptor().apply {
                level = HttpLoggingInterceptor.Level.BODY
            }).build()
        )
    }
}
