package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.github.emilg1101.spacex.api.sdk.entity.Dimension
import com.github.emilg1101.spacex.api.sdk.entity.Mass
import com.github.emilg1101.spacex.api.sdk.entity.Volume
import com.google.gson.annotations.SerializedName

data class Dragon(
    @field:SerializedName("id")
    val id: String,
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("type")
    val type: String,
    @field:SerializedName("active")
    val active: Boolean,
    @field:SerializedName("crew_capacity")
    val crewCapacity: Int,
    @field:SerializedName("sidewall_angle_deg")
    val sidewallAngleDeg: Int,
    @field:SerializedName("orbit_duration_yr")
    val orbitDurationYr: Int,
    @field:SerializedName("dry_mass_kg")
    val dryMassKg: Int,
    @field:SerializedName("dry_mass_lb")
    val dryMassLb: Int,
    @field:SerializedName("first_flight")
    val firstFlight: String,
    @field:SerializedName("heat_shield")
    val heatShield: HeatShield,
    @field:SerializedName("thrusters")
    val thrusters: List<Thruster>,
    @field:SerializedName("launch_payload_mass")
    val launchPayloadMass: Mass,
    @field:SerializedName("launch_payload_vol")
    val launchPayloadVol: Volume,
    @field:SerializedName("return_payload_mass")
    val returnPayloadMass: Mass,
    @field:SerializedName("return_payload_vol")
    val returnPayloadVol: Volume,
    @field:SerializedName("pressurized_capsule")
    val pressurizedCapsule: PressurizedCapsule,
    @field:SerializedName("trunk")
    val trunk: Trunk,
    @field:SerializedName("height_w_trunk")
    val heightWithTrunk: Dimension,
    @field:SerializedName("diameter")
    val diameter: Dimension,
    @field:SerializedName("wikipedia")
    val wikipedia: String,
    @field:SerializedName("description")
    val description: String
)
