package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.pads.LaunchPad

class OneLaunchpadRequest(siteId: String) : SpaceXRequest<LaunchPad>() {

    override val method = "launchpads/$siteId"
}
