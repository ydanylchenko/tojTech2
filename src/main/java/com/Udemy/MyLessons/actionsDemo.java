package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.com/");
        Actions a = new Actions(driver);
        a.moveToElement(driver.findElement(By.xpath("//input[@id='twotabsearchtextbox'] "))).click().
                keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        a.moveToElement(driver.findElement(By.xpath("//a[@data-nav-role='signin'] "))).contextClick().build().perform();

    }
}
