package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://istqb.in/");
		Actions act=new Actions(driver);
		WebElement menu=driver.findElement(By.xpath("//*[@id=\"sp-menu\"]/div/nav/ul/li[3]/span"));
		act.moveToElement(menu).perform();
		
		driver.close();

	}

}
