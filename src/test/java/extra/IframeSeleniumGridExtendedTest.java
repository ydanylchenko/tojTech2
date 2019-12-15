package extra;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class IframeSeleniumGridExtendedTest {
    private WebDriver driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setBrowserName("chrome");
        capabilities.setVersion("78.0");
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", false);
        RemoteWebDriver driver = new RemoteWebDriver(URI.create("http://localhost:4444/wd/hub").toURL(), capabilities);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.speedtrader.com/");
        driver.findElement(By.linkText("Platform Demo")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void speedTraderProIframeTest() {
//        This element is on header
        By openAnAccountLink = By.xpath("//a[.='OPEN AN ACCOUNT']");
//        This element is part of iframe
        By nameInput = By.xpath("//input[@id='txtName']");
//        This is locator of iframe field
        By signUpIframe = By.xpath("//div[@id='trial']//iframe");
        System.out.println("Amount of tracked elements before switch to iframe:");
        System.out.println("Amount of OPEN AN ACCOUNT links: " + driver.findElements(openAnAccountLink).size());    // 1
        System.out.println("Amount of NAME inputs: " + driver.findElements(nameInput).size());                      // 0
//        we are switching to the iframe using it's element:
        driver.switchTo().frame(driver.findElement(signUpIframe));
        System.out.println("Amount of tracked elements after switch to iframe:");
        System.out.println("Amount of OPEN AN ACCOUNT links: " + driver.findElements(openAnAccountLink).size());    // 0
        System.out.println("Amount of NAME inputs: " + driver.findElements(nameInput).size());                      // 1
        driver.findElement(nameInput).sendKeys("FullName");
//        in order to switch back to the main page:
        driver.switchTo().defaultContent();
        System.out.println("Amount of tracked elements after switch back to the default page:");
        System.out.println("Amount of OPEN AN ACCOUNT links: " + driver.findElements(openAnAccountLink).size());    // 1
        System.out.println("Amount of NAME inputs: " + driver.findElements(nameInput).size());                      // 0

    }
}
