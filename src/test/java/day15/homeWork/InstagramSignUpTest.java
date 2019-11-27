package day15.homeWork;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

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
        assertEquals("Instagram", driver.findElement(By.tagName("h1")).getText());
        driver.findElement(By.name("emailOrPhone")).sendKeys("test@example.com");
        driver.findElement(By.name("fullName")).sendKeys("FirstName LastName");
        driver.findElement(By.name("username")).sendKeys("someUsername");
        driver.findElement(By.name("password")).sendKeys("P@ssw0rd");
        driver.findElement(By.xpath("//button[.='Sign up']")).click();
        Thread.sleep(2000);
        assertEquals("This username isn't available. Please try another.", driver.findElement(By.id("ssfErrorAlert")).getText());
    }
}
