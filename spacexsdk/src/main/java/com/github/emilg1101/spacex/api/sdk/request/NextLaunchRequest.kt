package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.launches.Launch

class NextLaunchRequest : SpaceXRequest<Launch>() {

    override val method = "launches/next"
}
