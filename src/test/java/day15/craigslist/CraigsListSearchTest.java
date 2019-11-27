package day15.craigslist;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
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
    }

    @Test
    public void locatorsExamples() {
        {
            {
                By logoElementLocator = By.id("logo");
                WebElement logoElementFoundById = driver.findElement(logoElementLocator);
                System.out.println("text in element found by id:");
                System.out.println(logoElementFoundById.getText());
            }
            {
                By logoElementLocator = By.linkText("craigslist");
                WebElement logoElementFoundByLinkText = driver.findElement(logoElementLocator);
                System.out.println("text in element found by linkText:");
                System.out.println(logoElementFoundByLinkText.getText());
            }
            {
                By logoElementLocator = By.partialLinkText("aigsli");
                WebElement logoElementFoundByPartialLinkText = driver.findElement(logoElementLocator);
                System.out.println("text in element found by partialLinkText:");
                System.out.println(logoElementFoundByPartialLinkText.getText());
            }
        }
        {
            {
                By calendarElementLocator = By.className("cal");
                WebElement calendarElementsFoundByClass = driver.findElement(calendarElementLocator);
                System.out.println("text in elements found by class:");
                System.out.println(calendarElementsFoundByClass.getText());
            }
            {
                By calendarElementLocator = By.tagName("table");
                WebElement calendarElementsFoundByTagName = driver.findElement(calendarElementLocator);
                System.out.println("text in elements found by tagName:");
                System.out.println(calendarElementsFoundByTagName.getText());
            }
        }
        {
            {
                By searchInputElementLocator = By.name("query");
                WebElement searchInputElementFoundByName = driver.findElement(searchInputElementLocator);
                System.out.println("placeholder attribute of element found by name:");
                System.out.println(searchInputElementFoundByName.getAttribute("placeholder"));
            }
            {
                By searchInputElementLocator = By.id("query");
                WebElement searchInputElementFoundById = driver.findElement(searchInputElementLocator);
                System.out.println("placeholder attribute of element found by id:");
                System.out.println(searchInputElementFoundById.getAttribute("placeholder"));
            }
        }
        {
            System.out.println(By.id("ui-id-1"));
            System.out.println(driver.findElements(By.id("ui-id-1")).size());
            System.out.println(By.id("topban"));
            System.out.println(driver.findElements(By.id("topban")).size());
            System.out.println(By.name("lastLink"));
            System.out.println(driver.findElements(By.name("lastLink")).size());
            System.out.println(By.name("lastTitle"));
            System.out.println(driver.findElements(By.name("lastTitle")).size());
            System.out.println(By.tagName("script"));
            System.out.println(driver.findElements(By.tagName("script")).size());
            System.out.println(By.tagName("section"));
            System.out.println(driver.findElements(By.tagName("section")).size());
            System.out.println(By.className("bglogo"));
            System.out.println(driver.findElements(By.className("bglogo")).size());
            System.out.println(By.className("unfaves"));
            System.out.println(driver.findElements(By.className("unfaves")).size());
            System.out.println(By.linkText("lost+found "));
            System.out.println(driver.findElements(By.linkText("lost+found")).size());
            System.out.println(By.linkText("customer service"));
            System.out.println(driver.findElements(By.linkText("customer service")).size());
            System.out.println(By.partialLinkText("lost+fou"));
            System.out.println(driver.findElements(By.partialLinkText("lost+fou")).size());
            System.out.println(By.partialLinkText("customer serv"));
            System.out.println(driver.findElements(By.partialLinkText("customer serv")).size());
        }
    }
}
