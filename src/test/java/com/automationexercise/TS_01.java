package com.automationexercise;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class TS_01 {
	WebDriver driver;

	public void screenshot(String methodName) throws Exception {
		// take screenshot
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\" + methodName + timeStamp + ".png"));
		System.out.println("takeCurrentScreenshot captured successfully***");
	}

	public void verifyWebElement(By locator) {
		if (driver.findElements(locator).size() > 0) {
			System.out.println("the given locator is displayed on Screen!*** ");
		} else {
			System.out.println("the given locator is NOT displayed on Screen!***");
		}
	}

	@Test
	public void tc_01() throws Exception {
//		1. Open any web browser
//		2. Type URL https://automationexercise.com/products

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/products");
		// 3. Check home page has displayed or not
		verifyWebElement(By.xpath("/html/body/section[2]/div/div/div[2]/div/h2"));
		screenshot("TS_01_tc_01");
		System.out.println("TC_01 PASSED****Home page displayed successfully*************");
	}

	@Test
	public void tc_02() throws Exception {
//		"1. Go to home page
//		2. User clicks on  Signup / Login menu
		driver.findElement(By.linkText("Signup / Login")).click();
//		3. Check log in page has displayed"
		verifyWebElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/h2"));
		screenshot("TS_01_tc_02");
		System.out.println("TC_02 PASSED****Home page displayed successfully*************");
	}

	// Verify web element on Login page
	@Test
	public void tc_03() throws Exception {
		verifyWebElement(By.name("email"));
		verifyWebElement(By.name("password"));
		verifyWebElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
		screenshot("TS_01_tc_03");
	}

	@Test
	public void tc_04() throws Exception {

	}

	@Test
	public void tc_05() throws Exception {

	}
}
