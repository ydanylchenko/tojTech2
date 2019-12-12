package day18.elementsInteraction.com.w3schools;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;

public class AlertsTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_confirm");
        driver.switchTo().frame("iframeResult");
        driver.findElement(By.xpath("//button[.='Try it']")).click();
        new WebDriverWait(driver, 15).until(ExpectedConditions.alertIsPresent());
    }

    @After
    public void tearDown() {
        driver.switchTo().defaultContent();
        driver.quit();
    }

    @Test
    public void w3cAlertAcceptTest() {
        Alert displayedAlert = driver.switchTo().alert();
        System.out.println(displayedAlert.getText());
        assertEquals("Press a button!", displayedAlert.getText());
        displayedAlert.accept();
    }

    @Test
    public void w3cAlertDismissTest() {
        Alert displayedAlert = driver.switchTo().alert();
        System.out.println(displayedAlert.getText());
        assertEquals("Press a button!", displayedAlert.getText());
        displayedAlert.accept();
    }
}
