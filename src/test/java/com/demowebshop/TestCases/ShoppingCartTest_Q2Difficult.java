package com.demowebshop.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.HomePage;
import com.demowebshop.Pages.ProductPage;
import com.demowebshop.Pages.ShoppingCartPage;
import com.demowebshop.TestBase.TestBase;

/*
 * Create a Page Object Model for the shopping cart page of a website. Use Page
 * Factory to initialize the elements. Write a TestNG test to add a product to
 * the cart, navigate to the cart page, and verify that the product is added to
 * the cart.
 * 
 */

public class ShoppingCartTest_Q2Difficult extends TestBase {
	
public ShoppingCartTest_Q2Difficult() throws Exception {
		super();
	}

public WebDriver driver;
public HomePage homepage;
public ShoppingCartPage cartpage;
public ProductPage productpage;
public WebDriverWait wait;


	@BeforeMethod
	public void cartSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	}
	
	@Test
	public void verifyProductAddedToCart() {
		homepage = new HomePage(driver);
		productpage = new ProductPage(driver);
		cartpage = new ShoppingCartPage(driver);
		
		//Select a product from Home Page and click on it
		homepage.clickOnValidProductLink();
		
		//On Product Page click on 'Add to cart' button
		productpage.clickOnAddToCartButton();
		
		//Click on Shopping Cart link
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text() = 'Shopping cart']"))));
		
		homepage.clickOnShoppingCartLink();
		
		//Verify that product is added in the Cart
		Assert.assertTrue(cartpage.getTextOfProductName().contains(dataprop.getProperty("addedProductName")));
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}


}
