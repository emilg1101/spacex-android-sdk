package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.dragons.Dragon

class AllDragonsRequest : SpaceXOutputControlRequest<List<Dragon>>() {

    override val method = "dragons"
}
