package day18.elementsInteraction.com.amazon;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class AmazonSwitchLanguageTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.amazon.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void hoverAndClickTest() {
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.titleIs("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more"));
//        Action defined and initialized
        Actions hover = new Actions(driver);
//        WebElement that expands on hover
        WebElement languages = driver.findElement(By.className("icp-nav-language"));
//        add move mouse to element action to the scheduled action
        hover.moveToElement(languages);
//        perform the created action
        hover.perform();
//        and now we can click on the previously hidden element
        driver.findElement(By.linkText("Español - ES")).click();
        wait.until(ExpectedConditions.titleIs("Amazon.com: Compras en Línea de Electrónicos, Ropa, Computadoras, Libros, DVDs y más"));
    }

    @Test
    public void keySequenceTest() throws InterruptedException {
        Actions hover = new Actions(driver);
        hover.contextClick();
        hover.perform();
        Thread.sleep(5000);
    }
}