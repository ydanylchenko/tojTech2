package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        WebElement table= driver. findElement(By.xpath("//table[@class='table-display']"));
        int numberofcolumns = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr")).size();
        System.out.println(numberofcolumns);
        int numberofrows = driver.findElements(By.xpath("//table[@class='table-display']/tbody/tr[2]/td")).size();
        System.out.println(numberofrows);
        String gettext = driver.findElement(By.xpath("//table[@class='table-display']/tbody/tr[3]/td[2]")).getText();
        System.out.println(gettext);


    }

}
/*
driver.get("http://qaclickacademy.com/practice.php");
        WebElement table=driver.findElement(By.id("product"));
        System.out.println(table.findElements(By.tagName("tr")).size());
        System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
        List<WebElement> secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
        System.out.println(secondrow.get(0).getText());
        System.out.println(secondrow.get(1).getText());
        System.out.println(secondrow.get(2).getText());
        }
        }

 */