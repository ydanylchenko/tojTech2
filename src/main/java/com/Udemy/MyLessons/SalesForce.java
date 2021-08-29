package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        {
            Driver.get("https://login.salesforce.com/");
            Driver.findElement(By.id("username")).sendKeys("login");
            Driver.findElement(By.name("pw")).sendKeys("123456");
            Driver.findElement(By.xpath("//*[@id='Login']")).click();
            String text = Driver.findElement(By.cssSelector("div#error.loginError")).getText();
            System.out.println(Driver.findElement(By.cssSelector("div#error.loginError")).getText());

            /* Xpath syntax is //TagName[@attribute='value'] */
            //1st -CSS syntax is tagName[attribute='value']
            //2nd -CSS syntax is tagName#id
            //3rd -CSS syntax is tagName.classname
        }
    }
}
