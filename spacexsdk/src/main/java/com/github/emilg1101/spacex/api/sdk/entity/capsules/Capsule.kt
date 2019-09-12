package com.github.emilg1101.spacex.api.sdk.entity.capsules

import com.google.gson.annotations.SerializedName
import java.util.*

data class Capsule(
    @field:SerializedName("capsule_serial")
    val capsuleSerial: String,
    @field:SerializedName("capsule_id")
    val capsuleId: String,
    @field:SerializedName("status")
    val status: String,
    @field:SerializedName("original_launch")
    val originalLaunch: Date?,
    @field:SerializedName("original_launch_unix")
    val originalLaunchUnix: Long?,
    @field:SerializedName("missions")
    val missions: List<Mission>,
    @field:SerializedName("landings")
    val landings: Int,
    @field:SerializedName("type")
    val type: String,
    @field:SerializedName("details")
    val details: String?,
    @field:SerializedName("reuse_count")
    val reuseCount: Int
)
