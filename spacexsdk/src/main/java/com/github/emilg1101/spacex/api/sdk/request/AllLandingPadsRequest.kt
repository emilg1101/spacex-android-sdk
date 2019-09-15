package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.pads.LandingPad

class AllLandingPadsRequest : SpaceXOutputControlRequest<List<LandingPad>>() {

    override val method = "landpads"
}
