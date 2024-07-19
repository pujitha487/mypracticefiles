package com.SeleniumWebDriver.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class Assign21 {
	
	WebDriver driver;
	
  @Test (priority=1 , groups="Sellers")
  public void clickonSell() {
	  driver.findElement(By.linkText("Sell")).click();
	  
  }
  
  @Test (priority=2 , groups="Sellers")
  public void clickonBestsellers() {
	  driver.findElement(By.linkText("Best Sellers")).click();
	  
  }
  
  @Test (priority=3 , groups="Gadjets")
  public void clickonMobiles() {
	  driver.findElement(By.linkText("Mobiles")).click();
	  
  }
  
  @Test (priority=4 , groups="Gadjets")
  public void clickonElectronics() {
	  driver.findElement(By.linkText("Electronics")).click();
	  
  }
  
  @BeforeMethod(alwaysRun=true)
  public void beforeMethod() {
	  driver.get("https://www.amazon.in/");
	  System.out.println("Title: "+driver.getTitle());
  }

  @AfterMethod(alwaysRun=true)
  public void afterMethod() {
	  System.out.println("Title: "+driver.getTitle());
  }

  @BeforeTest(alwaysRun=true)
  public void beforeTest() {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
  }

  @AfterTest(alwaysRun=true)
  public void afterTest() {
	  driver.close();
  }

}
