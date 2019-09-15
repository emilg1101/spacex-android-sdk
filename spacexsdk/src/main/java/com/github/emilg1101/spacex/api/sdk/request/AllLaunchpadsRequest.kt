package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.pads.LaunchPad

class AllLaunchpadsRequest : SpaceXOutputControlRequest<List<LaunchPad>>() {

    override val method = "launchpads"
}
