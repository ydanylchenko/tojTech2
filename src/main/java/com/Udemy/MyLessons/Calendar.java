package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Calendar {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.delta.com/");
        //1. click on the calendar
        driver.findElement(By.cssSelector("div.calDispValueCont.icon-Calendar  ")).click();
            while (!driver.findElement(By.cssSelector("div[class='dl-datepicker-group-wrapper'] span[class='dl-datepicker-month-1']")).
                    getText().contains("October"))
        {
            driver.findElement(By.cssSelector("a[class='dl-datepicker-1'] span[class='monthSelector'] ")).click();

        }
        //April 14 -we want to chose. we need to get the common attribute. In out case it is classname.
        // We need to get all dates into one list and then iterate
        List<WebElement> dates = driver.findElements(By.className("dl-datepicker-available-day"));
        // we getting the size of the month
        int count = driver.findElements(By.className("dl-datepicker-available-day")).size();
        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("dl-datepicker-available-day")).get(i).getText();
            if (text.equalsIgnoreCase("14")) {
                driver.findElements(By.className("dl-datepicker-available-day")).get(i).click(); //if 14 is found, click on it
                break; // to get out of the for loop, once we found 14

            }
        }
    }
}

