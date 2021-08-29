package com.Udemy.MyLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lesson1 {
    public static void main(String[] args) {

        // Selenium code
        // create Driver Object for Chrome Driver - WebDriver is an interface and provides all methods for automation
        // to launch the browser using WebDriver
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
        driver.get("http://yahoo.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        driver.quit();

    }
}
