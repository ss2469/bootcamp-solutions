package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {

	public WebDriver driver;

	@FindBy(id = "termsofservice")
	private WebElement termsCheckbox;

	@FindBy(id = "checkout")
	private WebElement checkoutButton;

	@FindBy(id = "BillingNewAddress_City")
	private WebElement cityTextBox;

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1TextBox;

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement postCodeTextBox;

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phoneTextBox;

	@FindBy(css = "#billing-buttons-container>input")
	private WebElement continueButtonBilling;

	@FindBy(css = "#shipping-buttons-container>input")
	private WebElement continueButtonShipping;

	@FindBy(css = "#shipping-method-buttons-container>input")
	private WebElement continueButtonShippingMethod;

	@FindBy(css = "#payment-method-buttons-container>input")
	private WebElement continueButtonPaymentMethod;

	@FindBy(css = "#payment-info-buttons-container>input")
	private WebElement continueButtonPaymentInfo;

	@FindBy(css = "#confirm-order-buttons-container>input")
	private WebElement confirmButton;

	@FindBy(xpath = "//strong[contains(text(), 'successfully processed')]")
	private WebElement successMessageOrderPlaced;

	public CheckoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnTermsCheckbox() {
		termsCheckbox.click();
	}

	public void clickOnCheckoutButton() {
		checkoutButton.click();
	}

	public void fillingBillingAddress(String cityText, String address1Text, String postcodeText, String phoneText) {
		cityTextBox.sendKeys(cityText);
		address1TextBox.sendKeys(address1Text);
		postCodeTextBox.sendKeys(postcodeText);
		phoneTextBox.sendKeys(phoneText);
	}

	public void clickOnContinueButtonOFBillingAddress() {
		continueButtonBilling.click();
	}

	public void clickOnContinueButtonOFShippingAddress() {
		continueButtonShipping.click();
	}

	public void clickOnContinueButtonOFShippingMethod() {
		continueButtonShippingMethod.click();
	}

	public void clickOnContinueButtonOFPaymentMethod() {
		continueButtonPaymentMethod.click();
	}

	public void clickOnContinueButtonOFPaymentInfo() {
		continueButtonPaymentInfo.click();
	}

	public void clickOnConfirmButton() {
		confirmButton.click();
	}

	public boolean successMessageDisplayStatus() {
		boolean display = successMessageOrderPlaced.isDisplayed();
		return display;
	}

}
