package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonItemPage {
    WebDriver driver;

    AmazonItemPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains("Amazon.com: "));
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleContains(": Gateway"));
    }

    public String getItemPageTitle() {
        return driver.getTitle();
    }

    public AmazonItemPage clickAddToCartButton() {
        By amountOfItemsInCartLocator = By.id("nav-cart-count");
        String amountOfItemsInCart = driver.findElement(amountOfItemsInCartLocator).getText();
        By addToCartButton = By.id("add-to-cart-button");
        driver.findElement(addToCartButton).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.textToBe(amountOfItemsInCartLocator, String.valueOf(Integer.parseInt(amountOfItemsInCart) + 1)));
        return this;
    }

    public AmazonCartPage clickViewCartButton() {
        By viewCartButton = By.className("cart-btn");
        driver.findElement(viewCartButton).click();
        return new AmazonCartPage(driver);
    }
}
