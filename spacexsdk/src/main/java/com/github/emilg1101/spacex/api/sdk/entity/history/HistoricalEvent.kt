package com.github.emilg1101.spacex.api.sdk.entity.history

import com.google.gson.annotations.SerializedName
import java.util.Date

data class HistoricalEvent(
    @field:SerializedName("id")
    val id: Int,
    @field:SerializedName("title")
    val title: String,
    @field:SerializedName("event_date_utc")
    val eventDateUtc: Date,
    @field:SerializedName("event_date_unix")
    val eventDateUnix: Long,
    @field:SerializedName("flight_number")
    val flightNumber: Int?,
    @field:SerializedName("details")
    val details: String,
    @field:SerializedName("links")
    val links: Links
)
