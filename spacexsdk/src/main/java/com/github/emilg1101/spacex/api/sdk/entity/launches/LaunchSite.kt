package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class LaunchSite(
    @field:SerializedName("site_id")
    val siteId: String,
    @field:SerializedName("site_name")
    val siteName: String,
    @field:SerializedName("site_name_long")
    val siteNameLong: String
)
