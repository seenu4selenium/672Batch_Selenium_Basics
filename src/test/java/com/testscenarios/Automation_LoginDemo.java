package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation_LoginDemo {

	public static void main(String[] args) {
		//automationexercise login
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/login");

		driver.findElement(By.name("email")).sendKeys("sreenivastest123@gmail.com");
		// driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]")).sendKeys("");
		driver.findElement(By.name("password")).sendKeys("Test@1298");

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button")).click();
	}

}
