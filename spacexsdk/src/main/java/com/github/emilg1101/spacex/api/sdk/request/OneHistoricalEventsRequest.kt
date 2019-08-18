package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent

class OneHistoricalEventsRequest(id: Int) : SpaceXRequest<HistoricalEvent>() {

    override val method: String = "history/$id"
}
