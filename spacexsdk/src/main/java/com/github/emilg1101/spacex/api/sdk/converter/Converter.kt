package com.github.emilg1101.spacex.api.sdk.converter

import okhttp3.ResponseBody
import java.lang.reflect.Type

interface Converter {

    fun<T> convert(responseBody: ResponseBody?, type: Type): T
}
