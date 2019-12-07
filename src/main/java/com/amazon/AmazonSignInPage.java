package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSignInPage {
    WebDriver driver;

    AmazonSignInPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Amazon Sign-In"));
    }

    public AmazonSignInPage clickKeepMeSignedIn() {
        By checkboxLocator = By.name("rememberMe");
        driver.findElement(checkboxLocator).sendKeys(Keys.SPACE);
        System.out.println(driver.findElement(checkboxLocator).isSelected());
        By checkboxLabel = By.xpath("//span[normalize-space(text())='Keep me signed in.']");
        driver.findElement(checkboxLabel).click();
        System.out.println(driver.findElement(checkboxLabel).isSelected());
        return this;
    }
}
