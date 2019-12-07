package day17.com.instagram.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramStartPage {
    private WebDriver driver;
    private static final By headerFieldLocator = By.tagName("h1");
    private static final By emailOrPhoneInputLocator = By.name("emailOrPhone");
    private static final By fullNameInputLocator = By.name("fullName");
    private static final By usernameInputLocator = By.name("username");
    private static final By passwordInputLocator = By.name("password");
    private static final By signUpButtonLocator = By.xpath("//button[.='Sign up']");
    private static final By logInLinkLocator = By.linkText("Log in");
    private static final By errorFieldLocator = By.id ("ssfErrorAlert");


    public InstagramStartPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Instagram"));
        wait.until(ExpectedConditions.textToBe(headerFieldLocator, "Instagram"));
    }

    public InstagramStartPage setMobileNumberOrEmail(String mobileNumberOrEmail){
        driver.findElement(emailOrPhoneInputLocator).sendKeys(mobileNumberOrEmail);
        return this;
    }

    public InstagramStartPage setFullName(String fullName){
        driver.findElement(fullNameInputLocator).sendKeys(fullName);
        return this;
    }

    public InstagramStartPage setUsername(String username){
        driver.findElement(usernameInputLocator).sendKeys(username);
        return this;
    }

    public InstagramStartPage setPassword(String password){
        driver.findElement(passwordInputLocator).sendKeys(password);
        return this;
    }

    public InstagramStartPage clickSignUpButtonExpectingFailure(){
        driver.findElement(signUpButtonLocator).click();
        return new InstagramStartPage(driver);
    }

    public InstagramNotificationsForm clickSignUpButton(){
        driver.findElement(signUpButtonLocator).click();
        return new InstagramNotificationsForm(driver);
    }

    public InstagramLogInPage clickLogInLink(){
        driver.findElement(logInLinkLocator).click();
        return new InstagramLogInPage(driver);
    }

    public String getErrorMessage(){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(errorFieldLocator));
        return driver.findElement(errorFieldLocator).getText();
    }
}
