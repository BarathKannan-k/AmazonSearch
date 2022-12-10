package com.qa.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Exercise_01;

public class Tc_Exercise_01 extends TestBase {
	Exercise_01 Element;
	@Parameters({"browser","url"})
	@Test
	public void getGmail() {
		Element= new Exercise_01(driver);
		driver.navigate().to("https://www.google.com/");
		Element.getGmail().click();
		Element.getCreateAnAccount().click();
		Element.getFirstName().sendKeys("Barath");
		Element.getLastName().sendKeys("Kannan");
		Element.getUserName().sendKeys("barathvirtusa");
		Element.getPassword().sendKeys("Virtusa@1234");
		Element.getConfirmPassword().sendKeys("Virtusa@1234");
	}
	
}
