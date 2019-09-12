package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent

class AllHistoricalEventsRequest : SpaceXOutputControlRequest<List<HistoricalEvent>>() {

    override val method: String = "history"

    var id: Int? = null
    var start: String? = null
    var end: String? = null
    var flightNumber: String? = null

    override fun onStartExecute() {
        super.onStartExecute()
        addParam("id", id)
        addParam("start", start)
        addParam("end", end)
        addParam("flight_number", flightNumber)
    }
}
