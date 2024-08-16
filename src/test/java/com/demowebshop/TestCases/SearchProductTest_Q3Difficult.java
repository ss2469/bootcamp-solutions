package com.demowebshop.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.ProductPage;
import com.demowebshop.Pages.SearchPage;
import com.demowebshop.TestBase.TestBase;

/*
 * Create a Page Object Model for the search page of a website.
 * Use Page Factory to initialize the elements. 
 * Write a TestNG test to search for a product, verify that the search results are displayed,
 * and click on a specific product to navigate to its details page.
 * 
 */

public class SearchProductTest_Q3Difficult extends TestBase {

	public SearchProductTest_Q3Difficult() throws Exception {
		super();
	}

	public WebDriver driver;
	public SearchPage searchpage;
	public ProductPage productpage;

	@BeforeMethod
	public void searchProductSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	}

	@Test
	public void verifySearchWithValidProduct() {
		searchpage = new SearchPage(driver);
		searchpage.enterProductName(dataprop.getProperty("validProductName"));
		searchpage.clickOnSearchButton();

		Assert.assertTrue(searchpage.verifyProductDisplayStatus());
		searchpage.clickOnValidProduct();

		productpage = new ProductPage(driver);
		Assert.assertTrue(productpage.verifyDisplayOfProductDetails());
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
