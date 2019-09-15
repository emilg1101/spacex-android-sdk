package com.github.emilg1101.spacex.api.sdk.entity.ships

import com.google.gson.annotations.SerializedName

data class Ship(
    @field:SerializedName("ship_id")
    val shipId: String,
    @field:SerializedName("ship_name")
    val shipName: String,
    @field:SerializedName("ship_model")
    val shipModel: String,
    @field:SerializedName("ship_type")
    val shipType: String,
    @field:SerializedName("roles")
    val roles: List<String>,
    @field:SerializedName("active")
    val active: Boolean,
    @field:SerializedName("imo")
    val imo: Int,
    @field:SerializedName("mmsi")
    val mmsi: Int,
    @field:SerializedName("abs")
    val abs: Int,
    @field:SerializedName("class")
    val shipClass: Int,
    @field:SerializedName("weight_lbs")
    val weightLbs: Int,
    @field:SerializedName("weight_kg")
    val weightKg: Int,
    @field:SerializedName("year_built")
    val yearBuilt: Int,
    @field:SerializedName("home_port")
    val homePort: String,
    @field:SerializedName("status")
    val status: String,
    @field:SerializedName("speed_kn")
    val speedKn: Int,
    @field:SerializedName("course_deg")
    val courseDeg: String,
    @field:SerializedName("position")
    val position: Position,
    @field:SerializedName("successful_landings")
    val successfulLandings: String,
    @field:SerializedName("attempted_landings")
    val attemptedLandings: String,
    @field:SerializedName("missions")
    val missions: List<Mission>,
    @field:SerializedName("url")
    val url: String,
    @field:SerializedName("image")
    val image: String
)
