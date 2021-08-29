package com.Udemy.MyLessons;

/*import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Array;
import java.sql.ClientInfoStatus;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HandleMultipleItemsUdemy {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        String[] veggiesInMyCart = {"Cucumber","Tomato","Beans"};
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        //1. need to identify product block and identify unique for every product
        // whatever we receive is a List of Web Elements.
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        // need to iterate through the products to find cucumber//
        for(int i=0;i<products.size();i++) // we iterate until the size of the product. in our case it is 30 products on the page
        {
           String name= products.get(i).getText();
           if (name.contains("Cucumber "))
               Thread.sleep(2000);
          // if the product is cucumber (get(i)), click on Add to cart
            driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
            break;
But what if we need a list of vegetables? we will declare Array of strings. Declared after creating Object for ChromeDriver
 Check whether the product name is extracted is present in Array or not. For that we will need to convert
 Array into ArrayList for easy search. Why we didnt use ArrayList from the beginning, as ArrayList takes a lot of memory

            List veggiesInMyCartList = Arrays.asList(veggiesInMyCart);

  if(veggiesInMyCartList.contains(name)   //we need to change our If statement. */
/*

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandleMultipleItemsUdemy {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        WebDriverWait w = new WebDriverWait(driver, 5);
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot"};
        driver.get("https://rahulshettyacademy.com/seleniumPractise/");
        Thread.sleep(3000);
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();
        driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));
        driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector("button.promoBtn")).click();
//explicit wait
        w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));
        System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());

    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
        for (int i = 0; i < products.size(); i++) {
//Brocolli - 1 Kg
//Brocolli,    1 kg
            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
//format it to get actual vegetable name
//convert array into array list for easy search
//  check whether name you extracted is present in arrayList or not-
            List itemsNeededList = Arrays.asList(itemsNeeded);
            if (itemsNeededList.contains(formattedName)) {
                j++;
//click on Add to cart
                driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
                if (j == itemsNeeded.length) {
                    break;
                }
            }
        }
    }
}

*/

