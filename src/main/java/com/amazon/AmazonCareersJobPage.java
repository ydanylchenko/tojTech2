package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonCareersJobPage {
    WebDriver driver;

    AmazonCareersJobPage(WebDriver webDriver) {
        driver = webDriver;
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.titleContains(" | Amazon.jobs"));
        wait.until(ExpectedConditions.titleContains(" - Job ID: "));
    }

    public String getJobTitle(){
        return driver.findElement(By.id("job-detail")).findElement(By.tagName("h1")).getText();
    }

    public String getJobMetaData(){
        return driver.findElement(By.className("meta")).getText();
    }
}
