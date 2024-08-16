package com.automation.easy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class EasySeleniumTests {

	public WebDriver driver;

	@BeforeMethod
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	// Q1 - Write a TestNG test to navigate to a website and verify the title of
	// the page.

	@Test(priority = 1)
	public void verifyTitleOfPage() {
		String expectedTitle = "Demo Web Shop";
		String actualTitle = driver.getTitle();
		System.out.println(actualTitle);
		Assert.assertTrue(actualTitle.contains(expectedTitle)); // substring of actual title

		Assert.assertEquals(actualTitle, expectedTitle); // exact match
	}

	// Q2 - Write a TestNG test to fill out a login form on a website and verify
	// successful login with valid credentials.

	@Test(priority = 2)
	public void verifyLoginWithValidCredentials() {

		// driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.cssSelector("#Email")).sendKeys("sumita2469@gmail.com");
		driver.findElement(By.cssSelector("#Password")).sendKeys("Selenium@123");

		driver.findElement(By.cssSelector(".button-1.login-button")).click();

		WebElement accountLink = driver.findElement(By.cssSelector(".header .account"));
		Assert.assertTrue(driver.findElement(By.cssSelector(".header .account")).isDisplayed());
		// xpath => //div[@class='header-links']//a[@class='account']

		Assert.assertEquals(accountLink.getText(), "sumita2469@gmail.com");
	}

	// Q3 - Write a TestNG test to navigate to a website, click on a link to
	// navigate to a different page, and verify the presence of certain elements on
	// the new page.

	@Test (priority = 3)
	public void verifyElementsOnProductDetailsPage() {
		
		driver.findElement(By.xpath("//ul[@class='top-menu']/li/a[contains(text(), 'Gift Cards')]")).click();
		
		Assert.assertTrue(driver.findElement(By.cssSelector(".breadcrumb>ul>li>.current-item")).isDisplayed());
		List<WebElement> elements = driver.findElements(By.className("product-title"));
		for (WebElement element : elements) {
		    Assert.assertTrue(element.isDisplayed(), "Element with class '.product-title' is not visible");
		    System.out.println(element.getText());
		}
	}

	@AfterMethod
	public void teardown() {
		driver.quit();
	}

}
