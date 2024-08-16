package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterResultPage {

public WebDriver driver;
	
	@FindBy(xpath = "//div[contains( text(), 'Your registration completed')]")
	private WebElement registrationCompleteMessage;
	
	
	
	public RegisterResultPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	
	public boolean displayStatusOfRegistrationCompleteMessage() {
		boolean display = registrationCompleteMessage.isDisplayed();
		return display;
	}
	
}
