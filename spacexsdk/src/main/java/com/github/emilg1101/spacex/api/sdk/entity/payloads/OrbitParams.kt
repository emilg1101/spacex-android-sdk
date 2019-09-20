package com.github.emilg1101.spacex.api.sdk.entity.payloads

import com.google.gson.annotations.SerializedName
import java.util.Date

data class OrbitParams(
    @field:SerializedName("reference_system")
    val referenceSystem: String?,
    @field:SerializedName("regime")
    val regime: String?,
    @field:SerializedName("longitude")
    val longitude: Double,
    @field:SerializedName("semi_major_axis_km")
    val semiMajorAxisKm: Double?,
    @field:SerializedName("eccentricity")
    val eccentricity: Double?,
    @field:SerializedName("periapsis_km")
    val periapsisKm: Double?,
    @field:SerializedName("apoapsis_km")
    val apoapsisKm: Double?,
    @field:SerializedName("inclination_deg")
    val inclinationDeg: Double?,
    @field:SerializedName("period_min")
    val periodMin: Double?,
    @field:SerializedName("lifespan_years")
    val lifespanYears: Double?,
    @field:SerializedName("epoch")
    val epoch: Date?,
    @field:SerializedName("mean_motion")
    val meanMotion: Double?,
    @field:SerializedName("raan")
    val raan: Double?,
    @field:SerializedName("arg_of_pericenter")
    val argOfPericenter: String,
    @field:SerializedName("mean_anomaly")
    val meanAnomaly: String
)
