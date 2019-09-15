package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.missions.Mission

class OneMissionRequest(missionId: String) : SpaceXRequest<Mission>() {

    override val method = "missions/$missionId"
}
