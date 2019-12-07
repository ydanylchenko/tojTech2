package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCartPage {
    WebDriver driver;

    AmazonCartPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Amazon.com Shopping Cart"));
    }

    public boolean isItemInCart(String itemName) {
        By itemNameLocator = By.xpath("//li//span[normalize-space(text())='" + itemName + "']");
        return driver.findElement(itemNameLocator).isDisplayed();
    }

    public boolean isItemInCartOption2(String itemName) {
        By itemNameLocator = By.xpath("//li//span[normalize-space(text())='" + itemName + "']");
        return driver.findElements(itemNameLocator).size() > 0;
    }

    public String getItemPriceByName(String itemName) {
        By itemNameLocator = By.xpath("//li//span[normalize-space(text())='" + itemName + "']");
        WebElement item = driver.findElement(itemNameLocator);
        WebElement itemRow = item.findElement(By.xpath("../../../../../../../../.."));
        WebElement price = itemRow.findElement(By.className("sc-product-price"));
        return price.getText();
    }

    public String getItemQuantityByName(String itemName) {
        By itemNameLocator = By.xpath("//li//span[normalize-space(text())='" + itemName + "']");
        WebElement item = driver.findElement(itemNameLocator);
        WebElement itemRow = item.findElement(By.xpath("../../../../../../../../.."));
        WebElement quantity = itemRow.findElement(By.className("quantity")).findElement(By.className("a-dropdown-prompt"));
        return quantity.getText();
    }

    public AmazonCartPage deleteItemFromCart(String itemName) {
        By amountOfItemsInCartLocator = By.id("nav-cart-count");
        String amountOfItemsInCart = driver.findElement(amountOfItemsInCartLocator).getText();
        By itemNameLocator = By.xpath("//li//span[normalize-space(text())='" + itemName + "']");
        WebElement item = driver.findElement(itemNameLocator);
        WebElement itemRow = item.findElement(By.xpath("../../../../../../../../.."));
        itemRow.findElement(By.className("sc-action-delete")).findElement(By.tagName("input")).click();
        new WebDriverWait(driver, 5).until(ExpectedConditions.textToBe(amountOfItemsInCartLocator, String.valueOf(Integer.parseInt(amountOfItemsInCart) - 1)));
        return new AmazonCartPage(driver);
    }

    public String getCartSubtotal() {
        By cartSubtotalLocator = By.id("sc-subtotal-amount-activecart");
        WebElement cartSubtotal = driver.findElement(cartSubtotalLocator);
        return cartSubtotal.getText();
    }
}
