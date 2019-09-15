package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class FirstStage(
    @field:SerializedName("cores") val cores: List<Core>
)
