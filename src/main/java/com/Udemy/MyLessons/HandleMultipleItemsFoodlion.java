package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HandleMultipleItemsFoodlion {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://shop.foodlion.com/shop/categories/37");
        driver.findElement(By.xpath("//ul[@class='subcategories categories-grid ng-scope']//div [.='Lunchables']")).click();




    }
}
