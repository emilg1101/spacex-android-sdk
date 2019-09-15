package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class LaunchRocket(
    @field:SerializedName("rocket_id")
    val rocketId: String,
    @field:SerializedName("rocket_name")
    val rocketName: String,
    @field:SerializedName("rocket_type")
    val rocketType: String,
    @field:SerializedName("first_stage")
    val firstStage: FirstStage,
    @field:SerializedName("second_stage")
    val secondStage: SecondStage,
    @field:SerializedName("fairings")
    val fairings: Fairings
)
