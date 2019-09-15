package com.github.emilg1101.spacex.api.sdk.entity.ships

import com.google.gson.annotations.SerializedName

data class Mission(
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("flight")
    val flight: Int
)
