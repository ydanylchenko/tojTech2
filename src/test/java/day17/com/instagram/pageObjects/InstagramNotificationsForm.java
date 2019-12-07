package day17.com.instagram.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramNotificationsForm {
    private WebDriver driver;
    private static final By headerFieldLocator = By.tagName("h2");
    private static final By turnOnButtonLocator = By.xpath("//button[.='Turn On']");
    private static final By notNowButtonLocator = By.xpath("//button[.='Not Now']");


    public InstagramNotificationsForm(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Instagram"));
        wait.until(ExpectedConditions.textToBe(headerFieldLocator, "Turn on Notifications"));
    }

    public InstagramSuggestionsForYouPage clickTurnOnButton(){
        driver.findElement(turnOnButtonLocator).click();
        return new InstagramSuggestionsForYouPage(driver);
    }

    public InstagramSuggestionsForYouPage clickNotNowButton(){
        driver.findElement(notNowButtonLocator).click();
        return new InstagramSuggestionsForYouPage(driver);
    }
}
