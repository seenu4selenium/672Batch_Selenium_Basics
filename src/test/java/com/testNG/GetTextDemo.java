package com.testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetTextDemo {
	@Test
	public void f() throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("email")).sendKeys("sreenivastest123@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@1298");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
		
		//java wait
		//Thread.sleep(5000);
		
		//Selenium implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
//		// Get the error message                      
//		String errorMsg = driver.findElement(By.xpath("//*[@id='form']/div/div/div[1]/div/form/p")).getText();
//		System.out.println(errorMsg);
//
//		String expctedResults = "Your email or password is incorrect!";
//		if (errorMsg.equals(expctedResults)) {
//			System.out.println("Errorr msg is displayed as expected");
//		} else {
//			System.out.println("Errorr msg is NOT displayed as expected");
//		}
		
		//Get the Sreenivas text
		String text = driver.findElement(By.xpath("//*[@id='header']/div/div/div/div[2]/div/ul/li[10]/a/b")).getText();
		System.out.println(text);
		}
}
