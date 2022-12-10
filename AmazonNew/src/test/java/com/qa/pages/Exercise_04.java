package com.qa.pages;

//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.testng.annotations.Test;

public class Exercise_04 {
	WebDriver  driver;
	@FindBy(linkText="Start here.")
	WebElement to;
	public WebElement getTo()
	{
		return to;
	}
	public Exercise_04(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	
}