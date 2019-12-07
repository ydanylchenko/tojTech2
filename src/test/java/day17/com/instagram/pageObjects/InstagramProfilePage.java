package day17.com.instagram.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstagramProfilePage {
    private WebDriver driver;
    private static final By editProfileButtonLocator = By.xpath("//button[.='Edit Profile']");
    private static final By userNameFieldLocator = By.tagName("h1");
//    private static final By userNameFieldLocator = By.xpath("//header//div[1]/h1");
    private static final By fullNameFieldLocator = By.xpath("//header//div[2]/h1");


    public InstagramProfilePage(WebDriver driver) {
        this.driver = driver;
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.presenceOfElementLocated(editProfileButtonLocator));
    }

    public String getTitle(){
        return driver.getTitle();
    }

    public String getUserName(){
        return driver.findElement(userNameFieldLocator).getText();
    }

    public String getFullName(){
        return driver.findElement(fullNameFieldLocator).getText();
    }
}
