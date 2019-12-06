package com.amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AmazonStartPage {
    WebDriver driver;

    public AmazonStartPage(WebDriver webDriver) {
        driver = webDriver;
        new WebDriverWait(driver, 5).until(ExpectedConditions.titleIs("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
    }

    public AmazonPrimePage clickTryPrimeNavBarLink() {
        By tryPrimeLinkLocator = By.className("nav-prime-try");
        driver.findElement(tryPrimeLinkLocator).click();
        return new AmazonPrimePage(driver);
    }

    public AmazonStartPage setSearchKeyword(String keyword) {
        By searchInputLocator = By.id("twotabsearchtextbox");
        driver.findElement(searchInputLocator).sendKeys(keyword);
        return this;
    }

    public AmazonSearchResultsPage clickSearchButton() {
        By searchButtonLocator = By.xpath("//input[@value='Go']");
        driver.findElement(searchButtonLocator).click();
        return new AmazonSearchResultsPage(driver);
    }

    public AmazonCareersPage clickCareersLink() {
        By footerLocator = By.id("navFooter");
        By careersLinkLocator = By.linkText("Careers");
        driver.findElement(footerLocator).findElement(careersLinkLocator).click();
        return new AmazonCareersPage(driver);
    }

    public AmazonSignInPage clickSignInSecurelyButton() {
        By signInSecurelyButtonLocator = By.xpath("//a[.='Sign in securely']");
        driver.findElement(signInSecurelyButtonLocator).click();
        return new AmazonSignInPage(driver);
    }

    public AmazonStartPage selectDepartment(String departmentName) {
        By departmentSelectLocator = By.id("searchDropdownBox");
        WebElement departmentsElement = driver.findElement(departmentSelectLocator);
        Select departments = new Select(departmentsElement);
        departments.selectByVisibleText(departmentName);
        return this;
    }
}
