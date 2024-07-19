package com.webdriver.demos;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingTables {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.partialLinkText("More")).click();
		List<WebElement> headers=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement h : headers)
			System.out.println("Header Rows: "+h.getText());
		List<WebElement> rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr"));
		System.out.println(rows.size());
		Random rdn=new Random();
		//int n=rdn.nextInt(10); // Range in 0 to 10
		int n=rdn.nextInt(rows.size());
		System.out.println(n);
	
		

	}

}
