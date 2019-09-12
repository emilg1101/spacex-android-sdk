package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.capsules.Capsule

open class AllCapsulesRequest : SpaceXOutputControlRequest<List<Capsule>>() {

    override val method = "capsules"

    var capsuleSerial: String? = null
    var capsuleId: String? = null
    var status: String? = null
    var mission: String? = null
    var landings: Int? = null
    var type: String? = null
    var reuseCount: Int? = null

    override fun onStartExecute() {
        super.onStartExecute()
        addParam("capsule_serial", capsuleSerial)
        addParam("capsule_id", capsuleId)
        addParam("status", status)
        addParam("mission", mission)
        addParam("landings", landings)
        addParam("type", type)
        addParam("reuse_count", reuseCount)
    }
}
