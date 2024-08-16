package com.demowebshop.TestCases;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.HomePage;
import com.demowebshop.Pages.LoginPage;
import com.demowebshop.TestBase.TestBase;

/*
 * Create a Page Object Model for the login page of a website. Use Page Factory
 * to initialize the elements. Write a TestNG test to verify successful login
 * with valid credentials.
 * 
 */

public class LoginTest_Q1Difficult extends TestBase {

	public LoginTest_Q1Difficult() throws Exception {
		super();

	}

	public WebDriver driver;
	public HomePage homepage;
	public LoginPage loginpage;

	@BeforeMethod
	public void loginSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		homepage = new HomePage(driver);
		homepage.clickOnLoginLink();
	}

	@Test
	public void verifyLoginWithValidCredentials() {
		loginpage = new LoginPage(driver);
		loginpage.enterEmailInEmailTextbox(prop.getProperty("validEmail"));
		loginpage.enterPasswordInPasswordTextbox(prop.getProperty("validPassword"));
		loginpage.clickOnLoginButton();
		Assert.assertTrue(homepage.userEmailIDLinkDisplayStatus());
		Assert.assertEquals(homepage.getTextOfUserEmailID(), prop.getProperty("validEmail"));
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
