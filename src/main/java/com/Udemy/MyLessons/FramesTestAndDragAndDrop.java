package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesTestAndDragAndDrop {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='demo-frame']")));
        //driver.findElement(By.xpath("//div[@id='draggable']")).click();
        Actions a = new Actions(driver);
        WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
        a.dragAndDrop(source,target).build().perform();
        //System.out.println(driver.findElement(By.tagName("iframe")).size());
        driver.switchTo().defaultContent();


    }

    }



