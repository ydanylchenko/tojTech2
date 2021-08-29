package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class FluentWaitExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        driver.findElement(By.xpath("//div[@id='start']/button ")).click();
        Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).
                pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);

        WebElement foo = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                if (driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed()) {
                    return driver.findElement(By.xpath("//div[@id='finish']/h4"));
                }
                else
                    return null;
                }
        });
        System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).isDisplayed());
        System.out.println(driver.findElement(By.xpath("//div[@id='finish']/h4")).getText());

    }
}

/* Fluent wait block will be waiting for the text "Hello World" to be displayed, so isDisplayed  is true.
   If the text is not displayed yet, isDisplayed will be returning Null and the Fluent block will be repeating
   the cycle and monitoring until the text is displayed and only then isDisplayed will return True. */