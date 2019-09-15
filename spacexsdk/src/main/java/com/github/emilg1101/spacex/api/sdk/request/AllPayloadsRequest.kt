package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.payloads.Payload

class AllPayloadsRequest : SpaceXOutputControlRequest<List<Payload>>() {

    override val method = "payloads"
}
