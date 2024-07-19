package com.TestNG.Demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfter {
	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.close();
	}
		
		
		
	@Test(priority=4)
	public void openMeesho() {
		 
			driver.get("https://www.meesho.com/");
			
			System.out.println("Title: " + driver.getTitle());
			 }

   @Test(priority=1)
   public void openFlipkart() {
	  
		driver.get("https://www.flipkart.com//");
		
		System.out.println("Title: " + driver.getTitle());
		
		}

  @Test(priority=3)
  public void openMyntra() {
	
		driver.get("https://www.Myntra.com//");
		
		System.out.println("Title: " + driver.getTitle());
		
		}

 @Test(priority=2)
 public void openAjio() {
	  
		driver.get("https://www.Ajio.com//");
		
		System.out.println("Title: " + driver.getTitle());
		
		}



  }

