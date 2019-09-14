package com.github.emilg1101.spacex.api.sdk.entity

import com.google.gson.annotations.SerializedName

data class Dimension(
    @field:SerializedName("meters")
    val meters: Double,
    @field:SerializedName("feet")
    val feet: Double
)
