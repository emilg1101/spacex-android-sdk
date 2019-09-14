package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.google.gson.annotations.SerializedName

data class HeatShield(
    @field:SerializedName("material")
    val material: String,
    @field:SerializedName("size_meters")
    val sizeMeters: Double,
    @field:SerializedName("temp_degrees")
    val tempDegrees: Int,
    @field:SerializedName("dev_partner")
    val devPartner: String
)
