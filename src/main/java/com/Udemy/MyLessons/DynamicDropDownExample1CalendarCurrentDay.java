package com.Udemy.MyLessons;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class DynamicDropDownExample1CalendarCurrentDay {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://www.spicejet.com/");
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        driver.findElement(By.xpath("//div[@class='left1']//a[@value='BOM']")).click();
        driver.findElement(By.xpath("//div[@class='right1']//a[@value='COK']")).click();//to select present day in the calendar//
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-highlight.ui-state-active.ui-state-hover")).click();
        /*when we use CSS by class tag, the syntax is tagName=className. If the class name has spaces,
         we getting rid of the spaces by using . (dots) */

        /*System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
        driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).click();
        System.out.println(driver.findElement(By.xpath("//input[@name='ctl00$mainContent$view_date2']")).isEnabled());
        -- The result is TRUE, TRUE, though the result for the 1st outcome should be FALSE, as the second calendar
        return date is disabled. "isEnabled" method doesn't work here. Using "isEnabled" method nn Selenium means
        that the element is disabled when you cant click on it. But the modern websites are developed the way that
        the element is disabled only in UI but when you click on it, it is getting enabled that confuses Selenium
        and isEnabled method gives a wrong outcome. --

        To solve the problem:  From Dev prospective, when smthing got changed (for ex. color) or disabled, dev has to
        set some attributes to HTML to show. we need to find an attribute that is changing by clicking on enable/disable
        or in our case"one way" and "round trip". In our case the opacity on website is changing the value from 0.5 to 1.
        */
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).getAttribute("style").contains(""))

        {
            System.out.println("it is Enabled");
            Assert.assertTrue(true);
        }
        else
        {
            System.out.println("it is Disabled");
            Assert.assertFalse(false);
        }
    }
}









