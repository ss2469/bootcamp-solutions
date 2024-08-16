package com.demowebshop.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {
	
	public WebDriver driver;
	
	@FindBy(id = "gender-female")
	private WebElement genderRadioButtonFemale;
	
	@FindBy(id = "FirstName")
	private WebElement firstNameTextBox;
	
	@FindBy(id = "LastName")
	private WebElement lastNameTextBox;
	
	@FindBy(id = "Email")
	private WebElement emailTextBox;
	
	@FindBy(id = "Password")
	private WebElement passwordTextBox;
	
	@FindBy(id = "ConfirmPassword")
	private WebElement confirmPasswordTextBox;
	
	@FindBy(id = "register-button")
	private WebElement registerButton;
	
	
	
	
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnGenderRadioButtonFemale() {
		genderRadioButtonFemale.click();
	}
	
	public void enterFirstNameInTextBox(String fName) {
		firstNameTextBox.sendKeys(fName);
	}
	
    public void enterLastNameInTextBox(String lName) {
    	lastNameTextBox.sendKeys(lName);
	}

    public void enterEmailInTextBox(String email) {
    	emailTextBox.sendKeys(email);
	}
	
    public void enterPasswordInTextBox(String password) {
    	passwordTextBox.sendKeys(password);
    }

    public void enterConfirmPasswordInTextBox(String confirmPassword) {
    	confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    public void clickOnRegisterButton() {
    	registerButton.click();
	}
    
}
