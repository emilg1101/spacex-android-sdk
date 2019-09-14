package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.landpads.LandingPad

class OneLandingPadRequest(id: String) : SpaceXRequest<LandingPad>() {

    override val method = "landpads/$id"
}
