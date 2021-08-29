package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DropDownExample3ArrorDownAndLoop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.makemytrip.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input[@value='Delhi'] ")).click();
        driver.findElement(By.xpath("//input[@aria-autocomplete='list'] ")).sendKeys("Mumbai");
        driver.findElement(By.xpath("//p[.='Mumbai, India']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).click();
        driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys("De");
        /*driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ARROW_DOWN);*/
        int i = 0;
        for (i = 0; i < 5; i++) {
            driver.findElement(By.xpath("//input[@placeholder='To']")).sendKeys(Keys.ENTER);
        }
    }
}

