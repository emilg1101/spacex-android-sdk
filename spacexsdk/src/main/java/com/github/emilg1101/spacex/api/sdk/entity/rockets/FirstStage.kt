package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.github.emilg1101.spacex.api.sdk.entity.dragons.Thrust
import com.google.gson.annotations.SerializedName

data class FirstStage(
    @field:SerializedName("reusable")
    val reusable: Boolean,
    @field:SerializedName("engines")
    val engines: Int,
    @field:SerializedName("fuel_amount_tons")
    val fuelAmountTons: Double,
    @field:SerializedName("burn_time_sec")
    val burnTimeSec: Int,
    @field:SerializedName("thrust_sea_level")
    val thrustSeaLevel: Thrust,
    @field:SerializedName("thrust_vacuum")
    val thrustVacuum: Thrust
)
