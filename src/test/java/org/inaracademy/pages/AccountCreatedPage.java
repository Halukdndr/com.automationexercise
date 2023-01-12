package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountCreatedPage extends BasePage{
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;
    @FindBy(xpath = "//h2[@data-qa='account-created']")
    WebElement accountCreatedTitle;

    public void clickContinueButton(){
        continueButton.click();
    }
    public String getAccountCreatedTitle(){
        return accountCreatedTitle.getText();
    }
}
