package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCareersPage {
    WebDriver driver;

    AmazonCareersPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Amazon.jobs: Help us build Earth’s most customer-centric company."));
    }

    public AmazonCareersPage setKeyword(String keyword) {
        By searchArea = By.id("home-search");
        By keywordInputLocator = By.id("search_typeahead");
        driver.findElement(searchArea).findElement(keywordInputLocator).sendKeys(keyword);
        return this;
    }

    public AmazonCareersPage setLocation(String location) {
        By locationInputLocator = By.xpath("//div[@id='home-search']//input[@id='location-typeahead']");
        driver.findElement(locationInputLocator).sendKeys(location);
        return this;
    }

    public AmazonCareersSearchResultsPage clickSearchButton() {
        By searchArea = By.id("home-search");
        By searchButtonLocator = By.id("search-button");
        driver.findElement(searchArea).findElement(searchButtonLocator).click();
        return new AmazonCareersSearchResultsPage(driver);
    }
}
