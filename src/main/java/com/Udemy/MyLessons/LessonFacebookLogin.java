package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LessonFacebookLogin {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("http://facebook.com");
        Driver.findElement(By.id("email")).sendKeys("this is my first code");
        Driver.findElement(By.name("pass")).sendKeys("123456");
        Driver.findElement(By.linkText("Forgot account?")).click();



    }

}
