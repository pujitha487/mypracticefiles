package com.webdriver.demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		Alert atr;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		driver.findElement(By.id("alertButton")).click();
		atr=driver.switchTo().alert();
		System.out.println(atr.getText());
		Thread.sleep(2000);
		atr.accept();
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(5000);
		atr=driver.switchTo().alert();
		System.out.println(atr.getText());
		atr.accept();
		driver.close();
		

	}

}
