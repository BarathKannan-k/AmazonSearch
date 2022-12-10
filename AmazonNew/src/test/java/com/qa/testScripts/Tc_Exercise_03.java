package com.qa.testScripts;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.testng.annotations.DataProvider;
//import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.qa.pages.Exercise_03;
import com.qa.utility.ExcelUtility;

public class Tc_Exercise_03 extends TestBase{
	
	Exercise_03 exe;
	@DataProvider(name="getData")
	public String[][] getData()throws IOException{
		String xFile="F:\\FileHistory\\Admin\\GOWTHAM\\Data\\AmazonNew\\src\\test\\java\\com\\qa\\testData\\cleartrip.xlsx 	";
		String xSheet="sheet1";
		int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
		int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
		System.out.println("rows = "+rowCount);
		System.out.println("cells = "+cellCount);
		
		String[][] data = new String[rowCount][cellCount];
		
		for(int i=1; i<=rowCount; i++) {
			for(int j=0;j<cellCount;j++) {
				data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
			}
		}
		return data;
	}
	@Test(dataProvider = "getData")
	public void bookFlight(String from,String to,String date) throws InterruptedException, AWTException
	{
		
		exe = new Exercise_03(driver);
		Robot robot = new Robot();
		exe.getFrom().click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		exe.getFrom().sendKeys(from);
		Thread.sleep(4000);
		exe.getclickFrom().click();
		exe.getTo().click();
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
		exe.getTo().sendKeys(to);
		Thread.sleep(4000);
    	exe.getclickTo().click();
    	exe.getclickSearch().click();
		Thread.sleep(6000);
		driver.get("https://www.cleartrip.com/flights");
	}

}