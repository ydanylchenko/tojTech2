package com.Udemy.MyLessons;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class TakingScreenshots {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        /* if you want to take a screenshot, you have to your WebDriver object into screenshot object
        you can change it by casting driver with a method called TakesScreenshot
1. we casting our WebDriver object to TakeScreenshot, so it is ready to capture the screenshot by using the method
getScreenshotAs. this method will be visible only when you cast your Driver object to TakesScreenshot method.
As parameter we are passing a FILE, that means tell our WebDriver after taking a screenshot to script /to get
the output as a FILE format, so we can view. We store it in the src (source) object
Basically, we tell out driver to take a screenshot of google.come page and store it in the src object*/

        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
       /* 2. No this src object has to bring the screenshot into our local machine /desktop. Basically, need to copy
       the file from the src, to our local machine.*/

       FileUtils.copyFile(src,new File("C:\\Users\\dkady_000\\Desktop\\UDEMI Selenium\\Screenshot.png"));




    }
}
