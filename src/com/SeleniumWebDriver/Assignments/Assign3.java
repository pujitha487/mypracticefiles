package com.SeleniumWebDriver.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign3 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.echotrak.com/");
		
		//Using cssSelector of single attribute
		driver.findElement(By.cssSelector("input[name=\"txtCustomerID\"]")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Sweety22dec$");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		//Using ^ of cssSelector
		driver.findElement(By.cssSelector("")).sendKeys("pujitha.sweety31@gmail.com");
		
		driver.findElement(By.cssSelector("input[name=\"txtPassword\"]")).sendKeys("Sweety22dec$");
		driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
		
		driver.close();

	}

}
