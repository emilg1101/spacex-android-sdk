package com.github.emilg1101.spacex.api.sdk

import android.content.Context
import android.os.Handler
import com.github.emilg1101.spacex.api.sdk.request.*
import okhttp3.Interceptor
import okhttp3.OkHttpClient

class SpaceX(context: Context, client: OkHttpClient = OkHttpClient()) : SpaceXApi {

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
}
