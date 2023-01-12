package org.inaracademy.automationexercise;

import org.inaracademy.utilities.BrowserUtils;
import org.inaracademy.utilities.Driver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTests extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_2_LoginUserWithCorrectEmailAndPassword() throws InterruptedException {

        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 02 -  Verify that home page is visible successfully");

        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();

        //Verify 'Login to your account' is visible
        String loginToYourAccountMessage = pages.getLoginPage().getLoginToYourAccountMessage();
        softAssert.assertEquals(loginToYourAccountMessage , "Login to your account" , "ERROR : Test Case 05 - Verify 'Login to your account' is visible ");

        //Enter correct email address and password and Click 'login' button
        pages.getLoginPage().setLoginEmailAddress("oguzz@oguz.com");
        pages.getLoginPage().setLoginPassword("asdasdasd");
        pages.getLoginPage().clickToLoginButton();

        //Verify that 'Logged in as username' is visible
        boolean isVisibleLoggedInAsUsername = pages.getHeader().isVisibleLoggedInAsUsernameSection();
        softAssert.assertTrue(isVisibleLoggedInAsUsername , "ERROR : Test Case 02 - Verify that 'Logged in as username' is visible");

        //Click 'Delete Account' button
        pages.getHeader().clickToDeleteAccountButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Verify that 'ACCOUNT DELETED!' is visible
        boolean isAccountDeletedMessageVisible = pages.getAccountDeletedPage().isAccountDeletedMessageVisible();
        softAssert.assertTrue(isAccountDeletedMessageVisible ,"ERROR : Test Case 02 - Verify that 'ACCOUNT DELETED!' is visible" );

        softAssert.assertAll();
    }
    @Test
    public void testCase_3_LoginUserWithIncorrectEmailAndPassword() throws InterruptedException {
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully

        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 03 -  Verify that home page is visible successfully");

        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();

        //Verify 'Login to your account' is visible
        String loginToYourAccountMessage = pages.getLoginPage().getLoginToYourAccountMessage();
        softAssert.assertEquals(loginToYourAccountMessage , "Login to your account" , "ERROR : Test Case 03 - Verify 'Login to your account' is visible ");

        //Enter incorrect email address and password and Click 'login' button
        pages.getLoginPage().setLoginEmailAddress("oguzzz@oguz.com");
        pages.getLoginPage().setLoginPassword("asdasdasd");
        pages.getLoginPage().clickToLoginButton();

        //Verify error 'Your email or password is incorrect!' is visible
        boolean isDisplayedYourEmailOrPasswordIncorrectMessage = pages.getLoginPage().isDisplayedYourEmailOrPasswordIncorrectMessage();
        softAssert.assertTrue(isDisplayedYourEmailOrPasswordIncorrectMessage , "ERROR : Test Case 03 - Verify error 'Your email or password is incorrect!' is visible");

        softAssert.assertAll();
    }
    @Test
    public void testCase_4_LogOutUser() throws InterruptedException {

        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 04 -  Verify that home page is visible successfully");

        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();

        //Verify 'Login to your account' is visible
        String loginToYourAccountMessage = pages.getLoginPage().getLoginToYourAccountMessage();
        softAssert.assertEquals(loginToYourAccountMessage , "Login to your account" , "ERROR : Test Case 04 - Verify 'Login to your account' is visible ");

        //Enter correct email address and password and Click 'login' button
        pages.getLoginPage().setLoginEmailAddress("oguzz@oguz.com");
        pages.getLoginPage().setLoginPassword("asdasdasd");
        pages.getLoginPage().clickToLoginButton();

        //Verify that 'Logged in as username' is visible
        boolean isVisibleLoggedInAsUsername = pages.getHeader().isVisibleLoggedInAsUsernameSection();
        softAssert.assertTrue(isVisibleLoggedInAsUsername , "ERROR : Test Case 04 - Verify that 'Logged in as username' is visible");

        //Click 'Logout' button
        pages.getHeader().clickToLogOutButton();

        //Verify that user is navigated to login page
        String currentPageUrl = Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(currentPageUrl , "https://automationexercise.com/login" , "ERROR : Test Case 04 - Verify that user is navigated to login page");

        softAssert.assertAll();
    }
}
