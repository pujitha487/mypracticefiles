package com.TestNG.Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class RediffAccount {
  
	WebDriver driver;
	
	public void enterFullname()
	{
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input"));
    }
}
