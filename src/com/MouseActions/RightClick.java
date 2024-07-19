package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RightClick {

	public static void main(String[] args) {
		JavascriptExecutor js;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/buttons");
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", " ");
		Actions act=new Actions(driver);
		WebElement rightclick=driver.findElement(By.id("rightClickBtn"));
		act.contextClick(rightclick).perform();
		WebElement msg=driver.findElement(By.id("rightClickMessage"));
		System.out.println(msg.getText());
		
		driver.close();
		

	}

}
