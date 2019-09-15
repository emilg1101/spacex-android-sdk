package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class SecondStage(
    @field:SerializedName("block")
    val block: Int,
    @field:SerializedName("payloads")
    val payloads: List<Payload>
)
