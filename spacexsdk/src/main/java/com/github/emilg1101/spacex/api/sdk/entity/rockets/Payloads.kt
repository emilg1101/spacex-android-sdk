package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.google.gson.annotations.SerializedName

data class Payloads(
    @field:SerializedName("option_1")
    val option1: String,
    @field:SerializedName("composite_fairing")
    val compositeFairing: CompositeFairing
)
