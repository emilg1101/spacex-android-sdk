package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.rockets.Rocket

class OneRocketRequest(rocketId: String) : SpaceXRequest<Rocket>() {

    override val method = "rockets/$rocketId"
}
