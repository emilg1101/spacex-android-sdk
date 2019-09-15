package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.missions.Mission

class AllMissionsRequest : SpaceXOutputControlRequest<List<Mission>>() {

    override val method = "missions"
}
