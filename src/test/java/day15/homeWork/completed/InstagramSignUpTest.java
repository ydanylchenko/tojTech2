package day15.homeWork.completed;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

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
        driver.findElement(By.name("emailOrPhone")).sendKeys("test@example.com");
        driver.findElement(By.name("fullName")).sendKeys("someFullNme");
        driver.findElement(By.name("username")).sendKeys("userName");
        driver.findElement(By.name("password")).sendKeys("P@ssw0rd");
        assertEquals("I'm on Istagram", "Instagram", driver.findElement(By.tagName("h1")).getText());

    }
}
