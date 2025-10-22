package com.testNG;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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

public class AuotLogin extends CommonFunctions {
	@Test
	public void f() throws Exception {

		chromeBrowserLaunch();

		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("email")).sendKeys("sreenivastest123@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("Test@1298");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();

		// wait for 5 sec
		Thread.sleep(5000);

		takeCurrentScreenshot("AuotLogin");

	}
}
