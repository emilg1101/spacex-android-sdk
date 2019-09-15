package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.ships.Ship

class OneShipRequest(shipId: String) : SpaceXRequest<Ship>() {

    override val method = "ships/$shipId"
}
