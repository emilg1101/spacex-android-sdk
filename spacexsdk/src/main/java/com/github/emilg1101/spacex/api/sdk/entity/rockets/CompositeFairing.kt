package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.github.emilg1101.spacex.api.sdk.entity.Dimension
import com.google.gson.annotations.SerializedName

data class CompositeFairing(
    @field:SerializedName("height")
    val height: Dimension,
    @field:SerializedName("diameter")
    val diameter: Dimension
)
