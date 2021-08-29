package com.Udemy.MyLessons;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class ScopeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerdriver = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerdriver.findElements(By.tagName("a")).size());
        WebElement firstcolumndriver = driver.findElement(By.xpath("//div[@id='gf-BIG']/table/tbody/tr/td[1]/ul "));
        System.out.println(firstcolumndriver.findElements(By.tagName("a")).size());
        WebElement headerdriver = driver.findElement(By.cssSelector("header.jumbotron.text-center.header_style "));
        System.out.println(headerdriver.findElements(By.tagName("a")).size());
        // click on each Link
        // Keys.chord(Keys.CONTROL,Keys.ENTER); // combination to click on any link that opens on a sep tab
        for (int i = 1; i < firstcolumndriver.findElements(By.tagName("a")).size(); i++) {
            String clickontag = Keys.chord(Keys.CONTROL, Keys.ENTER);
            firstcolumndriver.findElements(By.tagName("a")).get(i).sendKeys(clickontag);
        }
        Set<String> ids = driver.getWindowHandles();
        Iterator<String> it = ids.iterator();
        while (it.hasNext())   // we are asking if there is any next window/index present
        {
            driver.switchTo().window(it.next()); //iterator moves to the nex window if it is present
            System.out.println(driver.getTitle());
        }


        /* String parentId = it.next();
        String childId = it.next();
        String childId1= it.next();
        String childId2=it.next();
        driver.switchTo().window(childId);
        System.out.println(driver.getTitle());
        driver.switchTo().window(childId1);
        System.out.println(driver.getTitle());
        driver.switchTo().window(childId2);
        System.out.println(driver.getTitle());
        driver.switchTo().window(parentId);*/

    }
}



