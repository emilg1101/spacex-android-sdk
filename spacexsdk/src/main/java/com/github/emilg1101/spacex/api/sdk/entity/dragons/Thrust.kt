package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.google.gson.annotations.SerializedName

data class Thrust(
    @field:SerializedName("kN")
    val kN: Double,
    @field:SerializedName("lbf")
    val lbf: Int
)
