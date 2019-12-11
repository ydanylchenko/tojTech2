package day18.elementsInteraction.org.craigslist;

import day18.elementsInteraction.org.craigslist.pageObjects.CraigslistSearchResultsPage;
import day18.elementsInteraction.org.craigslist.pageObjects.CraigslistStartPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CraigslistSelectLanguageTest {
    WebDriver driver;

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
    public void switchLanguageTest() {
        CraigslistStartPage startPage = new CraigslistStartPage(driver);
        {
            assertEquals("english", startPage.getSelectedLanguage());
            assertNotEquals("日本語", startPage.getSelectedLanguage());
            assertNotEquals("русский", startPage.getSelectedLanguage());
            assertNotEquals("suomi", startPage.getSelectedLanguage());
        }
        startPage = startPage.selectLanguageByVisibleText("日本語");
        {
            assertNotEquals("english", startPage.getSelectedLanguage());
            assertEquals("日本語", startPage.getSelectedLanguage());
            assertNotEquals("русский", startPage.getSelectedLanguage());
            assertNotEquals("suomi", startPage.getSelectedLanguage());
        }
        startPage = startPage.selectLanguageByValue("?lang=ru&setlang=1");
        {
            assertNotEquals("english", startPage.getSelectedLanguage());
            assertNotEquals("日本語", startPage.getSelectedLanguage());
            assertEquals("русский", startPage.getSelectedLanguage());
            assertNotEquals("suomi", startPage.getSelectedLanguage());
        }
        startPage = startPage.selectLanguageByIndex(7);
        {
            assertNotEquals("english", startPage.getSelectedLanguage());
            assertNotEquals("日本語", startPage.getSelectedLanguage());
            assertNotEquals("русский", startPage.getSelectedLanguage());
            assertEquals("suomi", startPage.getSelectedLanguage());
        }
    }
}
