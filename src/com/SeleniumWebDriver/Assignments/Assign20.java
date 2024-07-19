package com.SeleniumWebDriver.Assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assign20 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement rgtclk=driver.findElement(By.xpath("//*[@id=\"authentication\"]/span"));
		Actions act=new Actions(driver);
		act.contextClick(rgtclk).perform();
		List<WebElement>rtclkmenus=driver.findElements(By.xpath("//*[@id=\"authentication\"]/ul/li"));
		for(WebElement rcm : rtclkmenus)
		{
			System.out.println(rcm.getText());
		}
		
		driver.close();
		

	}

}
