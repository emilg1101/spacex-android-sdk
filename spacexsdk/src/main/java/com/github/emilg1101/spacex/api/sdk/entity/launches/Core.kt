package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class Core(
    @field:SerializedName("core_serial")
    val coreSerial: String?,
    @field:SerializedName("flight")
    val flight: Int?,
    @field:SerializedName("block")
    val block: Int?,
    @field:SerializedName("gridfins")
    val gridfins: Boolean?,
    @field:SerializedName("legs")
    val legs: Boolean?,
    @field:SerializedName("reused")
    val reused: Boolean,
    @field:SerializedName("land_success")
    val landSuccess: Boolean?,
    @field:SerializedName("landing_intent")
    val landingIntent: Boolean?,
    @field:SerializedName("landing_type")
    val landingType: String?,
    @field:SerializedName("landing_vehicle")
    val landingVehicle: String?
)
