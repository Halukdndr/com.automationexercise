package org.inaracademy.utilities;

import org.openqa.selenium.JavascriptExecutor;

public class BrowserUtils {

    public static void navigateBackAndForwardToDismissAds(){
        Driver.getDriver().navigate().back();
        Driver.getDriver().navigate().forward();

    }
    public static void scrollDown(String scroll){
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0," + scroll + ")");
    }
}
