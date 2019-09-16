package com.github.emilg1101.spacex.sdk.sample

import android.content.Context
import com.github.emilg1101.spacex.api.sdk.SpaceX
import org.junit.Assert
import org.junit.Test
import org.mockito.Mockito

class CompanyInfoRequestsTest {

    private val context: Context = Mockito.mock(Context::class.java)

    @Test
    fun sync_companyInfo() {
        val api = SpaceX.Builder(context).build()
        val response = api.companyInfo().execute()
        Assert.assertEquals("SpaceX", response.name)
    }
}
