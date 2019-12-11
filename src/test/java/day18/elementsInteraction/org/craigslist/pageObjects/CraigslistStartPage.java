package day18.elementsInteraction.org.craigslist.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CraigslistStartPage {
    private static final By languageSelectLocator = By.id("chlang");
    WebDriver driver;

    public CraigslistStartPage(WebDriver browser) {
        driver = browser;
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.titleContains("craigslist: "));
    }

    public CraigslistStartPage setSearchCriteria(String searchCriteria) {
        By searchCriteriaInputLocator = By.id("query");
        WebElement searchCriteriaInput = driver.findElement(searchCriteriaInputLocator);
        searchCriteriaInput.sendKeys(searchCriteria);
        return this;
    }

    public CraigslistSearchResultsPage submit() {
        driver.findElement(By.id("query")).submit();
        return new CraigslistSearchResultsPage(driver);
    }

    public String getSelectedLanguage() {
        WebElement select = driver.findElement(languageSelectLocator);
//        Find select element and get text out of it:
        String textInSelect = select.getText();
//        System.out.println("Text in select element: " + textInSelect);
//        Using option based locator:
        By selectedOptionLocator = By.xpath("//select[@id=\"chlang\"]/option[@selected]");
        String selectedOptionText = driver.findElement(selectedOptionLocator).getText();
        System.out.println("Using option element locator: " + selectedOptionText);
//        Using Select class:
        Select selectLanguage = new Select(select);
//        print all available options
        System.out.println("Available options: ");
        for (WebElement option : selectLanguage.getOptions()) {
//            System.out.println(option.getText());
        }
        String firstSelectedOption = selectLanguage.getFirstSelectedOption().getText();
        System.out.println("First selected option from select object: " + firstSelectedOption);
        return firstSelectedOption;
    }

    public CraigslistStartPage selectLanguageByVisibleText(String language) {
        Select selectLanguage = new Select(driver.findElement(languageSelectLocator));
        selectLanguage.selectByVisibleText(language);
        return new CraigslistStartPage(driver);
    }

    public CraigslistStartPage selectLanguageByValue(String languageValue) {
        Select selectLanguage = new Select(driver.findElement(languageSelectLocator));
        selectLanguage.selectByValue(languageValue);
        return new CraigslistStartPage(driver);
    }

    public CraigslistStartPage selectLanguageByIndex(int languageIndex) {
        Select selectLanguage = new Select(driver.findElement(languageSelectLocator));
        selectLanguage.selectByIndex(languageIndex);
        return new CraigslistStartPage(driver);
    }
}
