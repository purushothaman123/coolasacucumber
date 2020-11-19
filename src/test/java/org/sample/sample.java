package org.sample;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class sample  {
	public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\user\\eclipse-workspace\\sample\\excel\\maven.xlsx");
	FileInputStream stream =new FileInputStream(f);
	System.out.println("hii");
	Workbook wb=new XSSFWorkbook(stream);
	Sheet sh=wb.getSheet("Sheet1");
	Row row =sh.getRow(1);
	Cell cell = row.getCell(1);
	String scv = cell.getStringCellValue();
	System.out.println(scv);
	

}}
