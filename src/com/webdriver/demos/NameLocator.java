package com.webdriver.demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://staragile.melimu.com/login/index.php");
		driver.findElement(By.name("username")).sendKeys("pujitha.sweety31@gmail.com");
		

	}

}
