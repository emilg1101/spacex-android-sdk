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
import com.github.emilg1101.spacex.api.sdk.SpaceXApi as SpaceXSdk

class RxSpaceX(private val api: SpaceXSdk) : SpaceXApi {

    override fun allCapsules(): Single<List<Capsule>> {
        return Single.fromCallable { api.allCapsules().execute() }
    }

    override fun oneCapsule(serial: String): Single<Capsule> {
        return Single.fromCallable { api.oneCapsule(serial).execute() }
    }

    override fun upcomingCapsules(): Single<List<Capsule>> {
        return Single.fromCallable { api.upcomingCapsules().execute() }
    }

    override fun pastCapsules(): Single<List<Capsule>> {
        return Single.fromCallable { api.pastCapsules().execute() }
    }

    override fun allCores(): Single<List<Core>> {
        return Single.fromCallable { api.allCores().execute() }
    }

    override fun oneCore(serial: String): Single<Core> {
        return Single.fromCallable { api.oneCore(serial).execute() }
    }

    override fun upcomingCores(): Single<List<Core>> {
        return Single.fromCallable { api.upcomingCores().execute() }
    }

    override fun pastCores(): Single<List<Core>> {
        return Single.fromCallable { api.pastCores().execute() }
    }

    override fun allDragons(): Single<List<Dragon>> {
        return Single.fromCallable { api.allDragons().execute() }
    }

    override fun oneDragon(id: String): Single<Dragon> {
        return Single.fromCallable { api.oneDragon(id).execute() }
    }

    override fun allHistoricalEvents(): Single<List<HistoricalEvent>> {
        return Single.fromCallable { api.allHistoricalEvents().execute() }
    }

    override fun oneHistoricalEvent(id: Int): Single<HistoricalEvent> {
        return Single.fromCallable { api.oneHistoricalEvent(id).execute() }
    }

    override fun companyInfo(): Single<CompanyInfo> {
        return Single.fromCallable { api.companyInfo().execute() }
    }

    override fun apiInfo(): Single<ApiInfo> {
        return Single.fromCallable { api.apiInfo().execute() }
    }

    override fun allLandingPads(): Single<List<LandingPad>> {
        return Single.fromCallable { api.allLandingPads().execute() }
    }

    override fun oneLandingPad(id: String): Single<LandingPad> {
        return Single.fromCallable { api.oneLandingPad(id).execute() }
    }

    override fun allLaunches(): Single<List<Launch>> {
        return Single.fromCallable { api.allLaunches().execute() }
    }

    override fun oneLaunch(flightNumber: Int): Single<Launch> {
        return Single.fromCallable { api.oneLaunch(flightNumber).execute() }
    }

    override fun pastLaunches(): Single<List<Launch>> {
        return Single.fromCallable { api.pastLaunches().execute() }
    }

    override fun upcomingLaunches(): Single<List<Launch>> {
        return Single.fromCallable { api.upcomingLaunches().execute() }
    }

    override fun latestLaunch(): Single<Launch> {
        return Single.fromCallable { api.latestLaunch().execute() }
    }

    override fun nextLaunch(): Single<Launch> {
        return Single.fromCallable { api.nextLaunch().execute() }
    }

    override fun allLaunchpads(): Single<List<LaunchPad>> {
        return Single.fromCallable { api.allLaunchpads().execute() }
    }

    override fun oneLaunchpad(siteId: String): Single<LaunchPad> {
        return Single.fromCallable { api.oneLaunchpad(siteId).execute() }
    }

    override fun allMissions(): Single<List<Mission>> {
        return Single.fromCallable { api.allMissions().execute() }
    }

    override fun oneMission(missionId: String): Single<Mission> {
        return Single.fromCallable { api.oneMission(missionId).execute() }
    }

    override fun allPayloads(): Single<List<Payload>> {
        return Single.fromCallable { api.allPayloads().execute() }
    }

    override fun onePayload(payloadId: String): Single<Payload> {
        return Single.fromCallable { api.onePayload(payloadId).execute() }
    }

    override fun allRockets(): Single<List<Rocket>> {
        return Single.fromCallable { api.allRockets().execute() }
    }

    override fun oneRocket(rocketId: String): Single<Rocket> {
        return Single.fromCallable { api.oneRocket(rocketId).execute() }
    }

    override fun roadster(): Single<Roadster> {
        return Single.fromCallable { api.roadster().execute() }
    }

    override fun allShips(): Single<List<Ship>> {
        return Single.fromCallable { api.allShips().execute() }
    }

    override fun oneShip(shipId: String): Single<Ship> {
        return Single.fromCallable { api.oneShip(shipId).execute() }
    }
}
