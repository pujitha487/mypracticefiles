package com.TestNG.Demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FirstTest {
  @Test
  public void OpenMeesho() {
	  WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.meesho.com/");
		
		System.out.println("Title: " + driver.getTitle());
		
		driver.close();

  }
}
