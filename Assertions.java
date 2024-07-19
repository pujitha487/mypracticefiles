package com.TestNG.Demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Assertions {
  
WebDriver driver;
String expturl="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
String acturl;

	  @Test(dataProvider = "getLoginData")
	  public void loginOHRM(String un ,  String pwd)
	  {
		  driver.findElement(By.name("username")).sendKeys(un);
		  driver.findElement(By.name("password")).sendKeys(pwd);
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
		  acturl=driver.getCurrentUrl();
		  //Assert.assertEquals(expturl, acturl);
		  Assert.assertTrue(acturl.contains("dash"));
		  
	  }
	  
	  
	 @BeforeMethod
	 public void beforeMethod()
	 {
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 }
	  
	  
	  @AfterMethod
	  public void afterMethod() 
	  {
		  
		  if(driver.getCurrentUrl().contains("dash"))
		  {
			  System.out.println("Test case pass");
			  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			  driver.findElement(By.linkText("Logout")).click();
			  
		  }
		  else
		  {
			  
			  WebElement text=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p"));
			  System.out.println("Test case fail because of: "+text.getText());
		  }
	  }


	  @DataProvider
	  public Object[][] getLoginData() {
	    return new Object[][] {
	      new Object[] { "thanvitha" , "Thanvitha123" },
	      new Object[] { "pujitha" , "pujitha123" },
	      new Object[] { "anil" , "anil123" },
	      new Object[] { "admin" , "admin123" }
	    };
	  }
	  
	  @BeforeTest
	  public void beforeTest() {
		  driver=new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  

	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
	  }

	}
