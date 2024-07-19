package com.SeleniumWebDriver.Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assign10 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		
		//Enter fullname
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[3]/td[3]/input")).sendKeys("Pujitha Nalubolu");
		
		//Enter rediffmail id
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[1]")).sendKeys("pujitha.sweety31");
		
		//Check availability button
		driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[7]/td[3]/input[2]")).click();
		Thread.sleep(2000);
		WebElement msg=driver.findElement(By.xpath("//*[@id=\"check_availability\"]/font/b"));
		System.out.println(msg.getText());
		
		//Enter password
		driver.findElement(By.id("newpasswd")).sendKeys("Sweety22dec$");
		
		//Enter retype password
		driver.findElement(By.id("newpasswd1")).sendKeys("Sweety22dec$");
		
		//Click on checkbox under alternate emailid
		driver.findElement(By.xpath("//*[@id=\"div_altemail\"]/table/tbody/tr[1]/td[3]/input")).sendKeys("ramireddypujitha@gmail.com");
		
		//Enter mobile no
		driver.findElement(By.id("mobno")).sendKeys("9703692811");
		
		//Select DOB
		   //For day
		       WebElement day=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));
		       Select dlist=new Select(day);
		       dlist.selectByValue("09");
		       Thread.sleep(2000);
		  //For month
		       WebElement month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
		       Select mlist=new Select(month);
		       mlist.selectByVisibleText("JUL");
		       Thread.sleep(2000);
		 //For year
		       WebElement year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
		       Select ylist=new Select(year);
		       ylist.selectByValue("1991");
		       
		       driver.close();

	}

}
