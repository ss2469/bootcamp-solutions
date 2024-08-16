package com.demowebshop.TestCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.demowebshop.Pages.CheckoutPage;
import com.demowebshop.Pages.HomePage;
import com.demowebshop.Pages.LoginPage;
import com.demowebshop.Pages.ProductPage;
import com.demowebshop.Pages.ShoppingCartPage;
import com.demowebshop.TestBase.TestBase;

/*
 * Create a Page Object Model for the checkout page of a website. Use Page
 * Factory to initialize the elements. Write a TestNG test to add a product to
 * the cart, navigate to the checkout page, and verify that the correct product
 * is being purchased.
 * 
 */

public class CheckoutTest_Q2Medium extends TestBase {

	public CheckoutTest_Q2Medium() throws Exception {
		super();
	}

	public WebDriver driver;
	public HomePage homepage;
	public LoginPage loginpage;
	public ProductPage productpage;
	public ShoppingCartPage cartpage;
	public CheckoutPage checkoutpage;
	public WebDriverWait wait;

	@BeforeMethod
	public void checkoutSetup() {
		driver = initializeBrowserAndOpenApplication(prop.getProperty("browser"));
	}

	@Test
	public void completeCheckout() {

		homepage = new HomePage(driver);
		loginpage = new LoginPage(driver);
		productpage = new ProductPage(driver);
		cartpage = new ShoppingCartPage(driver);
		checkoutpage = new CheckoutPage(driver);

		homepage.clickOnLoginLink();
		loginpage.enterEmailInEmailTextbox(prop.getProperty("validEmail"));
		loginpage.enterPasswordInPasswordTextbox(prop.getProperty("validPassword"));
		loginpage.clickOnLoginButton();

		homepage.clickOnValidProductLink();
		productpage.clickOnAddToCartButton();
		
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//a[text() = 'Shopping cart']"))));
		homepage.clickOnShoppingCartLink();
		Assert.assertTrue(cartpage.getTextOfProductName().contains(dataprop.getProperty("addedProductName")));

		// steps for purchasing the valid product
		checkoutpage.clickOnTermsCheckbox();
		checkoutpage.clickOnCheckoutButton();
		
		checkoutpage.clickOnContinueButtonOFBillingAddress();
		checkoutpage.clickOnContinueButtonOFShippingAddress();
		checkoutpage.clickOnContinueButtonOFShippingMethod();
		checkoutpage.clickOnContinueButtonOFPaymentMethod();
		checkoutpage.clickOnContinueButtonOFPaymentInfo();
		checkoutpage.clickOnConfirmButton();
		
		Assert.assertTrue(checkoutpage.successMessageDisplayStatus());

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
