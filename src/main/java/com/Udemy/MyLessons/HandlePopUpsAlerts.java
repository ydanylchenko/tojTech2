package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpsAlerts {
    public static void main(String[] args) {
        String text = ("Ekaterina Kadyrova");
        WebDriver driver = new ChromeDriver();
        //PopUps are not HTML based they are Javascript and Selenium by default cannot handle them.
        //The mechanism provided by Selenium is to handle PopUps as Alerts
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.name("enter-name")).click();
        driver.findElement(By.cssSelector("[id='name']")).sendKeys(text);
        driver.findElement(By.id("alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept(); // press OK
        driver.findElement(By.id("confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().dismiss();// press CANCEL

        //window authentication PopUps that can't be handled by AutoIT.
    }
}