package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css="input[data-qa='login-email']")
    private WebElement loginEmailBox;
    @FindBy(css="input[data-qa='login-password']")
    private WebElement loginPasswordBox;
    @FindBy(css="button[data-qa='login-button']")
    private WebElement loginButton;
    @FindBy(css=".signup-form h2")
    private WebElement signUpMessage;
    @FindBy(xpath = "//*[@data-qa='signup-name']")
    private WebElement signupNewUserNameBox;
    @FindBy(xpath = "//*[@data-qa='signup-email']")
    private WebElement signupEmailAddressBox;
    @FindBy(xpath = "//*[@data-qa='signup-button']")
    private WebElement signUpButton;
    @FindBy(css = "form p")
    private WebElement emailAlreadyExistMessage;
    @FindBy(css = ".login-form h2")
    private WebElement loginToYourAccountMessage;
    @FindBy(css = "form[action='/login'] p")
    private WebElement yourEmailOrPasswordIncorrectMessage;

    public void setLoginEmailAddress(String emailAdress){
        loginEmailBox.sendKeys(emailAdress);
    }
    public void setLoginPassword(String password){
        loginPasswordBox.sendKeys(password);
    }
    public void clickToLoginButton(){
        loginButton.click();
    }
    public String getSignUpMessage(){
        return signUpMessage.getText();
    }
    public void clickSignupButton() {
        signUpButton.click();
    }
    public void setSignupNewUserName(String newUserName) {
        signupNewUserNameBox.sendKeys(newUserName);
    }
    public void setSignupEmailAddressBox(String emailAddress) {
        signupEmailAddressBox.sendKeys(emailAddress);
    }
    public String getEmailAlreadyExistsMessage(){
        return emailAlreadyExistMessage.getText();
    }
    public String getLoginToYourAccountMessage(){
        return loginToYourAccountMessage.getText();
    }
    public boolean isDisplayedYourEmailOrPasswordIncorrectMessage(){
        return yourEmailOrPasswordIncorrectMessage.isDisplayed();
    }
}
