package com.qa.testScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionExample
{
  public static void main(String...args) throws InterruptedException
  {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in/");
	  driver.manage().window().maximize();
	  Thread.sleep(3000);
	  Actions Builder=new Actions(driver);
	  Builder.moveToElement(driver.findElement(By.linkText("Mobiles"))).build().perform();
//	  Actions seriesOfActions=Builder.
	  
//	  action.moveToElement(search);
//	  JavascriptExecutor js=(JavascriptExecutor)driver;
//	  js.executeScript("window.scrollBy(0,1000)");
//	  
	  
  }
}
