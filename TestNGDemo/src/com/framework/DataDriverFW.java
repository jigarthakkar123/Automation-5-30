package com.framework;

import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriverFW {

	@DataProvider(name = "jigar")
	public Object[][] readExcel() throws InvalidFormatException, IOException
	{
		Object data[][]=null;
		String filePath="E:\\Automation Tools\\data.xlsx";
		File file=new File(filePath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		Sheet sheet=workbook.getSheet("Tops3");
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println("Total Number Of Rows : "+rows);
		data=new Object[rows][];
		for(int i=0;i<data.length;i++)
		{
			Row row=sheet.getRow(i);
			int cols=row.getPhysicalNumberOfCells();
			System.out.println("Total Number Of Columns : "+cols);
			data[i]=new Object[cols];
			for(int j=0;j<data[i].length;j++)
			{
				Cell cell=row.getCell(j);
				cell.setCellType(CellType.STRING);
				data[i][j]=cell.getStringCellValue();
			}
		}
		return data;
	}
	WebDriver driver=null;
	@Test(dataProvider = "jigar")
	public void test(String keyword,String data) throws InterruptedException, InvalidFormatException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\Automation Tools\\chromedriver.exe");
		
		if(keyword.equals("open browser"))
		{
			driver = new ChromeDriver();
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter url"))
		{
			driver.get(data);
			Thread.sleep(2000);
			driver.manage().window().maximize();
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter username"))
		{
			driver.findElement(By.id("user-name")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("enter password"))
		{
			driver.findElement(By.id("password")).sendKeys(data);
			Thread.sleep(2000);
		}
		else if(keyword.equals("click login"))
		{
			driver.findElement(By.id("login-button")).click();
			Thread.sleep(3000);
		}
		else if(keyword.equals("close browser"))
		{
			driver.close();
		}		
	}
}
