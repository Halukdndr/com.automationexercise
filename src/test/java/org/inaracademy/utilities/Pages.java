package org.inaracademy.utilities;

import org.inaracademy.pages.*;

public class Pages {
    private HomePage homePage;
    private LoginPage loginPage;
    private SignupPage signupPage;

    private ProductsPage productsPage;
    private AccountCreatedPage accountCreatedPage;
    private AccountDeletedPage accountDeletedPage;
    private Header header;
    private ContactUsPage contactUsPage;

    public ContactUsPage getContactUsPage() {
        return contactUsPage;
    }
    private ProductDetailsPage productDetailsPage;

    public ProductDetailsPage getProductDetailsPage() {
        return productDetailsPage;
    }

    public TestCasesPage getTestCasesPage() {
        return testCasesPage;
    }

    private TestCasesPage testCasesPage;


    public AccountDeletedPage getAccountDeletedPage() {
        return accountDeletedPage;
    }

    public Header getHeader() {
        return header;
    }

    public Pages() {
        this.homePage = new HomePage();
        this.loginPage = new LoginPage();
        this.signupPage = new SignupPage();
        this.productsPage = new ProductsPage();
        this.accountCreatedPage = new AccountCreatedPage();
        this.accountDeletedPage = new AccountDeletedPage();
        this.header = new Header();
        this.testCasesPage = new TestCasesPage();
        this.productDetailsPage = new ProductDetailsPage();
        this.contactUsPage = new ContactUsPage();
    }

    public SignupPage getSignupPage() {
        return signupPage;
    }


    public HomePage getHomePage() {
        return homePage;
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public ProductsPage getProductsPage() {
        return productsPage;
    }

    public AccountCreatedPage getAccountCreatedPage() {
        return accountCreatedPage;
    }
}

