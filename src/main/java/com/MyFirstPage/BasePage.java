package com.MyFirstPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class BasePage extends AbstractPageClass {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle();
    }

    @Override
    public String getPageHeader(By locator) {
        return getWebElement(locator).getText();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            element=driver.findElement(locator);
            return element;
        }
        catch (Exception e){
            System.out.println("Unable to create an element" + locator.toString());
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void waitForWebElementPresent(By locator) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locator));
        }
        catch (Exception e) {
            System.out.println("error/exception occurred while waiting for the element presence" + locator.toString());
        }

    }

    @Override
    public void waitForPageTitle(String Title) {
        try {
            wait.until(ExpectedConditions.titleContains(Title));
        }
        catch (Exception e) {
            System.out.println("error/exception occurred while waiting for the element presence" + Title);
        }

    }
}
