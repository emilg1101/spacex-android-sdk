package com.github.emilg1101.spacex.sdk.sample

import androidx.test.platform.app.InstrumentationRegistry
import com.github.emilg1101.spacex.api.sdk.SpaceX
import com.github.emilg1101.spacex.api.sdk.SpaceXApi
import com.github.emilg1101.spacex.api.sdk.SpaceXCallback
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class HistoryRequestsInstrumentedTest {

    private lateinit var api: SpaceXApi

    @Before
    fun setup() {
        val context = InstrumentationRegistry.getInstrumentation().context
        api = SpaceX(context)
    }

    @Test
    fun sync_receivingAllHistoricalEvents_isCorrect() {
        val events = api.allHistoricalEvents().apply { limit = 10 }.execute()
        Assert.assertEquals(10, events.size)
    }

    @Test
    fun sync_receivingOneHistoricalEvent_isCorrect() {
        val entity = api.oneHistoricalEvent(1).execute()
        Assert.assertNotNull(entity)
        Assert.assertEquals(1, entity.id)
    }

    @Test
    fun async_receivingOneHistoricalEvent_isCorrect() {
        api.oneHistoricalEvent(1).execute(object : SpaceXCallback<HistoricalEvent> {

            override fun success(result: HistoricalEvent) {
                Assert.assertNotNull(result)
                Assert.assertEquals(1, result.id)
            }

            override fun fail(error: Exception) {
                Assert.fail()
            }
        })
    }
}
