package com.ebay.utility;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.ebay.base.Constant;

public class ExcelHelper {
	
	public static Object[][] getExcelData(String filename, String sheet){
		
		Object[][] xlData=null;
		XSSFWorkbook wb=null;
		
		try {
			wb=new XSSFWorkbook(Constant.PATH+"/test-data/"+filename);
			XSSFSheet xssSheet=wb.getSheet("Sheet1");
			int rowIndex=xssSheet.getLastRowNum();
			xlData=new Object[rowIndex][];
			
			for(int i=1;i<=rowIndex;i++) {
				
				XSSFRow row=xssSheet.getRow(i);
				int col=row.getLastCellNum();
				Object[] colData=new Object[col];
				for(int j=0;j<col;j++) {
					colData[j]=row.getCell(j).toString();
				}
				xlData[i-1]=colData;
			}
	
		} catch (IOException e) {
			System.out.print("Excel helper exception"+e);
		}finally {
			try {
				wb.close();	
			}
			catch(IOException e) {
				System.out.println(e);
			}
			
		}
		
		
		return xlData;		
	}

}
