package com.github.emilg1101.spacex.api.sdk.entity.missions

import com.google.gson.annotations.SerializedName

data class Mission(
    @field:SerializedName("mission_name")
    val missionName: String,
    @field:SerializedName("mission_id")
    val missionId: String,
    @field:SerializedName("manufacturers")
    val manufacturers: List<String>,
    @field:SerializedName("payload_ids")
    val payloadIds: List<String>,
    @field:SerializedName("wikipedia")
    val wikipedia: String?,
    @field:SerializedName("website")
    val website: String?,
    @field:SerializedName("twitter")
    val twitter: String?,
    @field:SerializedName("description")
    val description: String
)
