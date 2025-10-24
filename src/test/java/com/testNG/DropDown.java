package com.testNG;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new EdgeDriver();
		driver.get("https://blazedemo.com/");
		driver.manage().window().maximize();
		WebElement fromSelect = driver.findElement(By.name("fromPort"));
		WebElement toSelect = driver.findElement(By.name("toPort"));
		new Select(fromSelect).selectByVisibleText("Boston");
		new Select(toSelect).selectByVisibleText("London");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();

	}

}