package org.inaracademy.pages;

import org.inaracademy.pages.BasePage;
import org.inaracademy.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Header extends BasePage {


    @FindBy(css=".navbar-nav a[href='/products']")
    private static WebElement productsButton;
    @FindBy(css="a[href='/view_cart']")
    private static WebElement cardButton;
    @FindBy(css="a[href='/login']")
    private static WebElement loginButton;

    @FindBy(css = ".shop-menu ul li:nth-child(10)")
    private WebElement loggedAsUsernameSection;
    @FindBy(xpath = "//a[@href='/delete_account']")
    private WebElement deleteAccountButton;
    @FindBy(css = "li a[href='/logout']")
    private WebElement logOutButton;
    @FindBy(css = "li a[href='/test_cases']")
    private WebElement testCasesButton;
    @FindBy(css = "li a[href='/contact_us']")
    private WebElement contactUsButton;

    public  void goToProductsPage() throws InterruptedException {
        productsButton.click();

    }
    public  void goToCardPage() throws InterruptedException {
        cardButton.click();

    }
    public  void goToLoginPage() throws InterruptedException {
        loginButton.click();

    }

    public  void clickToDeleteAccountButton(){
        deleteAccountButton.click();
    }
    public boolean isVisibleLoggedInAsUsernameSection(){
        return  loggedAsUsernameSection.isDisplayed();
    }
    public void clickToLogOutButton(){
        logOutButton.click();
    }
    public void clickToTestCasesButton(){
        testCasesButton.click();
    }
    public void clickToContactUsButton(){
        contactUsButton.click();
    }


}
