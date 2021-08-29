package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class CalendarByUdemy {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.path2usa.com/travel-companions");
        driver.findElement(By.xpath("//*[@id='travel_date']")).click();
        while (!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).
                getText().contains("September"))
        {
            driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
        }
        List<WebElement> dates = driver.findElements(By.className("day"));
//Grab common attribute//Put into list and iterate
        int count = driver.findElements(By.className("day")).size();

        for (int i = 0; i < count; i++) {
            String text = driver.findElements(By.className("day")).get(i).getText();
            if (text.equalsIgnoreCase("23")) {
                driver.findElements(By.className("day")).get(i).click();
                break;
            }

        }
    }

}