package com.github.emilg1101.spacex.api.sdk.exception

import com.github.emilg1101.spacex.api.sdk.SpaceXRequest
import java.lang.reflect.Type

class SpaceXConvertException(type: Type, request: SpaceXRequest<*>) :
    SpaceXException("Error converting JSON object to $type in $request")
