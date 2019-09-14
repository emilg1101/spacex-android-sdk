package com.github.emilg1101.spacex.api.sdk.entity.landpads

import com.google.gson.annotations.SerializedName

data class Location(
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("region")
    val region: String,
    @field:SerializedName("latitude")
    val latitude: Double,
    @field:SerializedName("longitude")
    val longitude: Double
)
