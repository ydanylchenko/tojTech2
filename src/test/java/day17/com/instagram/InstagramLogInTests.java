package day17.com.instagram;

import day17.com.instagram.pageObjects.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static day17.com.instagram.Helpers.getUniqueUserName;
import static org.junit.Assert.assertEquals;

public class InstagramLogInTests {
    private WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        driver.get("https://www.instagram.com/");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void logInWithExistingAccount() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        InstagramLogInPage logInPage = startPage.clickLogInLink();
        String userName = "test1575682202313";
        logInPage.setUsername(userName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = logInPage.clickLogInButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        String fullName = "someFirstName someLastName";
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
    }
}
