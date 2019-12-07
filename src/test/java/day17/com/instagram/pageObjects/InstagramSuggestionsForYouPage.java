package day17.com.instagram.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramSuggestionsForYouPage {
    private WebDriver driver;
    private static final By headerFieldLocator = By.tagName("h4");
    private static final By profileButtonLocator = By.xpath("//*[@aria-label='Profile']");


    public InstagramSuggestionsForYouPage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Instagram"));
        wait.until(ExpectedConditions.textToBe(headerFieldLocator, "Suggestions For You"));
    }

    public InstagramProfilePage clickProfileButton() {
        driver.findElement(profileButtonLocator).click();
        return new InstagramProfilePage(driver);
    }
}
