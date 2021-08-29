package com.MyFirstPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbstractPageClass {

    WebDriver driver;
    WebDriverWait wait;

    public AbstractPageClass(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(this.driver, 15);
    }

    //define abstract methods
    public abstract String getPageTitle();

    public abstract String getPageHeader(By locator);

    public abstract WebElement getWebElement(By locator);

    public abstract void waitForWebElementPresent(By locator);

    public abstract void waitForPageTitle(String Title);

    // non abstract method
    public <TAbstractPageClass extends BasePage> TAbstractPageClass getInstance(Class<TAbstractPageClass> TAbstractPageClass) {
        try {
            return TAbstractPageClass.getDeclaredConstructor(WebDriver.class).newInstance(this.driver);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}




