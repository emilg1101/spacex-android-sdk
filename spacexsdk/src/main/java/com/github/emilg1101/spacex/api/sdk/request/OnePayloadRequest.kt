package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.payloads.Payload

class OnePayloadRequest(payloadId: String) : SpaceXRequest<Payload>() {

    override val method = "payloads/$payloadId"
}
