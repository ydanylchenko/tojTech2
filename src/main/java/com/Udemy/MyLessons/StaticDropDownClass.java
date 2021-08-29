package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropDownClass {
    public static void main(String[] args) {
        WebDriver driver =new ChromeDriver();
        driver.get("https://www.aa.com/homePage.do");
        driver.findElement(By.xpath("//input[@name='originAirport']")).sendKeys("JFK");
        driver.findElement(By.cssSelector("input[name='destinationAirport']")).sendKeys("CLT");
        driver.findElement(By.xpath("//input[@id='aa-leavingOn']")).sendKeys("04/25/2020");
        driver.findElement(By.cssSelector("input[id='aa-returningFrom']")).sendKeys("05/21/2020");
        Select s = new Select(driver.findElement(By.name("adultOrSeniorPassengerCount")));
        s.selectByValue("2");
        s.selectByIndex(6);
        driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']")).click();

        //to handle static Drop Down that has "select" tag we can select by value, visible text and index

    }
}
