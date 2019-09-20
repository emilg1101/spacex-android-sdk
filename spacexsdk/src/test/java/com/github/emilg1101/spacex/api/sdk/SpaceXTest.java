package com.github.emilg1101.spacex.api.sdk;

import android.content.Context;

import com.github.emilg1101.spacex.api.sdk.entity.info.ApiInfo;
import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SpaceXTest {

    @Mock
    Context context;

    private SpaceXApi api;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        api = new SpaceX.Builder(context).build();
    }

    @Test
    public void companyInfo() {
        CompanyInfo info = api.companyInfo().execute();
        Assert.assertEquals("SpaceX", info.getName());
    }

    @Test
    public void apiInfo() {
        ApiInfo info = api.apiInfo().execute();
        Assert.assertEquals("SpaceX-API", info.getProjectName());
    }
}
