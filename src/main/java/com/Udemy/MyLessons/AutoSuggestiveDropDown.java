package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoSuggestiveDropDown {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.ksrtc.in");
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
        // use Keys.DOWN to go down the option list
        driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
        /*using Keys.DOWN we will verify if we can move the cursor down through the list.
        driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
        But we are not able to grab the text, as it is hidden and Selenium cant identify the hidden elements/
        Ajax implementation. JavaScript DOM API can handle/extract hidden elements
        System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
        How to shift your language to JavaScript, when you are working with Java?
        For this purpose, API JavaScript Executor was introduced in Selenium. To create JavascriptExecutor,
        we need to define it*/
        JavascriptExecutor js = (JavascriptExecutor)driver;
        String script = "return document.getElementById(|\"fromPlaceName\").value;"; //this is our complete script.
        // we had an error bcz of the double quotes. to fix the problem, using backslashes,
        // put semicolon at the end (.value;) - it is a MUST
        String text = (String) js.executeScript(script);
        System.out.println(text);
        while (!text.equalsIgnoreCase("BENGALURU INTERNATION AIRPORT"))
        //negation of true is false, so it will be looping until it finds BENGALURU INTERNATION AIRPORT
        {
            driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);
            text = (String) js.executeScript(script);
            System.out.println(text);
        }



    }
}
