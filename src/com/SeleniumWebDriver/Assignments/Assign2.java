package com.SeleniumWebDriver.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		
		//Using name attributes
		driver.findElement(By.name("txtCustomerID")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.name("txtPassword")).sendKeys("Sweety22dec$");
		driver.findElement(By.name("Butsub")).click();
		
		//Using id attributes
		driver.findElement(By.id("txtCustomerID")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.id("txtPassword")).sendKeys("Sweety22dec$");
		driver.findElement(By.id("Butsub")).click();
		
		//Using classname attributes
		driver.findElement(By.className("form-control")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.className("-control")).sendKeys("Sweety22dec$");
		driver.findElement(By.className("btn btn-lg")).click();
		
		
		
		driver.close();

	}



}
