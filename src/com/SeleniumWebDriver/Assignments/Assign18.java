package com.SeleniumWebDriver.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign18 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoqa.com/webtables");
		
		//Try to display all header columns
		List<WebElement>Headers=driver.findElements(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[1]/div/div/div"));
		for(WebElement h : Headers)
			System.out.println(h.getText());
		//Click on Add button
		driver.findElement(By.xpath("//*[@id=\"addNewRecordButton\"]")).click();
		
		
		//Enter all the data
		driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys("Thanvitha");
		driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys("Nalubolu");
		driver.findElement(By.id("userEmail")).sendKeys("pujitha.sweety31@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"age\"]")).sendKeys("24");
		driver.findElement(By.xpath("//*[@id=\"salary\"]")).sendKeys("30000");
		driver.findElement(By.xpath("//*[@id=\"department\"]")).sendKeys("Testing");
		driver.findElement(By.id("submit")).click();
		
		
		//Search the name in First Name column
		WebElement Search=driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[1]"));
		System.out.println(Search.isDisplayed());
		
		
		//Click on delete button in the same row
		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[4]/div/div[7]")).click();
		driver.close();

		

	}

}
