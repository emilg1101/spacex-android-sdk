package com.github.emilg1101.spacex.api.sdk

abstract class SpaceXOutputControlRequest<T> : SpaceXRequest<T>() {

    var limit: Int? = null
    var offset: Int? = null
    var sort: String? = null
    var order: String? = null

    override fun onStartExecute() {
        super.onStartExecute()
        limit?.let { addParam("limit", it) }
        offset?.let { addParam("offset", it) }
        sort?.let { addParam("sort", it) }
        order?.let { addParam("order", it) }
    }
}
