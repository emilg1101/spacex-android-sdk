package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.capsules.Capsule

class OneCapsuleRequest(serial: String) : SpaceXRequest<Capsule>() {

    override val method = "capsules/$serial"
}
