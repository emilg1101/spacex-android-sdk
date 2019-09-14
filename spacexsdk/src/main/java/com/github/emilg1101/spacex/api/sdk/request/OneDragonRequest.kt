package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.dragons.Dragon

class OneDragonRequest(id: String) : SpaceXRequest<Dragon>() {

    override val method = "dragons/$id"
}
