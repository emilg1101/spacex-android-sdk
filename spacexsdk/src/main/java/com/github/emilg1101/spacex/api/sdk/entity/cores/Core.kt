package com.github.emilg1101.spacex.api.sdk.entity.cores

import com.google.gson.annotations.SerializedName
import java.util.*

data class Core(
    @field:SerializedName("core_serial")
    val coreSerial: String,
    @field:SerializedName("block")
    val block: String?,
    @field:SerializedName("status")
    val status: String,
    @field:SerializedName("original_launch")
    val originalLaunch: Date?,
    @field:SerializedName("original_launch_unix")
    val originalLaunchUnix: Int?,
    @field:SerializedName("missions")
    val missions: List<Mission>,
    @field:SerializedName("reuse_count")
    val reuseCount: Int,
    @field:SerializedName("rtls_attempts")
    val rtlsAttempts: Int,
    @field:SerializedName("rtls_landings")
    val rtlsLandings: Int,
    @field:SerializedName("asds_attempts")
    val asdsAttempts: Int,
    @field:SerializedName("asds_landings")
    val asdsLandings: Int,
    @field:SerializedName("water_landing")
    val waterLanding: Boolean,
    @field:SerializedName("details")
    val details: String?
)
