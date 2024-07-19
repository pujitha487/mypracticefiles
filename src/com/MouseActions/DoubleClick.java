package com.MouseActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.partialLinkText("SPECIALIST"));
		//act.moveToElement(menu).doubleClick().perform();
		act.doubleClick(menu).perform();
		
		
		
		driver.close();
		

	}

}
