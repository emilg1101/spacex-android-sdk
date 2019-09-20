package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Launch(
    @field:SerializedName("flight_number")
    val flightNumber: Int,
    @field:SerializedName("mission_name")
    val missionName: String,
    @field:SerializedName("mission_id")
    val missionId: List<String>,
    @field:SerializedName("launch_year")
    val launchYear: Int,
    @field:SerializedName("launch_date_unix")
    val launchDateUnix: Int,
    @field:SerializedName("launch_date_utc")
    val launchDateUtc: String,
    @field:SerializedName("launch_date_local")
    val launchDateLocal: Date,
    @field:SerializedName("is_tentative")
    val isTentative: Boolean,
    @field:SerializedName("tentative_max_precision")
    val tentativeMaxPrecision: String,
    @field:SerializedName("tbd")
    val tbd: Boolean,
    @field:SerializedName("launch_window")
    val launchWindow: String,
    @field:SerializedName("rocket")
    val rocket: LaunchRocket,
    @field:SerializedName("ships")
    val ships: List<String>,
    @field:SerializedName("telemetry")
    val telemetry: Telemetry,
    @field:SerializedName("launch_site")
    val launchSite: LaunchSite,
    @field:SerializedName("launch_success")
    val launchSuccess: String,
    @field:SerializedName("links")
    val links: Links,
    @field:SerializedName("details")
    val details: String,
    @field:SerializedName("upcoming")
    val upcoming: Boolean,
    @field:SerializedName("static_fire_date_utc")
    val staticFireDateUtc: String,
    @field:SerializedName("static_fire_date_unix")
    val staticFireDateUnix: String
)
