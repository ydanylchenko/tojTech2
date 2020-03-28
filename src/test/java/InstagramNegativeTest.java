import day17.com.instagram.Helpers;
import day17.com.instagram.pageObjects.InstagramStartPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
    import java.util.concurrent.TimeUnit;
    import static org.junit.Assert.assertEquals;
    public class InstagramNegativeTest {
        private WebDriver driver;

        @Before
        public void setUp() {
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.get("https://www.instagram.com/");
        }

        @After
        public void tearDown() {
            driver.quit();
        }

      /*  @Test
        public void negativeInstagramSignUpTest() {

            {
                By className = By.tagName("h1");
                driver.findElement(className);

                By mobileNumOrEmailBar = By.xpath("//input[@aria-label=\"Mobile Number or Email\"]");
                driver.findElement(mobileNumOrEmailBar).sendKeys("“test@example.com”");

                By fullnameBar = By.xpath("//input[@name=\"fullName\"]");
                driver.findElement(fullnameBar).sendKeys("“FirstName LastName");

                By userName = By.xpath("//input[@name=\"username\"]");
                driver.findElement(userName).sendKeys("someUsername");

                By passwordBar = By.xpath("//input[@name=\"password\"]");
                driver.findElement(passwordBar).sendKeys("P@ssw0rd");

                assertEquals("https://www.instagram.com/", driver.getCurrentUrl());

            }*/

            @Test
            public void negativeTest2() {
                InstagramStartPage startPage = new InstagramStartPage(driver);
                startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
                startPage.setFullName("someFirstName someLastName");
                startPage.setUsername("userName");
                startPage.setPassword("P@ssw0rd");
                startPage.clickSignUpButtonExpectingFailure();

                assertEquals("https://www.instagram.com/", driver.getCurrentUrl());
                assertEquals("This username isn't available. Please try another.", startPage.getErrorMessage());
                assertEquals("Get the app.", startPage.getAppsForOsAndAndroid());

            }
        }


