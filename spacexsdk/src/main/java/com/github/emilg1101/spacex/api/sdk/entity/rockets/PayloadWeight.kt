package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.google.gson.annotations.SerializedName

data class PayloadWeight(
    @field:SerializedName("id")
    val id: String,
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("kg")
    val kg: Int,
    @field:SerializedName("lb")
    val lb: Int
)
