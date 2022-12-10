package com.qa.testScripts;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import com.qa.pages.Exercise_04;
public class Tc_Exercise_04 extends TestBase {
	Exercise_04 ex2;
	@Test
	public void scroll() throws InterruptedException
	{
		ex2=new Exercise_04(driver);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		/*js.executeScript("window.scroll(0,450)", "");
		Thread.sleep(4000);
		js.executeScript("window.scroll(0,-450)", "");
		*/
		// scroll to bottom of the page
		js.executeScript("window.scroll(0,document.body.scrollHeight)", "");
		Thread.sleep(400);
		js.executeScript("window.scroll(0,0)", "");
		
		/*js.executeScript("arguments[0].scrollIntoView(true);","ex2.to");
		Thread.sleep(4000);
		*/
		
	}

	 

}