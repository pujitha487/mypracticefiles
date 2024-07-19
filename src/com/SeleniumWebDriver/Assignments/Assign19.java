package com.SeleniumWebDriver.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign19 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		List<WebElement>menus=driver.findElements(By.xpath("//*[@id=\"nav-xshop\"]/a"));
		for(WebElement m : menus)
			System.out.println(m.getText());
		
		driver.close();

	}

}