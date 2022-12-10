package com.qa.testScripts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class AmazonHomePage {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ELCOT\\eclipse-workspace\\Amazon\\chromeV106\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		JavascriptExecutor JSE=(JavascriptExecutor)driver;
//		JSE.executeScript("window.scrollBy(0,3900)");
		String title=driver.getTitle();
		System.out.println(title);
		if(title.equalsIgnoreCase("Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"))
		{
			System.out.println("ttitle = "+title);
		}
		else {
			System.out.println("title is wrong");
		}
		driver.quit();

	}

}