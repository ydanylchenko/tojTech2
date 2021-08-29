package com.Udemy.MyLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSLCertification {
    public static void main(String[] args) {
        //we create an object for DesiredCapabilities to handle customized things for ChromeBrowser
        DesiredCapabilities ch = DesiredCapabilities.chrome(); // These Desiredcapabilities are general Chrome profile
        ch.acceptInsecureCerts();
        ch.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        ch.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

         //We can also use ch.setCapability, providing the type of capability as Accept_Insecure_Certs and pass the value as true
         // or/and Accept_SSL_Certs and pass the value as true.

        //these ChromeOptions belong to your local Browser
        ChromeOptions c = new ChromeOptions();
        c.merge(ch); // we merging the profile we creating into our actual browser

        /* we have designed a customized Chrome profile and now give knowledge to this "ch" object
        that it should accept an insecure certification. Now the general Chrome profile that we
        created merging with your local Chrome Browser. That means that your local Chrome Browser has knowledge
        of handling insecure certification. Now, when you create your local Chrome invocation as
        Webdriver driver = new ChromeDriver(), we need to pass this "c". ChromeOptions is our local browser, however
        we have already merged our general profile characteristics to our ChromeOptions, now we just passing "c" inside
        Webdriver driver = new ChromeDriver(c)*/
        WebDriver driver = new ChromeDriver(c);
 /* we continue writing our code. When application reaches the SSL Certification point, “proceed anyway”
         will be clicked automatically and goes to the next page.*/


    }
}
