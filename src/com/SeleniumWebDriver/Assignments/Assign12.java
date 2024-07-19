package com.SeleniumWebDriver.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Assign12 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://dash.bling-center.com/platform/signIn.html");
	driver.findElement(By.xpath("html/body/div/div[2]/div/div/div[5]/button/p")).click();
	driver.findElement(By.id("email1")).sendKeys("pujitha.sweety31@gmail.com");
	driver.findElement(By.xpath("html/body/div/div[1]/div/div[2]/button[2]/p")).click();
	//WebElement msg=driver.findElement(By.id("resetsuccess"));
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	System.out.println(wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("resetsuccess"))).getText());
	//String Gnclrmsg=msg.getText();
	//System.out.println("Message in Green Colour Content is: ");
	driver.close();
	}

}
