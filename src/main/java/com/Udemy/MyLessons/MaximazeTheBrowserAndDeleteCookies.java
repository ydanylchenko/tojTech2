package com.Udemy.MyLessons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MaximazeTheBrowserAndDeleteCookies {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        /*A HTTP cookie is comprised of information about the user and their preferences.
        It stores information using a key-value pair. It is a small piece of data sent from
        Web Application and stored in Web Browser, while the user is browsing that website.
        Each cookie is associated with a name, value, domain, path, expiry, and the status of whether
        it is secure or not. In order to validate a client, a server parses all of these values in a cookie.
        When Testing a web application using selenium web driver, you may need to create, update or delete a cookie.
        we usually delete cookies to make sure all the catches have been deleted when we are executing or we intentionally delete some
        of the cookies to validate the scenario, how the add would behave  */
        driver.manage().deleteAllCookies();
        driver.manage().deleteCookieNamed("abc"); // if we know a particular name of a cookie

        /*If you DELETE a SessionID cookie your script should log out - secure log in got log out and navigates to the
        home page. This could be a valid automation scenario.  How do u automate it?
        1. we will delete that cookie (it might have a sessionKey name)
        2. after deleting this cookie, if you click on anything on your website, it should automatically brings you to
        LogIn page
        3. click on any link
        4. validate/verify your LogIn url
         */
    }
}
