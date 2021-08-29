package com.Udemy.MyLessons;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import javax.swing.text.Element;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TableColumnsSorting {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
        driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
       // driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
        /* How to check whether column values in the tables are sorted or not?
        to verify all rows in the column if the order is DESC or ASC order by default
        1. we need to retrieve all fruit names that are in the columns
        2. once we retrieve all values, push them into ArrayList1
        3. Need to create another ArrayList2 an copy all elements from the ArrayList1 into the ArrayList2.
           Why? The reason behind it, if we copy items from ArrayList1 into the ArrayList2, we can apply sort()
           to the ArrayList2. When we apply sort and ask to print all the items presented in the List in ASC order,
           we will get a new ArrayList with the sorted order. Our goal is to verify if the new ArrayList (sorted)
           equals to the original ArrayList1. As we have to prove that the items stored in the original ArrayList1
           are displayed in ASC order by default */

        //Implementation: Step 1. Get all values from the column.
        List<WebElement> firstList = driver.findElements(By.cssSelector("tr td:nth-child(2)"));
        // we creating an Original ArrayList and iterate from the list of elements from "find elements" and
        //grab each and every element from this list
        ArrayList<String> originalList = new ArrayList<String>();
        for (int i = 0; i < firstList.size(); i++) {
            originalList.add(firstList.get(i).getText()); // printing every item in the list
        }
        /* now we need to copy all the items into the original ArrayList
        originalList.add(firstList.get(i).getText())
        Step 2. We created ArrayList2, which is empty. Need to Copy the items from the ArrayList1 into ArrayList2
        we will iterate from every value of the Original List and grab the size and place if the copiedList without
        grabbing the text, as we have already grabbed the text for the original List  */

        ArrayList<String> copiedList = new ArrayList<String>();
        for (int i = 0; i < originalList.size(); i++) {
            copiedList.add(originalList.get(i));
        }
        System.out.println("***");
        //Step 3. Need to Sort the copiedList. How to sort an ArrayList? We have Collection Framework in JAVA to
        //sort any ArrayList

        Collections.sort(copiedList);
        Collections.reverse(copiedList);

        for (String s : copiedList)// enhanced for loop. or we can rewrite for (int i=0; i<copiedList.size(); i++)
        {
            System.out.println(s);
        }
        System.out.println("******original*******");
        for (String s : originalList) {
            System.out.println(s);
        }

        //Step 4. Compare two ArrayLists, if both are the same, then we can say that these table column values
        // are in ASD order by default. We printing out both tables with the items: the original and the copied

        //Assert.assertTrue(originalList.equals(copiedList)); // originalList will return true if both Lists are the same
        //if it is not true, the test will fail. Test failed bcs the original table has "mango" in the end of the table.
        // the test works fine. that's a negative test case

        /*PART2. In order to have the test passed, we will click to the column Veg/Fruit Name, it will order the items
        in ASC order. clicking twice, bcs the web table requires.
        driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
        driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
        Insert in the beginning if the test

        PART 3. Verify if it in DESC Order. We will give once click as per our functionality
        driver.findElement(By.cssSelector("tr th:nth-child(2) b")).click();
        By default the sort() sorts by ASC order. How to convert into DESC order and compare?
        Using collection.reverse, we will convert.
        Collections.reverse(copiedList);
                 */


    }
}







