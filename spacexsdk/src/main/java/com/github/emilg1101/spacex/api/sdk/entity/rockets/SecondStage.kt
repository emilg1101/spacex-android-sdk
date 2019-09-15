package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.github.emilg1101.spacex.api.sdk.entity.dragons.Thrust
import com.google.gson.annotations.SerializedName

data class SecondStage(
    @field:SerializedName("engines")
    val engines: Int,
    @field:SerializedName("fuel_amount_tons")
    val fuelAmountTons: Double,
    @field:SerializedName("burn_time_sec")
    val burnTimeSec: Int,
    @field:SerializedName("thrust")
    val thrust: Thrust,
    @field:SerializedName("payloads")
    val payloads: Payloads
)
