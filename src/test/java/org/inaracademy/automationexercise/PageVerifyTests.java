package org.inaracademy.automationexercise;

import org.inaracademy.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class PageVerifyTests extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_07_VerifyTestCasesPage(){
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 07 -  Verify that home page is visible successfully");

        // Click on 'Test Cases' button
        pages.getHeader().clickToTestCasesButton();

        //Verify user is navigated to test cases page successfully
        String testCasesPageUrl = pages.getTestCasesPage().getUrl();
        Assert.assertEquals(testCasesPageUrl , "https://automationexercise.com/test_cases" , "Test Case 07 - Verify user is navigated to test cases page successfully");
    }
}
