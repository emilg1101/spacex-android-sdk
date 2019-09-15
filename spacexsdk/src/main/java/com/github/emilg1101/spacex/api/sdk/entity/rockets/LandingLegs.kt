package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.google.gson.annotations.SerializedName

data class LandingLegs(
    @field:SerializedName("number")
    val number: Int,
    @field:SerializedName("material")
    val material: String
)
