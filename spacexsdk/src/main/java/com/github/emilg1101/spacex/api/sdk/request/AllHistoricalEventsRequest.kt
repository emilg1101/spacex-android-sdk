package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest

class AllHistoricalEventsRequest : SpaceXRequest() {

    override val method: String = "history"

    var id: Int? = null
        set(value) {
            value?.let { addParam("id", it.toString()) }
            field = value
        }

    var start: String? = null
        set(value) {
            value?.let { addParam("start", it) }
            field = value
        }

    var end: String? = null
        set(value) {
            value?.let { addParam("end", it) }
            field = value
        }

    var flightNumber: String? = null
        set(value) {
            value?.let { addParam("flight_number", it) }
            field = value
        }
}
