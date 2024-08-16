package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage {
	
public WebDriver driver;
	
	@FindBy(css = ".cart-item-row")
	private WebElement productRow;
	
	@FindBy(css = ".cart-item-row>td:nth-child(3)>a")
	private WebElement productName;
	
	
	
	
	public ShoppingCartPage(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public boolean addedProductDisplayStatus() {
		boolean display = productRow.isDisplayed();
		return display;
	}
	
	public String getTextOfProductName() {
		String userEmail = productName.getText();
		return userEmail;
	}

}
