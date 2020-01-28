package com.exta;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotEquals;

/**
 * We have a web page and on the page there are two tables: table1 and table2.
 * The content of table1 are characters A,B,C,D one character per each line;
 * The content of table2 are characters B,C,F,G one character per each line;
 * What you want to do is to try to test compares of content of these two tables.
 * And the test would fail if there were any matching elements on the tables;
 * The test would also list out all the matching elements on the tables.
 * E.g. in this case the test should fail because there is matching element D and it should
 */
public class ColumnsComparison {
    private WebDriver driver;

    @Before
    public void setUp() throws InterruptedException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://htmledit.squarefree.com/");
        new WebDriverWait(driver, 15).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("editbox"));
        WebElement textInput = driver.findElement(By.tagName("textarea"));
        textInput.clear();
        String table1 = "<table name=\"table1\" border>" +
                "  <tr>" +
                "    <td>A</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>B</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>C</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>D</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>H</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>S</td>" +
                "  </tr>" +
                "</table>";
        String table2 = "<table name=\"table2\" border>" +
                "  <tr>" +
                "    <td>B</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>C</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>F</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>G</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>H</td>" +
                "  </tr>" +
                "  <tr>" +
                "    <td>K</td>" +
                "  </tr>" +
                "</table>";
        textInput.sendKeys(table1);
        textInput.sendKeys("<br>");
        textInput.sendKeys(table2);
        driver.switchTo().parentFrame();
        new WebDriverWait(driver, 15).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt("dynamicframe"));
        Thread.sleep(2000);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void comparisonTestOptionOne() {
        String dynamicLocator = "//table[@name='%s']//tr[%d]/td";
        int rowsAmount = driver.findElement(By.tagName("table")).findElements(By.tagName("td")).size();
        for (int i = 1; i <= rowsAmount; i++) {
            String firstTableCell = driver.findElement(By.xpath(String.format(dynamicLocator, "table1", i))).getText();
            String secondTableCell = driver.findElement(By.xpath(String.format(dynamicLocator, "table2", i))).getText();
            assertNotEquals("First table cell `" + firstTableCell + "' matches second table cell '" + secondTableCell + "'",
                    firstTableCell, secondTableCell);
        }
    }

    /**
     * This is what Khurshed told
     */
    @Test
    public void comparisonTestOptionTwo() {
        List<WebElement> table1Elements = driver.findElement(By.name("table1")).findElements(By.tagName("td"));
        List<WebElement> table2Elements = driver.findElement(By.name("table2")).findElements(By.tagName("td"));
        for (int i = 0; i < table1Elements.size(); i++) {
            String firstTableCell = table1Elements.get(i).getText();
            String secondTableCell = table2Elements.get(i).getText();
            assertNotEquals("First table cell `" + firstTableCell + "' matches second table cell '" + secondTableCell + "'",
                    firstTableCell, secondTableCell);
        }
    }
}
