package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Assignment4 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.id("checkBoxOption3")).click();
        System.out.println(driver.findElement(By.id("checkBoxOption3")).isSelected());
        Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
        s.selectByValue("option3");
        System.out.println(driver.findElement(By.xpath("//select[@id='dropdown-class-example']//option[@value='option3']")).getText());
        driver.findElement(By.xpath("//input[@name='enter-name'] ")).sendKeys("option3");
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        String text=  driver.switchTo().alert().getText();
        System.out.println(driver.switchTo().alert().getText());



    }
}