package com.selenium.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlsXlsxFile {
	// first we  have added poi jar files and below created a method and passed filepath,filename,sheetname

	public void readExcel(String filePath,String fileName,String sheetName) throws IOException{
		
		//to open xlsx file we need to create an object of File class
		
		File file=new File(filePath+"\\"+fileName );
		
		//to read excel file need to create fileinputstream object
		
		FileInputStream stream=new FileInputStream(file);
		
		// instantiation of workbook
		Workbook book=null;
		
		
		// need to find out the file extension by splitting the file
		String fileExtensionName=fileName.substring(fileName.indexOf("."));
		
		// check if the file is having extension xlsx or xls
		if(fileExtensionName.equals(".xlsx")){
			
			book=new XSSFWorkbook(stream);
			System.out.println("it is an xlsx file");
			
		} 
		
		else if(fileExtensionName.equals(".xls")){
			
			
			book=new HSSFWorkbook(stream);
			System.out.println("it is an xlsx file");
			
		}
		
		
		//read the sheet inside the workbook by its name
		Sheet sheet=book.getSheet(sheetName);
		
		//find no of rows in excel file
		int rowCount=sheet.getLastRowNum()-sheet.getFirstRowNum();
		
		
		//create a loop over all the rows of excel file to read it
		for (int i = 0; i < rowCount+1; i++) {
			
			Row row= sheet.getRow(i);
			System.out.println(sheet.getRow(i));
			System.out.println(row.getLastCellNum());
			
			for (int j = 0; j <row.getLastCellNum(); j++) {
				
				//print excel data in console
				System.out.println(row.getCell(j).getStringCellValue()+"||");
				
			}
			
			
		}
		
		
		
		
		
	}

	public static void main(String[] args)  {
		
		// in the main method we need to call the readExcel method
		
		
		// so need to create an object for main class
		
		ReadXlsXlsxFile r=new ReadXlsXlsxFile();
		System.out.println(System.getProperty("user.dir"+"\\Lib\\Book1"));
		String filepath=System.getProperty("user.dir");
		try {
			r.readExcel(filepath, "Book1.xlsx", "sheet1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
