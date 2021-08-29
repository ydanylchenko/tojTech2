package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownClassExample2 {
    public static void main(String[] args) {
        WebDriver Driver = new ChromeDriver();
        Driver.get("https://www.spicejet.com/");
        Driver.findElement(By.id("divpaxinfo")).click();
        Select s = new Select(Driver.findElement(By.name("ctl00$mainContent$ddl_Adult")));
        s.selectByIndex(6);
        System.out.println(Driver.findElement(By.className("paxinfo")).getText());
    }


    }

