package com.Actitime.utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DemoExcelLibrary3 {

	
		public static String getexcelData(String sheetname,int row , int cell,String path)
		{
			String retval=null;
		try {
			FileInputStream fis = new FileInputStream(path);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet s=wb.getSheet(sheetname);
			retval=s.getRow(row).getCell(cell).getStringCellValue();
			//System.out.println(te);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvalidFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return retval;

	}
		
		public static int getlastrow(String sheetname,String path){
			int retval=0;
			try {
				FileInputStream fis=new FileInputStream(path);
				retval=WorkbookFactory.create(fis).getSheet(sheetname).getLastRowNum();
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvalidFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return retval;
		}
		

}

