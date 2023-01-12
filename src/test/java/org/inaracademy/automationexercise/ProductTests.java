package org.inaracademy.automationexercise;

import org.inaracademy.utilities.BrowserUtils;
import org.inaracademy.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ProductTests extends BaseTest{

    SoftAssert softAssert = new SoftAssert();

    @Test
    public void testCase_08_VerifyAllProductsAndProductDetailPage() throws InterruptedException {
        //Launch browser and Navigate to url 'http://automationexercise.com'
        //Verify that home page is visible successfully
        softAssert.assertEquals(Driver.getDriver().getTitle(),"Automation Exercise" , "ERROR : Test Case 08 -  Verify that home page is visible successfully");

        //Click on 'Products' button
        pages.getHeader().goToProductsPage();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        // Verify user is navigated to ALL PRODUCTS page successfully
        String currentUrl = pages.getProductsPage().getCurrentUrl();
        softAssert.assertEquals(currentUrl ,"https://automationexercise.com/products" ,"ERROR : Test Case 08 -  Verify user is navigated to ALL PRODUCTS page successfully" );

        //Click on 'View Product' of first product
        BrowserUtils.scrollDown("500");
        //Thread.sleep(2000);
        pages.getProductsPage().clickFirstViewProductButtonOnThePage();
        BrowserUtils.navigateBackAndForwardToDismissAds();

        //Verify that detail  is visible: product name, category, price, availability, condition, brand
        boolean isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductName();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");

        isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductCategory();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");

        isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductPrice();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");

        isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductAvailability();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");

        isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductCondition();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");

        isDisplayedFeature = pages.getProductDetailsPage().isDisplayedProductBrand();
        softAssert.assertTrue(isDisplayedFeature,"ERROR : Test Case 08 - Verify that detail  is visible: product name, category, price, availability, condition, brand ");
    }
}
