package com.github.emilg1101.spacex.api.sdk

import com.github.emilg1101.spacex.api.sdk.request.*

interface SpaceXApi {

    fun allCapsules(): AllCapsulesRequest

    fun oneCapsule(serial: String): OneCapsuleRequest

    fun upcomingCapsules(): UpcomingCapsulesRequest

    fun pastCapsules(): PastCapsulesRequest

    fun allCores(): AllCoresRequest

    fun oneCore(serial: String): OneCoreRequest

    fun upcomingCores(): UpcomingCoresRequest

    fun pastCores(): PastCoresRequest

    fun allDragons(): AllDragonsRequest

    fun oneDragon(id: String): OneDragonRequest

    fun allHistoricalEvents(): AllHistoricalEventsRequest

    fun oneHistoricalEvent(id: Int): OneHistoricalEventsRequest

    fun companyInfo(): CompanyInfoRequest

    fun apiInfo(): ApiInfoRequest

    fun allLandingPads(): AllLandingPadsRequest

    fun oneLandingPad(id: String): OneLandingPadRequest

    fun allLaunches(): AllLaunchesRequest

    fun oneLaunch(flightNumber: Int): OneLaunchRequest

    fun pastLaunches(): PastLaunchesRequest

    fun upcomingLaunches(): UpcomingLaunchesRequest

    fun latestLaunch(): LatestLaunchRequest

    fun nextLaunch(): NextLaunchRequest

    fun allLaunchpads(): AllLaunchpadsRequest

    fun oneLaunchpad(siteId: String): OneLaunchpadRequest

    fun allMissions(): AllMissionsRequest

    fun oneMission(missionId: String): OneMissionRequest

    fun allPayloads(): AllPayloadsRequest

    fun onePayload(payloadId: String): OnePayloadRequest

    fun allRockets(): AllRocketsRequest

    fun oneRocket(rocketId: String): OneRocketRequest

    fun roadster(): RoadsterRequest
}
