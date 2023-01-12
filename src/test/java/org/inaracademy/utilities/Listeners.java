package org.inaracademy.utilities;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.inaracademy.automationexercise.BaseTest;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {
    ExtentReports extent = ExtentReporterNG.getReportObject();
    ExtentTest test;
    ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    WebDriver driver = Driver.getDriver();

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS, "Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        extentTest.get().fail(result.getThrowable());
        String filePath = null;

            try {
                filePath = getScreenshot(result.getMethod().getMethodName(), driver);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }

            test.addScreenCaptureFromPath(filePath, result.getMethod().getMethodName());

        }

        @Override
        public void onTestSkipped (ITestResult result){

        }

        @Override
        public void onTestFailedButWithinSuccessPercentage (ITestResult result){

        }

        @Override
        public void onTestFailedWithTimeout (ITestResult result){

        }

        @Override
        public void onStart (ITestContext context){

        }

        @Override
        public void onFinish (ITestContext context){
            extent.flush();
        }
    }

