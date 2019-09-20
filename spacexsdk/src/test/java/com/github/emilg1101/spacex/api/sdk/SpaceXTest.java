package com.github.emilg1101.spacex.api.sdk;

import android.content.Context;

import com.github.emilg1101.spacex.api.sdk.entity.capsules.Capsule;
import com.github.emilg1101.spacex.api.sdk.entity.info.ApiInfo;
import com.github.emilg1101.spacex.api.sdk.entity.info.CompanyInfo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class SpaceXTest {

    @Mock
    Context context;

    private SpaceXApi api;

    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
        api = new SpaceX.Builder(context)
                .addInterceptor(
                        chain -> chain.proceed(chain.request())
                )
                .build();
    }

    @Test
    public void allCapsules() {
        List<? extends Capsule> capsules = api.allCapsules().execute();
        Assert.assertNotNull(capsules);
        Assert.assertNotEquals(0, capsules.size());
    }

    @Test
    public void oneCapsule() {
        Capsule capsule = api.oneCapsule("C101").execute();
        Assert.assertNotNull(capsule);
        Assert.assertEquals("C101", capsule.getCapsuleSerial());
    }

    @Test
    public void companyInfo() {
        CompanyInfo info = api.companyInfo().execute();
        Assert.assertNotNull(info);
        Assert.assertEquals("SpaceX", info.getName());
    }

    @Test
    public void apiInfo() {
        ApiInfo info = api.apiInfo().execute();
        Assert.assertNotNull(info);
        Assert.assertEquals("SpaceX-API", info.getProjectName());
    }
}
