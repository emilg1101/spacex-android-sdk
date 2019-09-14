package com.github.emilg1101.spacex.api.sdk.entity.dragons

import com.github.emilg1101.spacex.api.sdk.entity.Volume
import com.google.gson.annotations.SerializedName

data class PressurizedCapsule(
    @field:SerializedName("payload_volume") val payloadVolume: Volume
)
