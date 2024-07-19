package com.TestNG.Demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeAndAfterMethods {
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
	@BeforeMethod
	public void beforemethod1()
	{
		System.out.println("BeforeMethod1");
	}
    @Test(priority=4)
	public void openMeesho() {
		 
			driver.get("https://www.meesho.com/");
		 }
    @AfterMethod
    public void displayTitle1()
    {
    	System.out.println("Title: " + driver.getTitle());
    }
    @BeforeMethod
	public void beforemethod2()
	{
    	System.out.println("BeforeMethod2");
	}
   @Test(priority=1)
   public void openFlipkart() {
	  
		driver.get("https://www.flipkart.com//");
		}
   @AfterMethod
   public void displayTitle2()
   {
       System.out.println("Title: " + driver.getTitle());
   }
  @BeforeMethod
  public void beforemethod3()
  {
	  System.out.println("BeforeMethod3");
  }
  @Test(priority=3)
  public void openMyntra() {
	
		driver.get("https://www.Myntra.com//");
		}
  @AfterMethod
  public void displayTitle3()
  {
	  System.out.println("Title: " + driver.getTitle());
  }
  @BeforeMethod
  public void beforemethod4()
  {
	  System.out.println("BeforeMethod4");
  }

 @Test(priority=2)
 public void openAjio() {
	  
		driver.get("https://www.Ajio.com//");
		}
 @AfterMethod
 public void displayTitle4()
 {
	  System.out.println("Title: " + driver.getTitle());
 }

  }

