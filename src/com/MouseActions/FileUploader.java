package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploader {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/upload");
		driver.findElement(By.name("uploadfile_0")).sendKeys("C:\\Users\\User\\Desktop\\Screenshot.jpeg");
		//driver.findElement(By.id("terms")).click();
		WebElement terms=driver.findElement(By.id("terms"));
		if(terms.isSelected()==false)
			terms.click();
		driver.findElement(By.id("submitbutton")).click();
		
		driver.close();

	}

}
