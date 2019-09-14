package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.google.gson.annotations.SerializedName

data class Thruster(
    @field:SerializedName("type")
    val type: String,
    @field:SerializedName("amount")
    val amount: Int,
    @field:SerializedName("pods")
    val pods: Int,
    @field:SerializedName("fuel_1")
    val fuel1: String,
    @field:SerializedName("fuel_2")
    val fuel2: String,
    @field:SerializedName("thrust")
    val thrust: Thrust
)
