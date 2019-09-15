package com.github.emilg1101.spacex.api.sdk.request

class PastLaunchesRequest : AllLaunchesRequest() {

    override val method = "${super.method}/past"
}
