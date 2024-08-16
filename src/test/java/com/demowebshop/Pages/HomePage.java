package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public WebDriver driver;

	@FindBy(linkText = "Log in")
	private WebElement loginLink;

	@FindBy(className = "ico-register")
	private WebElement registerLink;

	@FindBy(css = ".header-links .account")
	private WebElement userEmailIDLink;

	@FindBy(xpath = "//a[text() = 'Shopping cart']")
	private WebElement shoppingCartLink;

	@FindBy(linkText = "14.1-inch Laptop")
	private WebElement validProductLink;

	@FindBy(css = ".header-logo>a")
	private WebElement homePageLogo;

	@FindBy(linkText = "$25 Virtual Gift Card")
	private WebElement productPresentOnHomePage;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnLoginLink() {
		loginLink.click();
	}

	public void clickOnRegisterLink() {
		registerLink.click();
	}

	public boolean userEmailIDLinkDisplayStatus() {
		boolean display = userEmailIDLink.isDisplayed();
		return display;
	}

	public String getTextOfUserEmailID() {
		String userEmail = userEmailIDLink.getText();
		return userEmail;
	}

	public void clickOnShoppingCartLink() {
		shoppingCartLink.click();
	}

	public void clickOnValidProductLink() {
		validProductLink.click();
	}

	public void clickOnHomePageLogo() {
		homePageLogo.click();
	}

	public boolean productDisplayStatus() {
		boolean display = productPresentOnHomePage.isDisplayed();
		return display;
	}

	public void clickOnAProductPresentOnHomePage() {
		productPresentOnHomePage.click();
	}

}
