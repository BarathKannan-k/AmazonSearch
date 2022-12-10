package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Exercise_03 {
	
	WebDriver driver;
	@FindBy(xpath ="/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]")//c-p/html/body/div[2]/div/div/div[2]/div/div[1]/div[2]ointer c-neutral-900
	WebElement popupClose;
	public WebElement getpopupClose()
	{
		return popupClose;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/input")
	WebElement from;
	public WebElement getFrom()
	{
		return from;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[1]/div[2]")
	WebElement clickFrom;
	public WebElement getclickFrom()
	{
		return clickFrom;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/input")
	WebElement to;
	public WebElement getTo()
	{
		return to;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[2]/div/div/div[3]/div[2]")
	WebElement clickTo;
	public WebElement getclickTo()
	{
		return clickTo;
	}
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[1]/div/div/button[1]")
	WebElement clickClan;
	public WebElement getClickClan()
	{
		return clickClan;
	}
	
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[1]/div/div[2]/div/div[1]/div/div[3]/div[3]/div/div[2]/span")
	WebElement clickSearch;
	public WebElement getclickSearch()
	{
		return clickSearch;
	}
	public Exercise_03(WebDriver driver)
	 {
		 this.driver=driver;
		PageFactory.initElements(driver,this);
	 }	

}