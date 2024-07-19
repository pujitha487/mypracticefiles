package com.TestNG.Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class KeywordDrivenFramework {
	WebDriver driver;
	File fi;
	FileInputStream fis;
	Properties pro;
  @Test
  public void testLogin() 
  {
	  driver.findElement(By.name(pro.getProperty("usernameTxtBoxName"))).sendKeys("student");
	  driver.findElement(By.name(pro.getProperty("passwordTxtBoxName"))).sendKeys("Password123");
	  driver.findElement(By.id(pro.getProperty("submitBtnId"))).click();

  }
  @BeforeMethod
  public void beforeMethod() 
  {
	  driver.get(pro.getProperty("url"));
  }

  @AfterMethod
  public void afterMethod()
  {
	 if(driver.getPageSource().contains("Logged In Successfully"))
	 {
		 System.out.println("Test Case Pass");
		 driver.findElement(By.linkText(pro.getProperty("logoutBtnLink"))).click();
	 }
	 else
	 {
		 System.out.println("Test Case Fail");
	 }
  }

  @BeforeTest
  public void beforeTest() throws IOException 
  {
	  fi=new File("C:\\Users\\User\\eclipse-workspace\\Selenium Assignments\\src\\com\\TestNG\\Demos\\X05ExecuteKeywords.properties");
	  fis=new FileInputStream(fi);
	  pro=new Properties();
	  pro.load(fis);
	  
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
