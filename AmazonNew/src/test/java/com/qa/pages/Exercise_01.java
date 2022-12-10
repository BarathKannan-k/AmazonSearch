package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise_01 {
	WebDriver driver;
	@FindBy(xpath="//*[@id=\"gb\"]/div/div[1]/div/div[1]/a")
	WebElement Gmail;
	public WebElement getGmail() {
		return Gmail;
	}
	@FindBy(linkText="Create an account")
	WebElement createAnAccount;
	public WebElement getCreateAnAccount() {
		return createAnAccount;
	}
	@FindBy(id="firstName")
	WebElement firstName;
	public WebElement getFirstName() {
		return firstName;
	}
	@FindBy(id="lastName")
	WebElement lastName;
	public WebElement getLastName() {
		return lastName;
	}
	@FindBy(id="username")
	WebElement userName;
	public WebElement getUserName() {
		return userName;
	}
	@FindBy(name="Passwd")
	WebElement password;
	public WebElement getPassword() {
		return password;
	}
	@FindBy(name="ConfirmPasswd")
	WebElement confirmPassword;
	public WebElement getConfirmPassword() {
		return confirmPassword;
	}
	public Exercise_01(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
}
