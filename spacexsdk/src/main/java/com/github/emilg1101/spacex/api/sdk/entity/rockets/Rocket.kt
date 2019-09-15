package com.github.emilg1101.spacex.api.sdk.entity.rockets

import com.github.emilg1101.spacex.api.sdk.entity.Dimension
import com.github.emilg1101.spacex.api.sdk.entity.Mass
import com.google.gson.annotations.SerializedName

data class Rocket(
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("active")
    val active: Boolean,
    @field:SerializedName("stages")
    val stages: Int,
    @field:SerializedName("boosters")
    val boosters: Int,
    @field:SerializedName("cost_per_launch")
    val costPerLaunch: Long,
    @field:SerializedName("success_rate_pct")
    val successRatePct: Int,
    @field:SerializedName("first_flight")
    val firstFlight: String,
    @field:SerializedName("country")
    val country: String,
    @field:SerializedName("company")
    val company: String,
    @field:SerializedName("height")
    val height: Dimension,
    @field:SerializedName("diameter")
    val diameter: Dimension,
    @field:SerializedName("mass")
    val mass: Mass,
    @field:SerializedName("payload_weights")
    val payloadWeights: List<PayloadWeight>,
    @field:SerializedName("first_stage")
    val firstStage: FirstStage,
    @field:SerializedName("second_stage")
    val secondStage: SecondStage,
    @field:SerializedName("engines")
    val engines: Engines,
    @field:SerializedName("landing_legs")
    val landingLegs: LandingLegs,
    @field:SerializedName("wikipedia")
    val wikipedia: String,
    @field:SerializedName("description")
    val description: String,
    @field:SerializedName("rocket_id")
    val rocketId: String,
    @field:SerializedName("rocket_name")
    val rocketName: String,
    @field:SerializedName("rocket_type")
    val rocketType: String
)
