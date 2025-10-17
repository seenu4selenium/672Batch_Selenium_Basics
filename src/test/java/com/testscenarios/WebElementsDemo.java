package com.testscenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebElementsDemo {

	public static void main(String[] args) {
		
		//automationexercise Registration
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://automationexercise.com/login");
		driver.findElement(By.name("name")).sendKeys("Sreenivas");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/input[3]")).sendKeys("sreenivastest123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[3]/div/form/button")).click();
		// Radio button
		driver.findElement(By.id("id_gender1")).click();

		driver.findElement(By.id("password")).sendKeys("Test@1298");

		// Dropdown
		new Select(driver.findElement(By.id("days"))).selectByVisibleText("15");
		new Select(driver.findElement(By.name("months"))).selectByVisibleText("August");
		new Select(driver.findElement(By.name("years"))).selectByVisibleText("1947");

		// Checkbox
		driver.findElement(By.name("newsletter")).click();

		driver.findElement(By.name("first_name")).sendKeys("Sreenivas");
		driver.findElement(By.name("last_name")).sendKeys("testing");
		driver.findElement(By.name("address1")).sendKeys("test");

		new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States");

		driver.findElement(By.name("state")).sendKeys("CO");
		driver.findElement(By.name("city")).sendKeys("Denver");
		driver.findElement(By.name("zipcode")).sendKeys("80111");
		driver.findElement(By.name("mobile_number")).sendKeys("9876543210");

		driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div/div/form/button")).click();

	}

}
