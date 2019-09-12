package com.github.emilg1101.spacex.api.sdk

abstract class SpaceXOutputControlRequest<T> : SpaceXRequest<T>() {

    var limit: Int? = null
    var offset: Int? = null
    var sort: String? = null
    var order: String? = null

    override fun onStartExecute() {
        super.onStartExecute()
        addParam("limit", limit)
        addParam("offset", offset)
        addParam("sort", sort)
        addParam("order", order)
    }
}
