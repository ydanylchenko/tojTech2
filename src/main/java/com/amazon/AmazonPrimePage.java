package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonPrimePage {
    WebDriver driver;

    AmazonPrimePage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Amazon.com: Amazon Prime"));
    }

    public AmazonSignInPage clickTryPrimeButton() {
        By tryPrimeButtonLocator = By.id("prime-header-CTA");
        driver.findElement(tryPrimeButtonLocator).click();
        return new AmazonSignInPage(driver);
    }
}
