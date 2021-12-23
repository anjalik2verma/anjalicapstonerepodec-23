package com.cisco.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registration {
	
	public Registration(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(name="email_id")
	private WebElement emailTxtBox;
	public void enterEmail() {
		emailTxtBox.sendKeys("spiderman12223@gmail.com");
	}
	
	@FindBy(name="pwd")
	private WebElement passwordTxtBox;
	public void enterPassword() {
		passwordTxtBox.sendKeys("Spiderman@12223");
	}
	
	@FindBy(name="pwd2")
	private WebElement confirmPswdTxtBox;
	public void enterConfirmPassword() {
		confirmPswdTxtBox.sendKeys("Spiderman@12223");
	}
	
	@FindBy(name="name")
	private WebElement nameTxtBox;
	public void enterName() {
		nameTxtBox.sendKeys("Spidermmann");
	}
	
	@FindBy(name="address")
	private WebElement addressTxtBox;
	public void enterAddress() {
		addressTxtBox.sendKeys("Ameericaa");
	}
	
	@FindBy(name="city")
	private WebElement cityTxtBox;
	public void enterCity() {
		cityTxtBox.sendKeys("Queenn");
	}
	
	@FindBy(css="body > form > table > tbody > tr:nth-child(7) > td > button")
	private WebElement signUpBtn;
	public void clickOnSignUpBtn() {
		signUpBtn.click();
	}
}