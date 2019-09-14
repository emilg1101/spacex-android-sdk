package com.github.emilg1101.spacex.api.sdk.entity

import com.google.gson.annotations.SerializedName

data class Volume(
    @field:SerializedName("cubic_meters")
    val cubicMeters: Int,
    @field:SerializedName("cubic_feet")
    val cubicFeet: Int
)
