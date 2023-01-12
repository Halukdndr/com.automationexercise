package org.inaracademy.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class SignupPage extends BasePage{
    @FindBy(css = ".login-form b ")
    private WebElement enterAccountInformationTitle;

    @FindBy(xpath = "//*[@id='id_gender1']")
    private WebElement id_genderMR;

    @FindBy(xpath = "//*[@id='id_gender2']")
    private WebElement id_genderMRS;

    @FindBy(xpath = "//*[@type='password']")
    private WebElement passwordBox;

    @FindBy(xpath = "//*[@data-qa='days']")
    private WebElement dateOfBirt_DAYs;
    @FindBy(xpath = "//*[@data-qa='months']")
    private WebElement dateOfBirt_MONTHs;

    @FindBy(xpath = "//*[@data-qa='years']")
    private WebElement dateOfBirt_YEARs;
    @FindBy(id="newsletter")
    private WebElement newsLetterBox;
    @FindBy(id = "optin")
    private WebElement reciveSpecialOffersBox;
    @FindBy(id = "first_name")
    private WebElement firstNameBox;
    @FindBy(id = "last_name")
    private WebElement lastNameBox;
    @FindBy(id = "company")
    private WebElement companyBox;
    @FindBy(id = "address1")
    private WebElement address1Box;
    @FindBy(id = "address2")
    private WebElement address2Box;
    @FindBy(id = "country")
    private WebElement countryBox;
    @FindBy(id = "state")
    private WebElement stateBox;
    @FindBy(id = "city")
    private WebElement cityBox;
    @FindBy(id = "zipcode")
    private WebElement zipCodeBox;
    @FindBy(id = "mobile_number")
    private WebElement mobileNumberBox;
    @FindBy(xpath = "//button[@data-qa='create-account']")
    private WebElement createAccountButton;
    @FindBy(xpath ="//h2[@data-qa='account-created']")
    WebElement accountCreatedMessage;


    public String getEnterAccountInformationTitle() {
        return enterAccountInformationTitle.getText();

    }

    public void selectTitleMen() {
        id_genderMR.click();
    }

    public void selectTitleWomen() {
        id_genderMRS.click();
    }

    public void setPassword(String password) {
        passwordBox.sendKeys(password);
    }

    public void setDateOfBirt(String day, String month, String year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    private void setDay(String day) {
        Select select = new Select(dateOfBirt_DAYs);
        select.selectByVisibleText(day);
    }

    private void setMonth(String month) {
        Select select = new Select(dateOfBirt_MONTHs);
        select.selectByVisibleText(month);
    }

    private void setYear(String year) {
        Select select = new Select(dateOfBirt_YEARs);
        select.selectByVisibleText(year);

    }
    public void selectNewsLetterBox(){
        newsLetterBox.click();
    }
    public void selectReciveSpecialOffersBox(){
        reciveSpecialOffersBox.click();
    }

    public void setFirstNameBox(String firstName) {
        firstNameBox.sendKeys(firstName);
    }
    public void setLastNameBox(String lastName){
        lastNameBox.sendKeys(lastName);
    }
    public void setCompanyBox(String companyName){
        companyBox.sendKeys(companyName);
    }
    public void setAddress1Box(String address1){
        address1Box.sendKeys(address1);
    }

    public void setAddress2Box(String address2) {
        address2Box.sendKeys(address2);
    }
    public void selectCountry(String countryName){
        Select select = new Select(countryBox);
        select.selectByVisibleText(countryName);
    }

    public void setStateBox(String stateName) {
        stateBox.sendKeys(stateName);
    }

    public void setCityBox(String cityName) {
        cityBox.sendKeys(cityName);
    }

    public void setZipCodeBox(String zipCode) {
        zipCodeBox.sendKeys(zipCode);
    }

    public void setMobileNumberBox(String mobileNumber) {
        mobileNumberBox.sendKeys(mobileNumber);
    }
    public void clickToCreateAccountButton(){
        createAccountButton.click();
    }
}
