package com.github.emilg1101.spacex.sdk.sample

import androidx.test.platform.app.InstrumentationRegistry
import com.github.emilg1101.spacex.api.sdk.SpaceX
import com.github.emilg1101.spacex.api.sdk.SpaceXApi
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class InfoRequestsInstrumentedTest {

    private lateinit var api: SpaceXApi

    @Before
    fun setup() {
        val context = InstrumentationRegistry.getInstrumentation().context
        api = SpaceX(context)
    }

    @Test
    fun sync_receivingCompanyInfo() {
        val companyInfo = api.companyInfo().execute()
        Assert.assertEquals("SpaceX", companyInfo.name)
    }

    @Test
    fun sync_receivingApiInfo() {
        val apiInfo = api.apiInfo().execute()
        Assert.assertEquals("SpaceX-API", apiInfo.projectName)
    }
}
