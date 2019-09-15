package com.github.emilg1101.spacex.api.sdk.entity.roadster

import com.google.gson.annotations.SerializedName

data class Roadster(
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("launch_date_utc")
    val launchDateUtc: String,
    @field:SerializedName("launch_date_unix")
    val launchDateUnix: Int,
    @field:SerializedName("launch_mass_kg")
    val launchMassKg: Int,
    @field:SerializedName("launch_mass_lbs")
    val launchMassLbs: Int,
    @field:SerializedName("norad_id")
    val noradId: Int,
    @field:SerializedName("epoch_jd")
    val epochJd: Double,
    @field:SerializedName("orbit_type")
    val orbitType: String,
    @field:SerializedName("apoapsis_au")
    val apoapsisAu: Double,
    @field:SerializedName("periapsis_au")
    val periapsisAu: Double,
    @field:SerializedName("semi_major_axis_au")
    val semiMajorAxisAu: Double,
    @field:SerializedName("eccentricity")
    val eccentricity: Double,
    @field:SerializedName("inclination")
    val inclination: Double,
    @field:SerializedName("longitude")
    val longitude: Double,
    @field:SerializedName("periapsis_arg")
    val periapsisArg: Double,
    @field:SerializedName("period_days")
    val periodDays: Double,
    @field:SerializedName("speed_kph")
    val speedKph: Double,
    @field:SerializedName("speed_mph")
    val speedMph: Double,
    @field:SerializedName("earth_distance_km")
    val earthDistanceKm: Double,
    @field:SerializedName("earth_distance_mi")
    val earthDistanceMi: Double,
    @field:SerializedName("mars_distance_km")
    val marsDistanceKm: Double,
    @field:SerializedName("mars_distance_mi")
    val marsDistanceMi: Double,
    @field:SerializedName("wikipedia")
    val wikipedia: String,
    @field:SerializedName("details")
    val details: String
)
