package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class Fairings(
    @field:SerializedName("reused")
    val reused: Boolean,
    @field:SerializedName("recovery_attempt")
    val recoveryAttempt: Boolean,
    @field:SerializedName("recovered")
    val recovered: Boolean,
    @field:SerializedName("ship")
    val ship: String
)
