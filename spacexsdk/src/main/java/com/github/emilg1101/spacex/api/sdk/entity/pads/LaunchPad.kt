package com.github.emilg1101.spacex.api.sdk.entity.pads

import com.google.gson.annotations.SerializedName

data class LaunchPad(
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("status")
    val status: String,
    @field:SerializedName("location")
    val location: Location,
    @field:SerializedName("vehicles_launched")
    val vehiclesLaunched: List<String>,
    @field:SerializedName("attempted_launches")
    val attemptedLaunches: Int,
    @field:SerializedName("successful_launches")
    val successfulLaunches: Int,
    @field:SerializedName("wikipedia")
    val wikipedia: String,
    @field:SerializedName("details")
    val details: String,
    @field:SerializedName("site_id")
    val site_id: String,
    @field:SerializedName("site_name_long")
    val siteNameLong: String
)
