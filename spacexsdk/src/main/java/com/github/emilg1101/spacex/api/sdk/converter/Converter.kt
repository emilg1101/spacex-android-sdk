package com.github.emilg1101.spacex.api.sdk.converter

import java.lang.reflect.Type
import okhttp3.ResponseBody

interface Converter {

    fun <T> convert(responseBody: ResponseBody?, type: Type): T
}
