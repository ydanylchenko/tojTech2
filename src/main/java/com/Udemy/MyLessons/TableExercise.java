package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TableExercise {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22879/nzxi-vs-eng-1st-t20-practice-match-england-tour-of-new-zealand-2019");
        //get common css selector for the table we need to work with.
        // we will throw this expression to the variable, called table. TABLE is a PARENT OBJECT. Using PARENT object,
        // we will locate the elements inside this table -concept of subsection elements.
        WebElement table = driver.findElement(By.cssSelector("div[class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
        // get # of the rows in the table
        int rowcount = table.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms']")).size();
        //build parent child relations, indication the value of the row we need.
        int count = driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).size();
        for (int i = 0; i < count-2; i++) // -2 to get rid of the values in Extras and Total rows
        {
            System.out.println(driver.findElements(By.cssSelector("div[class='cb-col cb-col-100 cb-scrd-itms'] div:nth-child(3)")).get(i).getText());
        }
    }
}
