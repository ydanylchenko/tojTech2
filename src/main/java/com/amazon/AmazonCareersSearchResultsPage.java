package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCareersSearchResultsPage {
    WebDriver driver;

    AmazonCareersSearchResultsPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Job search | Amazon.jobs"));
    }

    public AmazonCareersJobPage clickJobTitle(String jobTitle) {
        By jobTitleLocator = By.xpath(String.format("//h3[.='%s']", jobTitle));
        By jobTitleButtonLocatorOptionTwo = By.xpath("//h3[.='" + jobTitle + "']"); // //h3[.='QA Engineer']
        driver.findElement(jobTitleLocator).click();
        return new AmazonCareersJobPage(driver);
    }
}
