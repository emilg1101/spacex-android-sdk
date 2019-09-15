package com.github.emilg1101.spacex.api.sdk.request

class UpcomingLaunchesRequest : AllLaunchesRequest() {

    override val method = "${super.method}/upcoming"
}
