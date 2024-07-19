package com.webdriver.demos;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_JavaScript {

	public static void main(String[] args) throws InterruptedException {
		Alert atr;
		JavascriptExecutor js;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/alerts");
		js=(JavascriptExecutor)driver;
		js.executeScript("window.srollBy(0,250)", "");
		//js.executeScript("window.scrollTO(200,250)"," ");

		
		//First Alert
		js.executeScript("arguments[0].click()", driver.findElement(By.id("alertButton")));
		atr=driver.switchTo().alert();
		System.out.println(atr.getText());
		Thread.sleep(2000);
		atr.accept();
		
		
		//Second Alert
		js.executeScript("arguments[0].click()", driver.findElement(By.id("timerAlertButton")));
		Thread.sleep(5000);
		atr=driver.switchTo().alert();
		
		System.out.println(atr.getText());
		
		atr.accept();
		
		
		
		//Third Alert
		js.executeScript("arguments[0].click()",driver.findElement(By.id("confirmButton")) );
		atr=driver.switchTo().alert();
		atr.dismiss();
		WebElement confirmmsg=driver.findElement(By.id("confirmResult"));
		System.out.println(confirmmsg.getText());
		
		
		//Fourth Alert
		js.executeScript("arguments[0].click()", driver.findElement(By.id("promtButton")));
		atr=driver.switchTo().alert();
		atr.sendKeys("pujitha");
		atr.accept();
		WebElement promptmsg=driver.findElement(By.id("promptResult"));
		System.out.println(promptmsg.getText());
		driver.close();
		
		
		

	}

}
