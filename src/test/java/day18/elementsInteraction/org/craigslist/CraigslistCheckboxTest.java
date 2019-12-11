package day18.elementsInteraction.org.craigslist;

import day18.elementsInteraction.org.craigslist.pageObjects.CraigslistSearchResultsPage;
import day18.elementsInteraction.org.craigslist.pageObjects.CraigslistStartPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CraigslistCheckboxTest {
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
    public void openSearchPage() {
        CraigslistSearchResultsPage searchResultsPage = new CraigslistStartPage(driver).setSearchCriteria("toaster").submit();
        searchResultsPage.clickSearchTitlesOnly();
        searchResultsPage.markSearchTitlesOnly(false);
        searchResultsPage.markSearchTitlesOnly(true);
    }
}
