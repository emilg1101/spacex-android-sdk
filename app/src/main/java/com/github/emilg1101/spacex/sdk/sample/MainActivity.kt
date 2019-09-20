package com.github.emilg1101.spacex.sdk.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.emilg1101.spacex.api.sdk.SpaceXCallback
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = (application as App).getSpaceXApi()

        api.oneHistoricalEvent(0).execute(object : SpaceXCallback<HistoricalEvent> {

            override fun success(result: HistoricalEvent) {
                text.text = result.toString()
            }

            override fun fail(error: Exception) {
                error.printStackTrace()
            }
        })
    }
}
