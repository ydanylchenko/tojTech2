package day15.craigslist;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class CraigsListSearchTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://newyork.craigslist.org/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchForSomethingTest() {
        assertEquals("Home page title", "Google", driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("seleniumqh");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        assertEquals("Search results page title", "seleniumqh - Google Search", driver.getTitle());
        driver.findElement(By.xpath("//span[.='Showing results for']/..//i")).click();
        assertEquals("Search results page title", "seleniumqh - Google Search", driver.getTitle());
        driver.findElement(By.xpath("//h3[.='SeleniumHQ Browser Automation']")).click();
        assertEquals("SeleniumHQ page title", "SeleniumHQ Browser Automation", driver.getTitle());
        assertEquals("SeleniumHQ page header", "Selenium automates browsers. That's it!", driver.findElement(By.tagName("h1")).getText());
        String expectedFullHeader = "Selenium automates browsers. That's it!\n" +
                "What you do with that power is entirely up to you.\n" +
                "Primarily it is for automating web applications for testing purposes, but is certainly not limited to just that.\n" +
                "Boring web-based administration tasks can (and should) also be automated as well.";
        assertEquals("SeleniumHQ page header", expectedFullHeader, driver.findElement(By.className("homepage")).getText());
    }
}
