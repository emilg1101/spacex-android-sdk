package com.github.emilg1101.spacex.api.sdk.entity.info

import com.google.gson.annotations.SerializedName

data class Headquarters(
    @field:SerializedName("address")
    val address: String,
    @field:SerializedName("city")
    val city: String,
    @field:SerializedName("state")
    val state: String
)
