package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.roadster.Roadster

class RoadsterRequest : SpaceXRequest<Roadster>() {

    override val method = "roadster"
}
