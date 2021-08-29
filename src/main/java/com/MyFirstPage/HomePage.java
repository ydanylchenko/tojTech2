package com.MyFirstPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {
    private By header = By.xpath("//h1[@class='sj_headline']");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getHeader() {
        return getWebElement(header);
    }

    // page actions
    public String getHomePageTitle() {
        return getPageTitle();
    }

    public String getHomePageHeader() {
        return getPageHeader(header);

    }
}