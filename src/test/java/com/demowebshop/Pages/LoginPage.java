package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	@FindBy(id = "Email")
	private WebElement emailTextbox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextbox;
	
	@FindBy(css = ".button-1.login-button")
	private WebElement loginButton;
	
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterEmailInEmailTextbox(String emailText){
		emailTextbox.sendKeys(emailText);
	}
	
	public void enterPasswordInPasswordTextbox(String passwordText){
		passwordTextbox.sendKeys(passwordText);
	}
	
	public void clickOnLoginButton() {
		loginButton.click();
		
	}
}
