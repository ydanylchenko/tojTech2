package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class HandleMultipleWindowsUdemy {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//a[@id='cookie-use-link'] ")).click();
        System.out.println(driver.getTitle()); // it got parent Title
        Set<String> ids = driver.getWindowHandles();
        Iterator <String> it =ids.iterator();
        String parentid=it.next();
        String childid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);

    }
}
