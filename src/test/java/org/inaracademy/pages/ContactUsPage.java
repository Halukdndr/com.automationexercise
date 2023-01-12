package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage {
    @FindBy(css = ".col-sm-8 h2")
    private WebElement getInTouchTitle;
    @FindBy(css = "input[data-qa='name']")
    private WebElement nameBox;
    @FindBy(css = "input[data-qa='email']")
    private WebElement emailBox;

    public boolean isVisibleGetInTouchTitle(){
        return  getInTouchTitle.isDisplayed();
    }

}
