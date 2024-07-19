package com.TestNG.Demos;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class POM_Client {
	WebDriver driver;
	LoginOHRM ohrm1;
	String fpath="C:\\Users\\User\\Downloads\\OHRM Assignment_Data.xlsx\\";
	File file;
	FileInputStream fis;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
	int i=1;
  @Test
  public void login() 
  {
	  ohrm1.loginAdmin("admin", "admin123");
	  ohrm1.clickPIM();
	  ohrm1.clickAddBtn();
	  //ohrm1.enterFirstname("Pujitha");
	  //ohrm1.enterMiddlename("m");
	  //ohrm1.enterLastname("Nalubolu");
  }
  @Test
  public void readDataFromExcel()
  {
	  row=sheet.getRow(i);
	  cell=row.getCell(1);
	  System.out.println(sheet.getRow(i).getCell(2).getStringCellValue());
	  System.out.println(sheet.getRow(i).getCell(3).getStringCellValue());
      i++;
  }
	 // ohrm1.clickCeateLoginDetails();
	  //ohrm1.enterUsername("puji");
	  //ohrm1.enterPassword("Sweety22dec$");
	  //ohrm1.enterConfirmpwd("Sweety22dec$");
	  //ohrm1.clickSaveBtn();
	  //ohrm1.Logout();
  //}
  @BeforeTest
  public void beforeTest() throws IOException
  {
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
	  ohrm1=new LoginOHRM(driver);
  }
  
  @BeforeMethod
  public void beforemethod() throws IOException
  {
	  file=new File(fpath);
	  fis=new FileInputStream(file);
	  wb=new XSSFWorkbook("Sheet1");
  }
  
  @AfterMethod
  public void aftermethod() throws IOException
  {
	  wb.close();
	  fis.close();
  }
  @AfterTest
  public void afterTest() throws IOException
  {
	  
	  driver.close();
	  
  }

}
