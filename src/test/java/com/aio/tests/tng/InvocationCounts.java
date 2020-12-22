package com.aio.tests.tng;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Random;

public class InvocationCounts {
    @Test(invocationCount = 10, groups = {"NUT-TC-1802"})
    public void multipleInvocationCount() {
        Random r = new Random();
        int a = r.nextInt();
        Assert.assertTrue((a % 2) == 0);
    }
}
