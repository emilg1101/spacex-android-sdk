package com.github.emilg1101.spacex.api.sdk.converter

import com.google.gson.Gson
import java.lang.reflect.Type
import okhttp3.ResponseBody

class GsonConverter : Converter {

    private val gson = Gson()

    override fun <T> convert(responseBody: ResponseBody?, type: Type): T {
        return gson.fromJson(responseBody?.string(), type)
    }
}
