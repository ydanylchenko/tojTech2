package com.Udemy.MyLessons;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxesExample {
    public static void main(String[] args) {
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());//
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        //System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());//

        //Count all checkboxes on the page. we will inspect all checkboxes on the page and find one common
        // locator, which is in our case "type=checkbox" and write CSS input[type='checkbox']//
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        Assert.assertEquals(driver.findElements(By.cssSelector("input[type='checkbox']")).size(), 6);
    }
}
