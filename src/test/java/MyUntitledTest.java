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

public class MyUntitledTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Ignore
    @Test
    public void myUntitled() {
        assertEquals("Home page title", "Google", driver.getTitle());
        driver.findElement(By.name("q")).sendKeys("seleniumqh");
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
        assertEquals("Search results page title", "seleniumqh - Google Search", driver.getTitle());
        driver.findElement(By.xpath("//span[.='Showing results for']/..//i")).click();
        assertEquals("Search results page title", "seleniumqh - Google Search", driver.getTitle());
        driver.findElement(By.xpath("//h3[.='Selenium - Web Browser Automation']")).click();
        assertEquals("SeleniumHQ page title", "SeleniumHQ Browser Automation", driver.getTitle());
    }
}
