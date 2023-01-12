package org.inaracademy.pages;

import org.inaracademy.utilities.Driver;

public class TestCasesPage extends BasePage{

    public String getUrl(){
        return Driver.getDriver().getCurrentUrl();
    }
}
