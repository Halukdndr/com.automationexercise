package org.inaracademy.pages;

import org.inaracademy.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductsPage extends BasePage{
    @FindBy(css = ".features_items h2.title")
    private WebElement allProductsTitle;
    @FindBy(css = "a[href*='/product_details']")
    private List<WebElement> viewProductButtons;

    public String getCurrentUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
    public boolean isDisplayedAllProductsTitle(){
        return allProductsTitle.isDisplayed();
    }
    public void clickFirstViewProductButtonOnThePage(){
        viewProductButtons.get(0).click();
    }
}
