package com.github.emilg1101.spacex.sdk.sample

import com.github.emilg1101.spacex.api.sdk.SpaceXCallback
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent
import com.github.emilg1101.spacex.api.sdk.request.SpaceXHistory
import org.junit.Assert
import org.junit.Test

class HistoryRequestsUnitTest {

    @Test
    fun sync_receivingOneHistoricalEvent_isCorrect() {
        val entity = SpaceXHistory.oneEvent(1).execute()
        Assert.assertNotNull(entity)
        Assert.assertEquals(entity.id, 1)
    }

    @Test
    fun async_receivingOneHistoricalEvent_isCorrect() {
        SpaceXHistory.oneEvent(1).execute(object : SpaceXCallback<HistoricalEvent> {

            override fun success(result: HistoricalEvent) {
                Assert.assertNotNull(result)
                Assert.assertEquals(result.id, 1)
            }

            override fun fail(error: Exception) {
                Assert.fail()
            }
        })
    }
}
