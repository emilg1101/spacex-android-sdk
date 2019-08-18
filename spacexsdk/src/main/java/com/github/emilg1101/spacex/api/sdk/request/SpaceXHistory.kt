package com.github.emilg1101.spacex.api.sdk.request

object SpaceXHistory {

    fun allEvents(): AllHistoricalEventsRequest {
        return AllHistoricalEventsRequest()
    }

    fun oneEvent(id: Int): OneHistoricalEventsRequest {
        return OneHistoricalEventsRequest(id)
    }
}
