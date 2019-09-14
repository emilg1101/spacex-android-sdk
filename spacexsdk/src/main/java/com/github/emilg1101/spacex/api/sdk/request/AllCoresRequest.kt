package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.cores.Core

open class AllCoresRequest : SpaceXOutputControlRequest<List<Core>>() {

    override val method = "cores"

    var coreSerial: String? = null
    var block: Int? = null
    var status: String? = null
    var mission: String? = null
    var waterLanding: Boolean? = null

    override fun onStartExecute() {
        super.onStartExecute()
        addParam("core_serial", coreSerial)
        addParam("block", block)
        addParam("status", status)
        addParam("mission", mission)
        addParam("water_landing", waterLanding)
    }
}
