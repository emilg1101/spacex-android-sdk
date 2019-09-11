package com.github.emilg1101.spacex.api.sdk.entity.info

import com.google.gson.annotations.SerializedName

data class ApiInfo(
    @field:SerializedName("project_name")
    val projectName: String,
    @field:SerializedName("version")
    val version: String,
    @field:SerializedName("project_link")
    val projectLink: String,
    @field:SerializedName("organization")
    val organization: String,
    @field:SerializedName("organization_link")
    val organizationLink: String,
    @field:SerializedName("description")
    val description: String
)
