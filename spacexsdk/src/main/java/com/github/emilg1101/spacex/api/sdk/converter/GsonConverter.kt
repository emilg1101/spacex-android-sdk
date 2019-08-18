package com.github.emilg1101.spacex.api.sdk.converter

import com.google.gson.Gson
import okhttp3.ResponseBody
import java.lang.reflect.Type

class GsonConverter : Converter {

    private val gson = Gson()

    override fun <T> convert(responseBody: ResponseBody?, type: Type): T {
        return gson.fromJson(responseBody?.string(), type)
    }
}
