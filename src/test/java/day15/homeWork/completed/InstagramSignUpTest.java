package day15.homeWork.completed;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class InstagramSignUpTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void negativeInstagramSignUpTest() throws InterruptedException {
        assertEquals("https://www.instagram.com/", driver.getCurrentUrl());
        assertEquals("Instagram", driver.findElement(By.xpath("//h1")).getText());
        assertEquals("Instagram", driver.findElement(By.xpath("//h1[.='Instagram']")).getText());
        driver.findElement(By.name("emailOrPhone")).sendKeys("test@example.com");
        WebElement emailInput = driver.findElement(By.name("emailOrPhone"));
        System.out.println("getText: " + emailInput.getText());
        System.out.println("getAttributeValue: " + emailInput.getAttribute("value"));
        System.out.println("getAttributeAriaLabel: " + emailInput.getAttribute("aria-label"));
        assertEquals("test@example.com", emailInput.getAttribute("value"));
        driver.findElement(By.name("fullName")).sendKeys("someFullNme");
        assertEquals("someFullNme", driver.findElement(By.name("fullName")).getAttribute("value"));
        driver.findElement(By.name("username")).sendKeys("userName");
        assertEquals("userName", driver.findElement(By.name("username")).getAttribute("value"));
        driver.findElement(By.name("password")).sendKeys("P@ssw0rd");
        assertEquals("P@ssw0rd", driver.findElement(By.name("password")).getAttribute("value"));
        driver.findElement(By.xpath("//button[.='Sign up']")).click();
        assertEquals("Error message come up", "This username isn't available. Please try another.",
                driver.findElement(By.id ("ssfErrorAlert")).getText());
        assertEquals("Error message come up", "This username isn't available. Please try another.",
                driver.findElement(By.xpath("//p[@id='ssfErrorAlert']")).getText());
    }
}
