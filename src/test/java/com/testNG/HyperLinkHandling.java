package com.testNG;

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

import com.reusablefunctions.CommonFunctions;

public class HyperLinkHandling extends CommonFunctions{
	@Test
	public void f() throws Exception {
		
		//edgeBrowserLaunch();
		firefoxBrowserLaunch();
		
		driver.get("https://www.facebook.com/");
		// Click on Forgot password? hyper link
		driver.findElement(By.linkText("Forgot password?")).click();
		// driver.findElement(By.partialLinkText("Forgot password?")).click();

		takeCurrentScreenshot("HyperLinkHandling");
		
	}
}
