package com.SeleniumWebDriver.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.checkerframework.checker.units.qual.s;
import org.testng.annotations.AfterTest;

public class Assign23 {
  
String fpath="D:\\For Selenium Jar Files"+"\\ExcelFiles"+"\\LoginDataDetails.xlsx";
  File file;
  FileOutputStream fos;
  XSSFWorkbook wb;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  int i=1;
@Test(dataProvider = "getLoginData")
  public void createLogin( String un, String pwd, String rlt) 
 {
	row=sheet.createRow(0);
	cell=row.createCell(0);
	cell.setCellValue("Sr.no");
	sheet.getRow(0).createCell(1).setCellValue("Username");
	sheet.getRow(0).createCell(2).setCellValue("Password");
	sheet.getRow(0).createCell(3).setCellValue("Result");
	
	row=sheet.createRow(i);
	sheet.getRow(i).createCell(0).setCellValue(i);
	sheet.getRow(i).createCell(1).setCellValue(un);
	sheet.getRow(i).createCell(2).setCellValue(pwd);
	sheet.getRow(i).createCell(3).setCellValue(rlt);
	
	i++;
	
  }
  

  @DataProvider
  public Object[][] getLoginData() {
    return new Object[][] {
      new Object[] {  "admin", "admimn123", "Not Run" },
      new Object[] {  "Thanvi", "Thanvi123", "Not Run" },
      new Object[] {  "Puji", "Puji123", "Not Run" },
    };
  }
  @BeforeTest
  public void beforeTest() throws IOException
  {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new XSSFWorkbook();
	  sheet=wb.createSheet("LoginDataSheet");
	  
  }

  @AfterTest
  public void afterTest() throws IOException
  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

}
