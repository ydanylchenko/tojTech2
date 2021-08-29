package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DynamicDropDownExample2 {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.delta.com/");
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//        new WebDriverWait(driver, 15).until(ExpectedConditions.textToBe(By.id("fromAirportName"), "YOUR AIRPORT"));//
        driver.findElement(By.xpath("//a[@id='fromAirportName']")).click();
        driver.findElement(By.className("btn-clear")).click();
        driver.findElement(By.id("search_input")).sendKeys("NYC");
        driver.findElement(By.xpath("//div[@class='search-result-container']/div/ul/li[3]")).click();

    }
}
