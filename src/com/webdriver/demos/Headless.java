package com.webdriver.demos;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Headless {

	public static void main(String[] args) {
     ChromeOptions op = new ChromeOptions();
     op.addArguments("--headless");
     op.addArguments("--Incognito");
     WebDriver driver = new ChromeDriver(op);
     driver.manage().window().maximize();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

System.out.println("Title: " + driver.getTitle());

driver.close();
	}
}
