package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.ships.Ship

class AllShipsRequest : SpaceXOutputControlRequest<List<Ship>>() {

    override val method = "ships"
}
