package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class Telemetry(
    @field:SerializedName("flight_club")
    val flightClub: String
)
