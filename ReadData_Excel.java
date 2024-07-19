package com.TestNG.Demos;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterTest;

public class ReadData_Excel {
  String fpath="D:\\For Selenium Jar Files\\ExcelFiles"+"\\MyFirst.xlsx\\";
  File file;
  FileInputStream fis;
  XSSFWorkbook wb;
  XSSFSheet sheet;
  XSSFRow row;
  XSSFCell cell;
  @Test
  public void readData() 
  {
	  row=sheet.getRow(0);
	  cell=row.getCell(0);
	  System.out.println(cell.getStringCellValue());
	  System.out.println(sheet.getRow(0).getCell(1).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(0).getStringCellValue());
	  System.out.println(sheet.getRow(1).getCell(1).getStringCellValue());
  }
  @BeforeTest
  public void beforeTest() throws IOException
  {
	  file=new File(fpath);
      fis=new FileInputStream(file);
	  wb=new XSSFWorkbook(fis);
	  sheet=wb.getSheet("My Sheet");
  }

  @AfterTest
  public void afterTest() throws IOException
  {
	  wb.close();
	  fis.close();
  }

}
