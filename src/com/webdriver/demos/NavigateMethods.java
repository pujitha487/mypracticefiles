package com.webdriver.demos;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateMethods {

	public static void main(String[] args) {
		JavascriptExecutor js;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://staragile.melimu.com/login/index.php");
		driver.findElement(By.name("username")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Sweety22dec$");
		driver.findElement(By.id("loginbtn")).click();
		//Thread.sleep(2000);
		driver.navigate().refresh();
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", " ");
		js.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("All")));
		driver.navigate().back();
		
		driver.close();
	}

}
