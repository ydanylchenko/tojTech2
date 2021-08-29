package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Assignment6 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("New");
        driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        System.out.println(driver.findElement(By.xpath("//input[@id='autocomplete']")).getText());
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String script = "return document.getElementById(\"autocomplete\").value;";
        String text = (String) js.executeScript(script);
        System.out.println(text);

        while (!text.equalsIgnoreCase("Papua New Guinea"))
        {
            driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
             text = (String) js.executeScript(script);
            System.out.println(text);

        }


    }
}
