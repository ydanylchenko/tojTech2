package com.MyFirstPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage extends BasePage {
    //page locators:
    private By emailAddress = By.id("username");
    private By password = By.id("password");
    private By submit = By.id("submitBtn");
    private By header = By.xpath("//h1[@class='header']");

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    // getters


    public WebElement getEmailAddress() {
        return getWebElement(emailAddress);
    }

    public WebElement getPassword() {
        return getWebElement (password);
    }

    public WebElement getSubmit() {
        return getWebElement(submit);
    }

    public WebElement getHeader() {
        return getWebElement(header);
    }

    public String  getLoginPageTitle (){
        return getPageTitle();
    }

    public String getLoginPageHeader () {
        return getPageHeader(header);
    }

    public HomePage doLogIn (String username, String password) {
        getEmailAddress().sendKeys("username");
        getPassword().sendKeys(password);
        getSubmit().click();
        // next method will be to return next page object
        return getInstance(HomePage.class);
    }

     // NEGATIVE Testing using method overloading: same method name different parameters

    public HomePage doLogIn () {
        getEmailAddress().sendKeys("");
        getPassword().sendKeys("");
        getSubmit().click();
        // next method will be to return next page object
        return getInstance(HomePage.class);


    }

}


