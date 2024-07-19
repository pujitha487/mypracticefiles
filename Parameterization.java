package com.TestNG.Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterTest;

public class Parameterization {
  WebDriver driver;
  
  @Parameters({"Username" , "Password"})
  @Test
  public void testLogin(String un , String pwd) 
  {
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(pwd);
	  driver.findElement(By.id("submit")).click();

  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterMethod
  public void afterMethod() 
  {
	  
	  WebElement text=driver.findElement(By.xpath("//*[@id=\"loop-container\"]/div/article/div[1]/h1"));
	  System.out.println("Message: "+text.getText());
	  if(driver.getPageSource().contains("Logged In Successfully"))
	  {
		  System.out.println("Test case pass");
		  driver.findElement(By.linkText("Log out")).click();
	  }
	  else
	  {
		  System.out.println("Test case fail");
	  }
  }

  @BeforeTest
  public void beforeTest() 
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();  
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
  }

  @AfterTest
  public void afterTest()
  {
	  driver.close();
  }

}
