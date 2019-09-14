package com.github.emilg1101.spacex.api.sdk.entity

import com.google.gson.annotations.SerializedName

data class Mass(
    @field:SerializedName("kg")
    val kg: Double,
    @field:SerializedName("lb")
    val lb: Double
)
