package com.github.emilg1101.spacex.api.sdk.entity.info

import com.google.gson.annotations.SerializedName

data class CompanyInfo(
    @field:SerializedName("name")
    val name: String,
    @field:SerializedName("founder")
    val founder: String,
    @field:SerializedName("founded")
    val founded: Int,
    @field:SerializedName("employees")
    val employees: Int,
    @field:SerializedName("vehicles")
    val vehicles: Int,
    @field:SerializedName("launch_sites")
    val launchSites: Int,
    @field:SerializedName("test_sites")
    val testSites: Int,
    @field:SerializedName("ceo")
    val ceo: String,
    @field:SerializedName("cto")
    val cto: String,
    @field:SerializedName("coo")
    val coo: String,
    @field:SerializedName("cto_propulsion")
    val ctoPropulsion: String,
    @field:SerializedName("headquarters")
    val headquarters: Headquarters,
    @field:SerializedName("summary")
    val summary: String
)
