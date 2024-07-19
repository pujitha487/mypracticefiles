package com.SeleniumWebDriver.Assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign17 {

	public static void main(String[] args) {
		double max=0;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.rediff.com");
		driver.findElement(By.linkText("Money")).click();
		driver.findElement(By.partialLinkText("More")).click();
		
		// Xpath for all headers on the table
		// Display title of all the headers
		List<WebElement>headers=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/thead/tr/th"));
		for(WebElement h : headers)
			System.out.println(h.getText());
		
		
		// Xpath for all rows present in table
		// Display total no of rows
		List<WebElement>rows=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td/a"));
		System.out.println("Total no.rows: "+rows.size());
		
		
		//  Display any row randomly
		Random rdn=new Random();
		int n=rdn.nextInt(rows.size());
		System.out.println(n);
		
		
		
		//  Display list of all the companies (Company name only)
		List<WebElement>Companies=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td[1]/a"));
		for(WebElement c : Companies)
			System.out.println(c.getText());
		
		
		//  Read all current price and display the highest price.
		List<WebElement> cp=driver.findElements(By.xpath("//*[@id=\"leftcontainer\"]/table/tbody/tr/td"));
		List<Double> price=new ArrayList<>();
	    for(WebElement p : cp)
	    {
	    price.add(Double.parseDouble(p.getText().toString().replace(",", "")));
	    }
	    Collections.sort(price);
	    System.out.println("price: "+price);
	    max=price.get(price.size()-1);
		System.out.println("Highest price from current price is: "+max);

		driver.close();
		
		

		
		

	}

}
