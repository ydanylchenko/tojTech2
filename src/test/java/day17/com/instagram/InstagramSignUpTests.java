package day17.com.instagram;

import day17.com.instagram.pageObjects.InstagramProfilePage;
import day17.com.instagram.pageObjects.InstagramStartPage;
import day17.com.instagram.pageObjects.InstagramNotificationsForm;
import day17.com.instagram.pageObjects.InstagramSuggestionsForYouPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static day17.com.instagram.Helpers.getUniqueUserName;
import static org.junit.Assert.assertEquals;

public class InstagramSignUpTests {
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
    public void signUpWithNotUniqueUserName() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        startPage.setFullName("someFirstName someLastName");
//        this userName is already used
        startPage.setUsername("userName");
        startPage.setPassword("P@ssw0rd");
        startPage.clickSignUpButtonExpectingFailure();
        assertEquals("This username isn't available. Please try another.", startPage.getErrorMessage());
    }

    @Test
    public void signUp() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
    }

    @Test
    public void signUpWithNoEmail() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail("");
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
    }

    @Test
    public void signUpWithNoFullNameInput() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "";
        startPage.setFullName(fullName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
    }

    @Test
    public void signUpWithNoPasswordInput() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
        assertEquals("Create a password at least 6 characters long.", startPage.getErrorMessage());
    }

    @Test
    public void signUpWithWrongEmail() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail("зачембля@yahoocom");
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
        assertEquals("Enter a valid email address.", startPage.getErrorMessage());
    }

    @Test
    public void signUpWithTooShortPassword() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("ghqw7");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
        assertEquals("Create a password at least 6 characters long.", startPage.getErrorMessage());
    }

    @Test
    public void signUpWithSpecialCharactersPasswordOnly() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName someLastName";
        startPage.setFullName(fullName).setPassword("@!$#$%$^&%&^*&^*(&(*&(**&^&%#@)((&%^&");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
        assertEquals("Create a password at least 6 characters long.", startPage.getErrorMessage());
        assertEquals("Sorry, something went wrong creating your account. Please try again soon.", startPage.getErrorMessage());

    }
    @Test
    public void signUpWithUserNameContainingSpecialSymbol() {
        InstagramStartPage startPage = new InstagramStartPage(driver);
        startPage.setMobileNumberOrEmail(Helpers.getUniqueEmail());
        String userName = getUniqueUserName();
        startPage.setUsername(userName);
        String fullName = "someFirstName@";
        startPage.setFullName(fullName).setPassword("P@ssw0rd");
        InstagramNotificationsForm instagramNotificationsForm = startPage.clickSignUpButton();
        InstagramSuggestionsForYouPage suggestionsForYouPage = instagramNotificationsForm.clickNotNowButton();
        InstagramProfilePage profilePage = suggestionsForYouPage.clickProfileButton();
        assertEquals("UserName", userName, profilePage.getUserName());
        assertEquals("Full Name", fullName, profilePage.getFullName());
        assertEquals("Title", String.format("%s (@%s) • Instagram photos and videos", fullName, userName), profilePage.getTitle());
    }
}
