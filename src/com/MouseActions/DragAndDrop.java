package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
	 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 driver.get("https://jqueryui.com/");
	 Actions act=new Actions(driver);
	 driver.findElement(By.xpath("//*[@id=\"sidebar\"]/aside[1]/ul/li[2]/a")).click();
	 driver.switchTo().frame(0);
	 WebElement source=driver.findElement(By.id("draggable"));
	 WebElement target=driver.findElement(By.id("droppable"));
	 act.dragAndDrop(source, target).perform();
	 
	 driver.close();

	}

}
