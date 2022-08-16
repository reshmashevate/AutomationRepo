package testng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class ExampleIRetry implements IRetryAnalyzer {
    int retryCount = 0;
    int maxRetryCount = 2;

    public boolean retry(ITestResult iTestResult) {
        if(retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }
}
