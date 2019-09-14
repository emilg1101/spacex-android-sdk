package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.google.gson.annotations.SerializedName

data class Cargo(
    @field:SerializedName("solar_array")
    val solarArray: Int,
    @field:SerializedName("unpressurized_cargo")
    val unpressurizedCargo: Boolean
)
