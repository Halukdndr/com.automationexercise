package org.inaracademy.automationexercise;

import org.inaracademy.utilities.BrowserUtils;
import org.inaracademy.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegistirationTests extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_1_Register_User() throws InterruptedException {

        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();

        //Get signUp message.
        String newUserInputMessage = pages.getLoginPage().getSignUpMessage();

        //Verify 'New User Signup!' is visible
        softAssert.assertEquals(newUserInputMessage , "New User Signup!" , "Test Case 01 - Verify 'New User Signup!' is visible");

        //Enter name and email
        pages.getLoginPage().setSignupNewUserName("Oggusuz");
        pages.getLoginPage().setSignupEmailAddressBox("aoggsuuzz@ogguz.com");

        //Click sign up button
        pages.getLoginPage().clickSignupButton();

        // Verify that 'ENTER ACCOUNT INFORMATION' is visible
        String actualEnterAccountInformationTitle = pages.getSignupPage().getEnterAccountInformationTitle();
        Assert.assertEquals(actualEnterAccountInformationTitle , "ENTER ACCOUNT INFORMATION" , "ERROR : Test Case 01 - Verify that 'ENTER ACCOUNT INFORMATION' is visible");

        // Fill details: Title, Name, Email, Password, Date of birth
        pages.getSignupPage().selectTitleWomen();
        pages.getSignupPage().setPassword("asdasdasd");
        pages.getSignupPage().setDateOfBirt("12", "April", "1945");

        //Select checkboxes 'Sign up for our newsletter!' and 'Receive special offers from our partners!'
        pages.getSignupPage().selectNewsLetterBox();
        pages.getSignupPage().selectReciveSpecialOffersBox();

        //Fill details: First name, Last name, Company, Address, Address2, Country, State, City, Zipcode, Mobile Number
        pages.getSignupPage().setFirstNameBox("Oguz");
        pages.getSignupPage().setLastNameBox("Han");
        pages.getSignupPage().setCompanyBox("OGZ");
        pages.getSignupPage().setAddress1Box("Adres1 adres1 adres1");
        pages.getSignupPage().setAddress2Box("Adres2 adres2 adres2");
        pages.getSignupPage().selectCountry("Canada");
        pages.getSignupPage().setStateBox("State111");
        pages.getSignupPage().setCityBox("Toronto");
        pages.getSignupPage().setZipCodeBox("11223322");
        pages.getSignupPage().setMobileNumberBox("1234435435");

        //Click 'Create Account button'
        pages.getSignupPage().clickToCreateAccountButton();

        //Verify that 'ACCOUNT CREATED!' is visible
        String actualAccountCreatedTitle = pages.getAccountCreatedPage().getAccountCreatedTitle();
        softAssert.assertEquals(actualAccountCreatedTitle , "ACCOUNT CREATED!" , "ERROR : Test Case 01 - Verify that 'ACCOUNT CREATED!' is visible");

        //Click 'Continue' button
        pages.getAccountCreatedPage().clickContinueButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Verify that 'Logged in as username' is visible
        boolean isLoggedInAsUsernameVisible = pages.getHeader().isVisibleLoggedInAsUsernameSection();
        softAssert.assertTrue(isLoggedInAsUsernameVisible, "ERROR : Test Case 01 -  Verify that 'Logged in as username' is visible");

        //Click 'Delete Account' button
        pages.getHeader().clickToDeleteAccountButton();

        //Verify that 'ACCOUNT DELETED!' is visible and click 'Continue' button
        boolean isAccountDeletedMessageDisplayed = pages.getAccountDeletedPage().isAccountDeletedMessageVisible();
        softAssert.assertTrue(isAccountDeletedMessageDisplayed , "ERROR : Test Case 01 -  Verify that 'ACCOUNT DELETED!' is visible");
        pages.getAccountDeletedPage().clickToContinueButton();

        softAssert.assertAll();
    }
    @Test
    public void testCase_05_RegisterUserWithExistingEmail() throws InterruptedException {

        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 05 -  Verify that home page is visible successfully");

        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();

        //Get signUp message.
        String newUserInputMessage = pages.getLoginPage().getSignUpMessage();

        //Verify 'New User Signup!' is visible
        softAssert.assertEquals(newUserInputMessage , "New User Signup!" , "Test Case 05 - Verify 'New User Signup!' is visible");

        //Enter name and already registered email address
        pages.getLoginPage().setSignupNewUserName("Oguz");
        pages.getLoginPage().setSignupEmailAddressBox("oguz@oguz.com");

        //Click sign up button
        pages.getLoginPage().clickSignupButton();

        //Verify error 'Email Address already exist!' is visible
        String emailAlreadyExistsMessage = pages.getLoginPage().getEmailAlreadyExistsMessage();
        softAssert.assertEquals(emailAlreadyExistsMessage ,"Email Address already exist!" ,"Test Case 05 - Verify 'New User Signup!' is visible" );

        softAssert.assertAll();
    }
}
