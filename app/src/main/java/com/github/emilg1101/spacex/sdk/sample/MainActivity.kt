package com.github.emilg1101.spacex.sdk.sample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val api = (application as App).getSpaceXApi()

        /*api.oneHistoricalEvent(0).execute(object : SpaceXCallback<HistoricalEvent> {

            override fun success(result: HistoricalEvent) {
                text.text = result.toString()
            }

            override fun fail(error: Exception) {
                error.printStackTrace()
            }
        })*/
        /*api.allCapsules().execute(object: SpaceXCallback<List<Capsule>> {
            override fun success(result: List<Capsule>) {

            }

            override fun fail(error: Exception) {
                error.printStackTrace()
            }
        })*/
        api.companyInfo()
            .subscribeOn(Schedulers.io())
            .observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                text.text = it.toString()
            }, {
                it.printStackTrace()
            })
    }
}
