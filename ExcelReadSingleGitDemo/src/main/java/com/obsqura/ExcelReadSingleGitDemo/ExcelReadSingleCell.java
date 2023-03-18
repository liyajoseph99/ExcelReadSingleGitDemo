package com.obsqura.ExcelReadSingleGitDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadSingleCell {
	
	XSSFSheet sheet;
	
	public ExcelReadSingleCell() throws IOException {
		
		File newfile=new File("C:\\Users\\ASUS\\Desktop\\Java Notes\\testdata.xlsx");  //(filepath:\\)
		FileInputStream file=new FileInputStream(newfile);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		sheet=workbook.getSheet("Sheet1");
	}
	
	public String readDataFromExcel(int i,int j) {    
		Row row=sheet.getRow(i);
		Cell cell=row.getCell(j);
		
		//System.out.println(row.getLastCellNum());
		return cell.getStringCellValue();
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ExcelReadSingleCell obj=new ExcelReadSingleCell();
		//String S=obj.readDataFromExcel(0,1);
		String S=obj.readDataFromExcel(0,1);
		System.out.println(S);
	}

}
