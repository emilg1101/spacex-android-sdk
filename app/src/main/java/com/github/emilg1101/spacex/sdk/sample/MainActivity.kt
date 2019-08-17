package com.github.emilg1101.spacex.sdk.sample

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.github.emilg1101.spacex.api.sdk.SpaceX
import com.github.emilg1101.spacex.api.sdk.SpaceXCallback
import com.github.emilg1101.spacex.api.sdk.request.SpaceXHistory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        SpaceX.execute(SpaceXHistory.all().apply {
            id = 4
        }, object : SpaceXCallback {
            override fun success(result: String) {
                Log.d("MainActivity", result)
            }

            override fun fail(error: Exception) {
                error.printStackTrace()
            }
        })
    }
}
