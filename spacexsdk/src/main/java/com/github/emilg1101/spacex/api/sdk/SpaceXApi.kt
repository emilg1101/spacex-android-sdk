package com.github.emilg1101.spacex.api.sdk

import com.github.emilg1101.spacex.api.sdk.request.AllCapsulesRequest
import com.github.emilg1101.spacex.api.sdk.request.AllCoresRequest
import com.github.emilg1101.spacex.api.sdk.request.AllDragonsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllHistoricalEventsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllLandingPadsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllLaunchesRequest
import com.github.emilg1101.spacex.api.sdk.request.AllLaunchpadsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllMissionsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllPayloadsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllRocketsRequest
import com.github.emilg1101.spacex.api.sdk.request.AllShipsRequest
import com.github.emilg1101.spacex.api.sdk.request.ApiInfoRequest
import com.github.emilg1101.spacex.api.sdk.request.CompanyInfoRequest
import com.github.emilg1101.spacex.api.sdk.request.LatestLaunchRequest
import com.github.emilg1101.spacex.api.sdk.request.NextLaunchRequest
import com.github.emilg1101.spacex.api.sdk.request.OneCapsuleRequest
import com.github.emilg1101.spacex.api.sdk.request.OneCoreRequest
import com.github.emilg1101.spacex.api.sdk.request.OneDragonRequest
import com.github.emilg1101.spacex.api.sdk.request.OneHistoricalEventsRequest
import com.github.emilg1101.spacex.api.sdk.request.OneLandingPadRequest
import com.github.emilg1101.spacex.api.sdk.request.OneLaunchRequest
import com.github.emilg1101.spacex.api.sdk.request.OneLaunchpadRequest
import com.github.emilg1101.spacex.api.sdk.request.OneMissionRequest
import com.github.emilg1101.spacex.api.sdk.request.OnePayloadRequest
import com.github.emilg1101.spacex.api.sdk.request.OneRocketRequest
import com.github.emilg1101.spacex.api.sdk.request.OneShipRequest
import com.github.emilg1101.spacex.api.sdk.request.PastCapsulesRequest
import com.github.emilg1101.spacex.api.sdk.request.PastCoresRequest
import com.github.emilg1101.spacex.api.sdk.request.PastLaunchesRequest
import com.github.emilg1101.spacex.api.sdk.request.RoadsterRequest
import com.github.emilg1101.spacex.api.sdk.request.UpcomingCapsulesRequest
import com.github.emilg1101.spacex.api.sdk.request.UpcomingCoresRequest
import com.github.emilg1101.spacex.api.sdk.request.UpcomingLaunchesRequest

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

    fun allShips(): AllShipsRequest

    fun oneShip(shipId: String): OneShipRequest
}
