package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductPage {

	public WebDriver driver;

	@FindBy(id = "add-to-cart-button-31")
	private WebElement addToCartButton;

	@FindBy(xpath = "//h1[ contains(text(), 'Desktop PC with CDRW') ]")
	private WebElement validProductDetail;

	@FindBy(id = "add-to-cart-button-2")
	private WebElement addToCartButtonOf25GiftCard;

	public ProductPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAddToCartButton() {
		addToCartButton.click();
	}

	public boolean verifyDisplayOfProductDetails() {
		boolean displayStatus = validProductDetail.isDisplayed();
		return displayStatus;
	}

	public boolean verifyDisplayOfAddToCartButtonOf25GiftCard() {
		boolean displayStatus = addToCartButtonOf25GiftCard.isDisplayed();
		return displayStatus;
	}

}
