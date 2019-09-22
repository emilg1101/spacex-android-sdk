package com.github.emilg1101.spacex.api.sdk.rx

import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo
import io.reactivex.Single
import com.github.emilg1101.spacex.api.sdk.SpaceXApi as SpaceXSdk

class RxSpaceX(private val api: SpaceXSdk) : SpaceXApi {

    override fun companyInfo(): Single<CompanyInfo> {
        return Single.fromCallable { api.companyInfo().execute() }
    }
}
