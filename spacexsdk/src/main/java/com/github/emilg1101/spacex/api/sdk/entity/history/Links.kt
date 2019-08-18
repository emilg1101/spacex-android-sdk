package com.github.emilg1101.spacex.api.sdk.entity.history

import com.google.gson.annotations.SerializedName

data class Links(
    @field:SerializedName("reddit")
    val reddit: String?,
    @field:SerializedName("article")
    val article: String?,
    @field:SerializedName("wikipedia")
    val wikipedia: String?
)
