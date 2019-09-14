package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.cores.Core

class OneCoreRequest(serial: String) : SpaceXRequest<Core>() {

    override val method = "cores/$serial"
}
