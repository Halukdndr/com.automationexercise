package cucumber.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.inaracademy.automationexercise.BaseTest;
import org.inaracademy.utilities.BrowserUtils;
import org.inaracademy.utilities.Driver;
import org.testng.Assert;

public class LoginTestsStepDefinition extends BaseTest {

    @Given("Landed on web page")
    public void LandedOnWebPage(){
        setUpSuite();
    }
    @Then("Verified if home page is displayed successfully")
    public void verify_if_homePage_isDisplayed_Successfully(){
        Assert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 05 -  Verify that home page is visible successfully");
    }
    @Given("The user is  on the login page")
    public void the_User_isOn_The_LoginPage() throws InterruptedException {
        //Click on 'Signup / Login' button
        pages.getHeader().goToLoginPage();
    }
    @Then("The user verifies if {string} message displayed on LoginPage")
    public void theUserVerifiesIfMessageDisplayedOnLoginPage(String message){
        //Verify 'Login to your account' is visible
        String loginToYourAccountMessage = pages.getLoginPage().getLoginToYourAccountMessage();
        Assert.assertEquals(loginToYourAccountMessage , message, "ERROR : Test Case 05 - Verify 'Login to your account' is visible ");
    }
    @When("^The user enter correct email (.+) address and password (.+)$")
    public void userEntersCorrectEmailAndPassword(String email , String password){
        //Enter correct email address and password and Click 'login' button
        pages.getLoginPage().setLoginEmailAddress(email);
        pages.getLoginPage().setLoginPassword(password);
    }
    @When("Click to the login button")
    public void clickToTheLoginButton(){
        pages.getLoginPage().clickToLoginButton();
    }
    @Then("The user verifies that Logged in as username is visible")
    public void verifyIfLoggedInMessageVisible(){
        //Verify that 'Logged in as username' is visible
        boolean isVisibleLoggedInAsUsername = pages.getHeader().isVisibleLoggedInAsUsernameSection();
        Assert.assertTrue(isVisibleLoggedInAsUsername , "ERROR : Test Case 05 - Verify that 'Logged in as username' is visible");

    }
    @When("The user clicks Delete Account button")
    public void the_user_licks_delete_account_button()  {
        //Click 'Delete Account' button
        pages.getHeader().clickToDeleteAccountButton();
        BrowserUtils.navigateBackAndForwardToDismissAds();
    }

    @Then("The User verifies that {string} is visible")
    public void the_user_verifies_that_something_is_visible(String message)  {
        //Verify that 'ACCOUNT DELETED!' is visible
        boolean isAccountDeletedMessageVisible = pages.getAccountDeletedPage().isAccountDeletedMessageVisible();
        Assert.assertTrue(isAccountDeletedMessageVisible ,"ERROR : Test Case 05 - Verify that 'ACCOUNT DELETED!' is visible" );
    }
    @Then("The user verifies that {string} is visible")
    public void the_user_verifies_that_incorrect_email_or_password_message_is_visible(String incorrectEmailOrPasswordMessage)  {
        //Verify error 'Your email or password is incorrect!' is visible
        boolean isDisplayedYourEmailOrPasswordIncorrectMessage = pages.getLoginPage().isDisplayedYourEmailOrPasswordIncorrectMessage();
        Assert.assertTrue(isDisplayedYourEmailOrPasswordIncorrectMessage , "ERROR : Test Case 05 - Verify error 'Your email or password is incorrect!' is visible");
    }


}
