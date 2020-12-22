package com.aio.tests.api;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryClass implements IRetryAnalyzer {

    private int retryCount = 3;
    private static final int maxRetryCount = 3;

    @Override
    public boolean retry(ITestResult result) {
        System.out.println("Retry " + result.toString());
        if (retryCount < maxRetryCount) {
            retryCount++;
            System.out.println("Retry count " + retryCount);
            return true;
        }
        return false;
    }
}

