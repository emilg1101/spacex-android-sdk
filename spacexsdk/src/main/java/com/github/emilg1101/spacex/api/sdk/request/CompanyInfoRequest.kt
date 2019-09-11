package com.github.emilg1101.spacex.api.sdk.request

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo

class CompanyInfoRequest : SpaceXRequest<CompanyInfo>() {

    override val method: String = "info"
}
