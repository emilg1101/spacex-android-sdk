package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest

class OneHistoricalEventsRequest(id: Int) : SpaceXRequest() {

    override val method: String = "history/$id"
}
