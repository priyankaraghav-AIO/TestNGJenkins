package com.aio.tests.tng;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1156Tests {
    @Test
    public void skippedTest() {
        System.out.println("This doesn't get executed");
    }

    @Test
    public void initEnvironment() {
        Assert.fail("Server didn't start");
    }
}
