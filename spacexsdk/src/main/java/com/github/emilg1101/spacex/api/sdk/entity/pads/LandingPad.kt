package com.github.emilg1101.spacex.api.sdk.entity.pads

import com.google.gson.annotations.SerializedName

data class LandingPad(
    @field:SerializedName("id")
    val id: String,
    @field:SerializedName("full_name")
    val fullName: String,
    @field:SerializedName("status")
    val status: String,
    @field:SerializedName("location")
    val location: Location,
    @field:SerializedName("landing_type")
    val landingType: String,
    @field:SerializedName("attempted_landings")
    val attemptedLandings: Int,
    @field:SerializedName("successful_landings")
    val successfulLandings: Int,
    @field:SerializedName("wikipedia")
    val wikipedia: String,
    @field:SerializedName("details")
    val details: String
)
