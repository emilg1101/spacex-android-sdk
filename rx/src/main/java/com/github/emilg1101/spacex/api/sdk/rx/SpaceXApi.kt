package com.github.emilg1101.spacex.api.sdk.rx

import com.github.emilg1101.spacex.api.sdk.entity.capsules.Capsule
import com.github.emilg1101.spacex.api.sdk.entity.cores.Core
import com.github.emilg1101.spacex.api.sdk.entity.dragons.Dragon
import com.github.emilg1101.spacex.api.sdk.entity.history.HistoricalEvent
import com.github.emilg1101.spacex.api.sdk.entity.info.ApiInfo
import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo
import com.github.emilg1101.spacex.api.sdk.entity.launches.Launch
import com.github.emilg1101.spacex.api.sdk.entity.missions.Mission
import com.github.emilg1101.spacex.api.sdk.entity.pads.LandingPad
import com.github.emilg1101.spacex.api.sdk.entity.pads.LaunchPad
import com.github.emilg1101.spacex.api.sdk.entity.payloads.Payload
import com.github.emilg1101.spacex.api.sdk.entity.roadster.Roadster
import com.github.emilg1101.spacex.api.sdk.entity.rockets.Rocket
import com.github.emilg1101.spacex.api.sdk.entity.ships.Ship
import io.reactivex.Single

interface SpaceXApi {

    fun allCapsules(): Single<List<Capsule>>

    fun oneCapsule(serial: String): Single<Capsule>

    fun upcomingCapsules(): Single<List<Capsule>>

    fun pastCapsules(): Single<List<Capsule>>

    fun allCores(): Single<List<Core>>

    fun oneCore(serial: String): Single<Core>

    fun upcomingCores(): Single<List<Core>>

    fun pastCores(): Single<List<Core>>

    fun allDragons(): Single<List<Dragon>>

    fun oneDragon(id: String): Single<Dragon>

    fun allHistoricalEvents(): Single<List<HistoricalEvent>>

    fun oneHistoricalEvent(id: Int): Single<HistoricalEvent>

    fun companyInfo(): Single<CompanyInfo>

    fun apiInfo(): Single<ApiInfo>

    fun allLandingPads(): Single<List<LandingPad>>

    fun oneLandingPad(id: String): Single<LandingPad>

    fun allLaunches(): Single<List<Launch>>

    fun oneLaunch(flightNumber: Int): Single<Launch>

    fun pastLaunches(): Single<List<Launch>>

    fun upcomingLaunches(): Single<List<Launch>>

    fun latestLaunch(): Single<Launch>

    fun nextLaunch(): Single<Launch>

    fun allLaunchpads(): Single<List<LaunchPad>>

    fun oneLaunchpad(siteId: String): Single<LaunchPad>

    fun allMissions(): Single<List<Mission>>

    fun oneMission(missionId: String): Single<Mission>

    fun allPayloads(): Single<List<Payload>>

    fun onePayload(payloadId: String): Single<Payload>

    fun allRockets(): Single<List<Rocket>>

    fun oneRocket(rocketId: String): Single<Rocket>

    fun roadster(): Single<Roadster>

    fun allShips(): Single<List<Ship>>

    fun oneShip(shipId: String): Single<Ship>
}
