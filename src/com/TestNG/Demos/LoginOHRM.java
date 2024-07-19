package com.TestNG.Demos;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginOHRM {
	WebDriver driver;
	
	public LoginOHRM(WebDriver d)
	{
		driver=d;
	}
	
	public void loginAdmin(String name, String pwd)
	{
		driver.findElement(By.name("username")).sendKeys(name);
		driver.findElement(By.name("password")).sendKeys(pwd);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	}
	public void clickPIM()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
	}
	public void clickAddBtn()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
	}
	public void enterFirstname(String fname)
	{
		driver.findElement(By.name("firstName")).sendKeys(fname);
	}
	public void enterMiddlename(String mname)
	{
		driver.findElement(By.name("middleName")).sendKeys(mname);
	}
	public void enterLastname(String lname)
	{
		driver.findElement(By.name("lastName")).sendKeys(lname);
	}
	public void clickCeateLoginDetails()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
	}
	public void enterUsername(String un)
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[3]/div/div[1]/div/div[2]/input")).sendKeys(un);
	}
	public void enterPassword(String ps)
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input")).sendKeys(ps);
	}
	public void enterConfirmpwd(String cps)
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input")).sendKeys(cps);
	}
	public void clickSaveBtn()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
	}
	public void Logout()
	{
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/i")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
