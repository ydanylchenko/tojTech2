package com.amazon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonSearchResultsPage {
    WebDriver driver;

    AmazonSearchResultsPage(WebDriver webDriver) {
        driver = webDriver;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.titleContains("Amazon.com: "));
    }

    public AmazonItemPage clickItem(String itemName) {
        By itemNameLocator = By.xpath("//span[.='" + itemName + "']");
        driver.findElement(itemNameLocator).click();
        return new AmazonItemPage(driver);
    }

    public String getSearchResultsPageTitle() {
        return driver.getTitle();
    }

    public boolean isNoSearchResultMessageDisplayed(String itemName) {
        By noResultsMessageLocator = By.className("a-row");
        WebElement noResultsMessage = driver.findElement(noResultsMessageLocator);
        String expectedMessage = String.format("No results for %s.", itemName);
        Assert.assertEquals("No search results message", expectedMessage, noResultsMessage.getText());
        By hintElementLocator = By.xpath("//span[.='Try checking your spelling or use more general terms']");
        WebElement hintElement = driver.findElement(hintElementLocator);
        return noResultsMessage.isDisplayed() && hintElement.isDisplayed();
    }

    public AmazonSearchResultsPage clickAmazonPrimeCheckbox() {
        By amazonPrimeCheckboxLocator = By.xpath("//div[@id='primeRefinements']//input");
        amazonPrimeCheckboxLocator = By.xpath("//i[@aria-label='Prime Eligible']");
        driver.findElement(amazonPrimeCheckboxLocator).click();
        return new AmazonSearchResultsPage(driver);
    }

//    public void clickAvgCustomerReviewCheckbox() {
//        By avgCustomerReviewCheckboxLocator = By.xpath("//span[.='4 Stars & Up']");
//        driver.findElement(avgCustomerReviewCheckboxLocator).click();
//    }

    public AmazonSearchResultsPage clickAvgCustomerReview(int starsAmount) {
//        By avgCustomerReviewCheckboxLocator = By.className(String.format("a-star-medium-%s", starsAmount));
//        By avgCustomerReviewCheckboxLocator = By.className("a-star-medium-".concat(String.valueOf(starsAmount)));
        By avgCustomerReviewCheckboxLocator = By.className("a-star-medium-" + starsAmount);
        driver.findElement(avgCustomerReviewCheckboxLocator).click();
        return new AmazonSearchResultsPage(driver);
    }

    public boolean isItemInSearchResults(String itemName) {
//        By itemNameLocator = By.xpath("//span[.='Searching for Sylvie Lee: A Novel']");
//        By itemNameLocator = By.xpath(String.format("//span[.='%s']", itemName));
        By itemNameLocator = By.xpath("//span[.='" + itemName + "']");
//        return !driver.findElements(itemNameLocator).isEmpty();
        return driver.findElements(itemNameLocator).size() > 0;
    }
}
