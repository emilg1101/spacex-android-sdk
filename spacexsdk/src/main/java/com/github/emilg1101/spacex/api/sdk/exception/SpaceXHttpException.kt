package com.github.emilg1101.spacex.api.sdk.exception

class SpaceXHttpException(code: Int, message: String) : SpaceXException("$code $message")
