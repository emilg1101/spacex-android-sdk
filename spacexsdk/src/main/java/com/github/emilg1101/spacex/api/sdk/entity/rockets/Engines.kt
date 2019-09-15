package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.github.emilg1101.spacex.api.sdk.entity.dragons.Thrust
import com.google.gson.annotations.SerializedName

data class Engines(
    @field:SerializedName("number")
    val number: Int,
    @field:SerializedName("type")
    val type: String,
    @field:SerializedName("version")
    val version: String,
    @field:SerializedName("layout")
    val layout: String,
    @field:SerializedName("engine_loss_max")
    val engineLossMax: Int,
    @field:SerializedName("propellant_1")
    val propellant1: String,
    @field:SerializedName("propellant_2")
    val propellant2: String,
    @field:SerializedName("thrust_sea_level")
    val thrustSeaLevel: Thrust,
    @field:SerializedName("thrust_vacuum")
    val thrustVacuum: Thrust,
    @field:SerializedName("thrust_to_weight")
    val thrustToWeight: Double
)
