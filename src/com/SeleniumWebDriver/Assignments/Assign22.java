package com.SeleniumWebDriver.Assignments;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class Assign22 {
	String fpath="D:\\For Selenium Jar Files\\ExcelFiles"+"\\MyFirst.xlsx\\";
	File file;
	FileOutputStream fos;
	XSSFWorkbook wb;
	XSSFSheet sheet;
	XSSFRow row;
	XSSFCell cell;
  @Test
  public void writeData() 
  {
	 row=sheet.createRow(0);
	 cell=row.createCell(0);
	 cell.setCellValue("Thanvitha");
	 sheet.getRow(0).createCell(1).setCellValue("Nalubolu");
	 
	 row=sheet.createRow(1);
	 cell=row.createCell(0);
	 cell.setCellValue("Supraja");
	 sheet.getRow(1).createCell(1).setCellValue("Devanaboyana");
	 

	 
	 
  }
  @BeforeTest
  public void beforeTest() throws FileNotFoundException
  {
	  file=new File(fpath);
	  fos=new FileOutputStream(file);
	  wb=new XSSFWorkbook();
	  sheet=wb.createSheet("My Sheet");
	  
  }

  @AfterTest
  
  public void afterTest() throws IOException
  {
	  wb.write(fos);
	  wb.close();
	  fos.close();
  }

  
}
