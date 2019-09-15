package com.github.emilg1101.spacex.api.sdk.entity.payloads

import com.google.gson.annotations.SerializedName

data class Payload(
    @field:SerializedName("payload_id")
    val payloadId: String,
    @field:SerializedName("norad_id")
    val noradId: List<String>,
    @field:SerializedName("reused")
    val reused: Boolean,
    @field:SerializedName("customers")
    val customers: List<String>,
    @field:SerializedName("nationality")
    val nationality: String?,
    @field:SerializedName("manufacturer")
    val manufacturer: String?,
    @field:SerializedName("payload_type")
    val payloadType: String,
    @field:SerializedName("payload_mass_kg")
    val payloadMassKg: Double?,
    @field:SerializedName("payload_mass_lbs")
    val payloadMassLbs: Double?,
    @field:SerializedName("orbit")
    val orbit: String,
    @field:SerializedName("orbit_params")
    val orbitParams: OrbitParams
)
