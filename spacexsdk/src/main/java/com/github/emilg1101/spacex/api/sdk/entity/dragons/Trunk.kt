package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.github.emilg1101.spacex.api.sdk.entity.Volume
import com.google.gson.annotations.SerializedName

data class Trunk(
    @field:SerializedName("trunk_volume")
    val trunkVolume: Volume,
    @field:SerializedName("cargo")
    val cargo: Cargo
)
