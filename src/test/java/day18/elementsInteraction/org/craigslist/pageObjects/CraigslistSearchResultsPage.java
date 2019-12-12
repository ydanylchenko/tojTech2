package day18.elementsInteraction.org.craigslist.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CraigslistSearchResultsPage {
    WebDriver driver;

    CraigslistSearchResultsPage(WebDriver browser) {
        driver = browser;
        WebDriverWait wait = new WebDriverWait(driver, 2);
        //div[@id='sortable-results']
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("sortable-results")));
    }

    public CraigslistSearchResultsPage selectArea(String area) {
        By areaSelectLocator = By.id("areaAbb");
        WebElement areaSelectElement = driver.findElement(areaSelectLocator);
        Select areaSelect = new Select(areaSelectElement);
        areaSelect.selectByVisibleText(area);
        return new CraigslistSearchResultsPage(driver);
    }

    public CraigslistSearchResultsPage selectSubArea(String subArea) {
        By subAreaSelectLocator = By.id("subArea");
        WebElement subAreaSelectElement = driver.findElement(subAreaSelectLocator);
        Select subAreaSelect = new Select(subAreaSelectElement);
        subAreaSelect.selectByVisibleText(subArea);
        return new CraigslistSearchResultsPage(driver);
    }

    public CraigslistSearchResultsPage clickSearchTitlesOnly() {
        By checkboxContains = By.xpath("//label[text()[contains(.,'search titles only')]]");
//        By checkboxComplex = By.xpath("//div[@class=\"searchgroup\"]//input[@name='srchType']");
        driver.findElement(checkboxContains).click();
        return new CraigslistSearchResultsPage((driver));
    }

    public boolean isCategoryInMainCategories(String category) {
//        By categoryLocator = By.xpath("//ul[@class=\"maincats\"]/li/a[.='business']");
//        By categoryLocator = By.xpath("//ul[@class=\"maincats\"]/li/a[.='" + category + "']");
        By categoryLocator = By.xpath(String.format("//ul[@class=\"maincats\"]/li/a[.='%s']", category));
        int amountOfElements = driver.findElements(categoryLocator).size();
        return amountOfElements > 0;
    }

    public CraigslistSearchResultsPage markSearchTitlesOnly(boolean checked) {
        By checkboxContains = By.xpath("//label[text()[contains(.,'search titles only')]]/input");
        WebElement checkbox = driver.findElement(checkboxContains);
        boolean isAlreadySelected = checkbox.isSelected();
        if (isAlreadySelected != checked) {
            checkbox.click();
        }
        return new CraigslistSearchResultsPage((driver));
    }
}
