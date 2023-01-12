package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetailsPage extends BasePage{
    @FindBy(css = ".product-information h2")
    private WebElement productName;
    @FindBy(xpath = "//div[@class='product-information'] / p[1]")
    private WebElement productCategory;
    @FindBy(xpath = "//div[@class='product-information'] / p[2]")
    private WebElement productAvailability;
    @FindBy(xpath = "//div[@class='product-information'] / p[3]")
    private WebElement productCondition;
    @FindBy(xpath = "//div[@class='product-information'] / p[4]")
    private WebElement productBrand;
    @FindBy(css = "span span")
    private WebElement productPrice;

    public boolean isDisplayedProductName(){
        return productName.isDisplayed();
    }
    public boolean isDisplayedProductCategory(){
        return productCategory.isDisplayed();
    }
    public boolean isDisplayedProductPrice(){
        return productPrice.isDisplayed();
    }
    public boolean isDisplayedProductAvailability(){
        return productAvailability.isDisplayed();
    }
    public boolean isDisplayedProductCondition(){
        return productCondition.isDisplayed();
    }
    public boolean isDisplayedProductBrand(){
        return productBrand.isDisplayed();
    }


}
