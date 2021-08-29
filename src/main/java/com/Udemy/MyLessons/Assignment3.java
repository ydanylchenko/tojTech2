package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Assignment3 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/");
        driver.findElement(By.xpath("//a[.='Multiple Windows']  ")).click();
        driver.findElement(By.xpath("//a[.='Click Here']  ")).click();
        System.out.println(driver.findElement(By.xpath("//a[.='Click Here']  ")).getText());
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        String childid=it.next();
        String parentid=it.next();
        driver.switchTo().window(childid);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentid);


    }
}
