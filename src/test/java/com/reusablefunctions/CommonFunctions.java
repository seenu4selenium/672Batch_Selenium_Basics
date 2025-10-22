package com.reusablefunctions;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class CommonFunctions {

	public static WebDriver driver;

	public void chromeBrowserLaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("chromeBrowserLaunched successfully***");
	}

	public void firefoxBrowserLaunch() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		System.out.println("firefoxBrowserLaunched successfully***");
	}

	public void edgeBrowserLaunch() {
		driver = new EdgeDriver();
		driver.manage().window().maximize();
		System.out.println("edgeBrowserLaunched successfully***");
	}

	public String getTimeStamp() {
		Date d = new Date();
		DateFormat df = new SimpleDateFormat("yyyyMMMdd_HHmmss");
		String timeStamp = df.format(d);
		System.out.println("getTimeStamp captured successfully***");
		return timeStamp;
	}

	public void takeCurrentScreenshot(String name) throws Exception {
		File abc = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(abc, new File(".\\screenshots\\" + name + getTimeStamp() + ".png"));
		System.out.println("takeCurrentScreenshot captured successfully***");
	}

}
