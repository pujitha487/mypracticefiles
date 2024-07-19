package com.MouseActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropSlider {

	public static void main(String[] args) throws InterruptedException {
		JavascriptExecutor js;
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://jqueryui.com/");
		js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,350)", " ");
		driver.findElement(By.linkText("Slider")).click();
		Actions act=new Actions(driver);
		Thread.sleep(2000);
		driver.switchTo().frame(0);
		WebElement slider=driver.findElement(By.xpath("//*[@id=\"slider\"]/span"));
		act.dragAndDropBy(slider, slider.getLocation().x+10, slider.getLocation().y).perform();
		
		driver.close();

	}

}
