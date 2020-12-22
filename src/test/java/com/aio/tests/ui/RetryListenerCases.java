package com.aio.tests.ui;

import com.aio.tests.api.RetryClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryListenerCases {

    @Test(retryAnalyzer = RetryClass.class, groups = "NUT-TC-19")
    public void retriedCase() {
        Assert.fail();
    }

    @Test(retryAnalyzer = RetryClass.class)
    public void retriedPassCase() {
        Assert.assertTrue(true);
    }
}
