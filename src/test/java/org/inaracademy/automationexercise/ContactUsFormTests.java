package org.inaracademy.automationexercise;

import org.inaracademy.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ContactUsFormTests extends BaseTest{
    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_06_ContactUsForm(){
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 06 -  Verify that home page is visible successfully");

        //Click on 'Contact Us' button
        pages.getHeader().clickToContactUsButton();

        //Verify 'GET IN TOUCH' is visible
        boolean isVisibleGetInTouchTitle = pages.getContactUsPage().isVisibleGetInTouchTitle();
        softAssert.assertTrue(isVisibleGetInTouchTitle , "ERROR : Test Case 06 -  Verify 'GET IN TOUCH' is visible");

        //Enter name, email, subject and message
        //UPLOAD NEEDED -------------------------------------------------


    }


}
