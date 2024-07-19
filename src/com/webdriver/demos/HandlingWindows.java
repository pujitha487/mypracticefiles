package com.webdriver.demos;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.online.citibank.co.in/");
		
		// Close first adv
        driver.findElement(By.xpath("//*[@id=\"popup1\"]/div/a")).click();
        
        
        // Close second adv
        driver.findElement(By.xpath("//*[@id=\"popup2\"]/div/a")).click();
        
        // Click on login button
        driver.findElement(By.xpath("//*[@id=\"loginId\"]/img")).click();
        String title=driver.getTitle();
        
        //Print the first window title
        System.out.println("Title: "+title);
        Set<String> window=driver.getWindowHandles();
        Iterator<String> itr=window.iterator(); 
        String win1=itr.next();
        String win2=itr.next();
        driver.switchTo().window(win2);
        
        //Print the second window title
        String win2title=driver.getTitle();
        System.out.println("Title of the Second Window is: "+win2title);
        driver.close();
        
	}

}
