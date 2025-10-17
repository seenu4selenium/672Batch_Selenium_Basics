package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FaceBookLogin {

	public static void main(String[] args) {
		// Create Webdriver object
		WebDriver driver;

		// Open Chrome browser
		//driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		driver = new EdgeDriver();
		
			
		// Type URL "https://www.facebook.com/"
		driver.get("https://www.facebook.com");
		System.out.println("Browser launched with FB URL****");
		// Browser maximize
		driver.manage().window().maximize();

		// Type User name & Password
		driver.findElement(By.id("email")).sendKeys("testabc@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("fadkjfgsdkjghdo");
		// Click on Login button
		driver.findElement(By.name("login")).click();

		System.out.println("Sussceesfully fb logged-in****");
		// Close te current browser/window
		// driver.close();
		driver.quit();

	}

}
