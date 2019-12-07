package day17.com.instagram.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramLogInPage {
    private WebDriver driver;
    private static final By usernameInputLocator = By.name("username");
    private static final By passwordInputLocator = By.name("password");
    private static final By logInButtonLocator = By.xpath("//button[.='Log In']");


    public InstagramLogInPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Login • Instagram"));
    }

    public InstagramLogInPage setUsername(String username){
        driver.findElement(usernameInputLocator).sendKeys(username);
        return this;
    }

    public InstagramLogInPage setPassword(String password){
        driver.findElement(passwordInputLocator).sendKeys(password);
        return this;
    }

    public InstagramNotificationsForm clickLogInButton(){
        new WebDriverWait(driver, 15).until(ExpectedConditions.elementToBeClickable(logInButtonLocator));
        driver.findElement(logInButtonLocator).click();
        return new InstagramNotificationsForm(driver);
    }
}
