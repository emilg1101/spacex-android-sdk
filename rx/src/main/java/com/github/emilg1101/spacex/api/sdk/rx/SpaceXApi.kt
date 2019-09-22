package com.github.emilg1101.spacex.api.sdk.rx

import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo
import io.reactivex.Single

interface SpaceXApi {

    fun companyInfo(): Single<CompanyInfo>
}
