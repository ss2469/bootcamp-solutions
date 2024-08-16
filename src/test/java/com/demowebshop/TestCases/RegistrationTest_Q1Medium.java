package com.demowebshop.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.HomePage;
import com.demowebshop.Pages.RegisterResultPage;
import com.demowebshop.Pages.RegistrationPage;
import com.demowebshop.TestBase.TestBase;
import com.demowebshop.Utilities.Util;

/*
 * Create a Page Object Model for the registration page of a website.
 * Use Page Factory to initialize the elements. 
 * Write a TestNG test to verify successful registration with valid credentials.
 * 
 */

public class RegistrationTest_Q1Medium extends TestBase {
	
	public RegistrationTest_Q1Medium() throws Exception {
		super();
	}

	public WebDriver driver;
	
	@BeforeMethod
	public void registrationSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
		HomePage homepage = new HomePage(driver);
		homepage.clickOnRegisterLink();
	}
	
	@Test
	public void registerWithValidCredentials() {
		
		RegistrationPage registerpage = new RegistrationPage(driver);
		registerpage.clickOnGenderRadioButtonFemale();
		registerpage.enterFirstNameInTextBox(dataprop.getProperty("firstname"));
		registerpage.enterLastNameInTextBox(dataprop.getProperty("lastname"));
		registerpage.enterEmailInTextBox(Util.emailWithDateTimeStamp());
		registerpage.enterPasswordInTextBox(dataprop.getProperty("password"));
		registerpage.enterConfirmPasswordInTextBox(dataprop.getProperty("confirmPassword"));
		registerpage.clickOnRegisterButton();
		
		RegisterResultPage registerresultpage = new RegisterResultPage(driver);
		Assert.assertTrue(registerresultpage.displayStatusOfRegistrationCompleteMessage());
	}
	
	@AfterMethod
	public void teardown() {
		driver.quit();
	}
	

}
