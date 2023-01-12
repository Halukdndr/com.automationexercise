package org.inaracademy.automationexercise;

import org.apache.commons.io.FileUtils;
import org.inaracademy.utilities.BrowserUtils;
import org.inaracademy.utilities.ConfigurationReader;
import org.inaracademy.utilities.Driver;
import org.inaracademy.utilities.Pages;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.io.File;
import java.io.IOException;

public class BaseTest {
    protected Pages pages = new Pages();



    @BeforeSuite
    public void setUpSuite() {
        // code that is executed before the entire test suite
        String URL = ConfigurationReader.getProperty("url");
        String browser = ConfigurationReader.getProperty("browser");
        String environment = ConfigurationReader.getProperty("environment");

        Driver.getDriver().get(URL);
        System.out.println("::::::Test Information ::::::\n\tURL :" + URL + "\n\tBrowser :" + browser + "\n\tEnvironment :" + environment);
        //BrowserUtils.wait(1);
    }
    @AfterSuite
    public void afterTest() {
        // Perform cleanup tasks or generate test reports here
        Driver.getDriver().quit();
    }

    public String getScreenshot(String testCaseName , WebDriver driver) throws IOException {
        TakesScreenshot ts = (TakesScreenshot) driver;
        File source = ts.getScreenshotAs(OutputType.FILE);
        File file = new File(System.getProperty("user.dir") + "//reports//" + testCaseName + ".png");
        FileUtils.copyFile(source ,file);
        return file.getPath();
    }
}
