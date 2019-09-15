package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXOutputControlRequest
import com.github.emilg1101.spacex.api.sdk.entity.launches.Launch

open class AllLaunchesRequest : SpaceXOutputControlRequest<List<Launch>>() {

    override val method = "launches"

    var flightId: String? = null
    var flightNumber: Int? = null
    var launchYear: Int? = null
    var tbd: Boolean? = null
    var rocketId: String? = null
    var rocketName: String? = null
    var rocketType: String? = null
    var coreSerial: String? = null
    var landSuccess: Boolean? = null
    var landingIntent: Boolean? = null
    var landingType: String? = null
    var landingVehicle: String? = null
    var capSerial: String? = null
    var coreFlight: Int? = null
    var block: Int? = null
    var gridfins: Boolean? = null
    var legs: Boolean? = null
    var coreReuse: Boolean? = null
    var capsuleReuse: Boolean? = null
    var fairingsReused: Boolean? = null

    override fun onStartExecute() {
        super.onStartExecute()
        addParam("flight_id", flightId)
        addParam("flight_number", flightNumber)
        addParam("launch_year", launchYear)
        addParam("tbd", tbd)
        addParam("rocket_id", rocketId)
        addParam("rocket_name", rocketName)
        addParam("rocket_type", rocketType)
        addParam("core_serial", coreSerial)
        addParam("land_success", landSuccess)
        addParam("landing_intent", landingIntent)
        addParam("landing_type", landingType)
        addParam("landing_vehicle", landingVehicle)
        addParam("cap_serial", capSerial)
        addParam("core_flight", coreFlight)
        addParam("block", block)
        addParam("gridfins", gridfins)
        addParam("legs", legs)
        addParam("core_reuse", coreReuse)
        addParam("capsule_reuse", capsuleReuse)
        addParam("fairings_reused", fairingsReused)
    }
}
