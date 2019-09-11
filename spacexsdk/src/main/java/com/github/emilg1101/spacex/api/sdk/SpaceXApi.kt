package com.github.emilg1101.spacex.api.sdk

import com.github.emilg1101.spacex.api.sdk.request.AllHistoricalEventsRequest
import com.github.emilg1101.spacex.api.sdk.request.ApiInfoRequest
import com.github.emilg1101.spacex.api.sdk.request.CompanyInfoRequest
import com.github.emilg1101.spacex.api.sdk.request.OneHistoricalEventsRequest

interface SpaceXApi {

    fun allHistoricalEvents(): AllHistoricalEventsRequest

    fun oneHistoricalEvent(id: Int): OneHistoricalEventsRequest

    fun companyInfo(): CompanyInfoRequest

    fun apiInfo(): ApiInfoRequest
}
