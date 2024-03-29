package com.github.emilg1101.spacex.api.sdk

import android.content.Context
import android.os.Handler
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
import okhttp3.Interceptor
import okhttp3.OkHttpClient

class SpaceX(context: Context, client: OkHttpClient = OkHttpClient()) :
    SpaceXApi {

    private val executor: SpaceXExecutor

    init {
        val mainHandler = Handler(context.mainLooper)
        executor = SpaceXExecutor(client, mainHandler)
    }

    class Builder(private val context: Context) {

        private val okHttpClientBuilder = OkHttpClient.Builder()

        fun addInterceptor(interceptor: Interceptor) = apply {
            okHttpClientBuilder.addInterceptor(interceptor)
        }

        fun build(): SpaceXApi {
            return SpaceX(context, okHttpClientBuilder.build())
        }
    }

    override fun allCapsules(): AllCapsulesRequest {
        return AllCapsulesRequest().apply { addExecutor(executor) }
    }

    override fun oneCapsule(serial: String): OneCapsuleRequest {
        return OneCapsuleRequest(serial).apply { addExecutor(executor) }
    }

    override fun upcomingCapsules(): UpcomingCapsulesRequest {
        return UpcomingCapsulesRequest().apply { addExecutor(executor) }
    }

    override fun pastCapsules(): PastCapsulesRequest {
        return PastCapsulesRequest().apply { addExecutor(executor) }
    }

    override fun allCores(): AllCoresRequest {
        return AllCoresRequest().apply { addExecutor(executor) }
    }

    override fun oneCore(serial: String): OneCoreRequest {
        return OneCoreRequest(serial).apply { addExecutor(executor) }
    }

    override fun upcomingCores(): UpcomingCoresRequest {
        return UpcomingCoresRequest().apply { addExecutor(executor) }
    }

    override fun pastCores(): PastCoresRequest {
        return PastCoresRequest().apply { addExecutor(executor) }
    }

    override fun allDragons(): AllDragonsRequest {
        return AllDragonsRequest().apply { addExecutor(executor) }
    }

    override fun oneDragon(id: String): OneDragonRequest {
        return OneDragonRequest(id).apply { addExecutor(executor) }
    }

    override fun allHistoricalEvents(): AllHistoricalEventsRequest {
        return AllHistoricalEventsRequest().apply { addExecutor(executor) }
    }

    override fun oneHistoricalEvent(id: Int): OneHistoricalEventsRequest {
        return OneHistoricalEventsRequest(id).apply { addExecutor(executor) }
    }

    override fun companyInfo(): CompanyInfoRequest {
        return CompanyInfoRequest().apply { addExecutor(executor) }
    }

    override fun apiInfo(): ApiInfoRequest {
        return ApiInfoRequest().apply { addExecutor(executor) }
    }

    override fun allLandingPads(): AllLandingPadsRequest {
        return AllLandingPadsRequest().apply { addExecutor(executor) }
    }

    override fun oneLandingPad(id: String): OneLandingPadRequest {
        return OneLandingPadRequest(id).apply { addExecutor(executor) }
    }

    override fun allLaunches(): AllLaunchesRequest {
        return AllLaunchesRequest().apply { addExecutor(executor) }
    }

    override fun oneLaunch(flightNumber: Int): OneLaunchRequest {
        return OneLaunchRequest(flightNumber).apply { addExecutor(executor) }
    }

    override fun pastLaunches(): PastLaunchesRequest {
        return PastLaunchesRequest().apply { addExecutor(executor) }
    }

    override fun upcomingLaunches(): UpcomingLaunchesRequest {
        return UpcomingLaunchesRequest().apply { addExecutor(executor) }
    }

    override fun latestLaunch(): LatestLaunchRequest {
        return LatestLaunchRequest().apply { addExecutor(executor) }
    }

    override fun nextLaunch(): NextLaunchRequest {
        return NextLaunchRequest().apply { addExecutor(executor) }
    }

    override fun allLaunchpads(): AllLaunchpadsRequest {
        return AllLaunchpadsRequest().apply { addExecutor(executor) }
    }

    override fun oneLaunchpad(siteId: String): OneLaunchpadRequest {
        return OneLaunchpadRequest(siteId).apply { addExecutor(executor) }
    }

    override fun allMissions(): AllMissionsRequest {
        return AllMissionsRequest().apply { addExecutor(executor) }
    }

    override fun oneMission(missionId: String): OneMissionRequest {
        return OneMissionRequest(missionId).apply { addExecutor(executor) }
    }

    override fun allPayloads(): AllPayloadsRequest {
        return AllPayloadsRequest().apply { addExecutor(executor) }
    }

    override fun onePayload(payloadId: String): OnePayloadRequest {
        return OnePayloadRequest(payloadId).apply { addExecutor(executor) }
    }

    override fun allRockets(): AllRocketsRequest {
        return AllRocketsRequest().apply { addExecutor(executor) }
    }

    override fun oneRocket(rocketId: String): OneRocketRequest {
        return OneRocketRequest(rocketId).apply { addExecutor(executor) }
    }

    override fun roadster(): RoadsterRequest {
        return RoadsterRequest().apply { addExecutor(executor) }
    }

    override fun allShips(): AllShipsRequest {
        return AllShipsRequest().apply { addExecutor(executor) }
    }

    override fun oneShip(shipId: String): OneShipRequest {
        return OneShipRequest(shipId).apply { addExecutor(executor) }
    }
}
