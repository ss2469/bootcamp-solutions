package com.demowebshop.TestCases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.HomePage;
import com.demowebshop.Pages.ProductPage;
import com.demowebshop.TestBase.TestBase;

/*
 * Create a Page Object Model for the home page of a website. 
 * Use Page Factory to initialize the elements. 
 * Write a TestNG test to navigate to the home page, 
 * verify the presence of certain elements, and 
 * click on a link to navigate to a different page.
 * 
 */

public class HomePageTest_Q3Medium extends TestBase {

	public HomePageTest_Q3Medium() throws Exception {
		super();
	}

	public WebDriver driver;
	public HomePage homepage;
	public ProductPage productpage;

	@BeforeMethod
	public void homePageSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	}

	@Test
	public void navigateToHomePageAndverifyProductPresenceOnHomePage() {
		homepage = new HomePage(driver);
		// Click on the top logo, which takes to home page
		homepage.clickOnHomePageLogo();
		Assert.assertTrue(homepage.productDisplayStatus());
		homepage.clickOnAProductPresentOnHomePage();

		productpage = new ProductPage(driver);
		// 'Add to cart' button is visible On Product Page
		Assert.assertTrue(productpage.verifyDisplayOfAddToCartButtonOf25GiftCard());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
