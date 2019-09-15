package com.github.emilg1101.spacex.api.sdk.entity.ships

import com.google.gson.annotations.SerializedName

data class Position(
    @field:SerializedName("latitude")
    val latitude: Double,
    @field:SerializedName("longitude")
    val longitude: Double
)
