package com.qa.testScripts;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Exercise_02;

public class Tc_Exercise_02 extends TestBase {
	Exercise_02 exe;
	@Parameters({"url","browser"})
	@Test
	public void simpliLearn() {
		exe= new Exercise_02(driver);
		exe.getlogin().click();
		exe.getEmail().sendKeys("barathvirtusa@gmail.com");
		exe.getPassword().sendKeys("Virtusa@1234");
		driver.navigate().back();
		exe.getSearch().sendKeys("Selenium");
		System.out.println(exe.getAllText().getText());
		
	}
}
