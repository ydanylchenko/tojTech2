package com.Udemy.MyLessons;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class E2E {
    public static void main(String[] args) throws InterruptedException {
        //1.  create Driver Object for Chrome Driver - WebDriver is an interface and provides all methods for automation
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2.  launch the browser using WebDriver
        driver.get("https://www.spicejet.com/");
        //3.  find FROM box and click on it
        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
        //4. find TO from the left city "Hyderabad" and using parent-child relationship write an Xpath
        driver.findElement(By.xpath("//div[@class='left1']//a[@text='Hyderabad (HYD)']")).click();
        Thread.sleep(2000);
        //5. find TO from the right city "Goa" and using parent-child relationship write an Xpath
        driver.findElement(By.xpath("//div[@class='right1']//a[@text='Goa (GOI)'] ")).click();
        //6. using CSS current Departure day is found / the code will be the same for the current day
        driver.findElement(By.cssSelector("a.ui-state-default.ui-state-active")).click();
        //7. using CSS passengers box is found
        driver.findElement(By.cssSelector("div.row1.adult-infant-child")).click();
        // Using Select function and selectByValue 5 passengers are indicated
        Select dropdow = new Select(driver.findElement(By.xpath("//select[@name='ctl00$mainContent$ddl_Adult']")));
        dropdow.selectByValue("5");
        //Found Currency Box
        driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")).click();
        // Using Select method UDS currency is chosen
        Select dropdown1 = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
        dropdown1.selectByVisibleText("USD");
        // Checkboxes - found out if Senior citizen is selected
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        //Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).click();
        //Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        System.out.println(driver.findElement(By.id("ctl00_mainContent_chk_SeniorCitizenDiscount")).isSelected());
        // check how many checkboxes are on the page
        System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
        // Check if Return Date via Round Trip is enabled
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style")); // check the return date
        // before we click on round trip
        driver.findElement(By.cssSelector("input[value='RoundTrip']")).click(); // click on round trip
        System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
        if (driver.findElement(By.cssSelector("input[value='RoundTrip']")).getAttribute("style").contains("1")) {
            System.out.println("it is Disabled");
            Assert.assertTrue(true);
        } else {

            System.out.println("it is Enabled");
            Assert.assertFalse(false);
        }
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();


    }

}
