package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountDeletedPage extends BasePage{
    @FindBy(xpath = "//h2[@data-qa='account-deleted']")
    WebElement accountDeletedMessage;
    @FindBy(xpath = "//a[@data-qa='continue-button']")
    WebElement continueButton;

    public boolean isAccountDeletedMessageVisible(){
        return  accountDeletedMessage.isDisplayed();
    }
    public void clickToContinueButton(){
        continueButton.click();
    }
}
