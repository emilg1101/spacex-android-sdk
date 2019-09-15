package com.github.emilg1101.spacex.api.sdk.entity.launches

import com.google.gson.annotations.SerializedName

data class Links(
    @field:SerializedName("mission_patch")
    val missionPatch: String?,
    @field:SerializedName("mission_patch_small")
    val missionPatchSmall: String?,
    @field:SerializedName("reddit_campaign")
    val redditCampaign: String?,
    @field:SerializedName("reddit_launch")
    val redditLaunch: String?,
    @field:SerializedName("reddit_recovery")
    val redditRecovery: String?,
    @field:SerializedName("reddit_media")
    val redditMedia: String?,
    @field:SerializedName("presskit")
    val presskit: String?,
    @field:SerializedName("article_link")
    val articleLink: String?,
    @field:SerializedName("wikipedia")
    val wikipedia: String?,
    @field:SerializedName("video_link")
    val videoLink: String?,
    @field:SerializedName("youtube_id")
    val youtubeId: String?,
    @field:SerializedName("flickr_images")
    val flickrImages: List<String>,
    @field:SerializedName("article")
    val article: String?,
    @field:SerializedName("reddit")
    val reddit: String?
)
