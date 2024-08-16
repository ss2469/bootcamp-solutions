package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	public WebDriver driver;

	@FindBy(css = ".search-box-text.ui-autocomplete-input")
	private WebElement searchTextbox;

	@FindBy(css = ".button-1.search-box-button")
	private WebElement searchButton;

	@FindBy(linkText = "Desktop PC with CDRW")
	private WebElement productNameLink;

	public SearchPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void enterProductName(String validProductText) {
		searchTextbox.sendKeys(validProductText);
	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public boolean verifyProductDisplayStatus() {
		boolean displayStatus = productNameLink.isDisplayed();
		return displayStatus;
	}

	public void clickOnValidProduct() {
		productNameLink.click();
	}

}
