package com.ebay.pagesTest;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseTest;
import com.ebay.pages.DressesPage;
import com.ebay.pages.FashionPage;
import com.ebay.pages.HomePage;
import com.ebay.utility.ExcelHelper;

public class DressPageTest extends BaseTest{
	
	HomePage hm;
	FashionPage fp;
	DressesPage dp;
	
	
	@DataProvider(name="searchdata")
	public Object[][] searchdata(){
		return ExcelHelper.getExcelData("searchData.xlsx", "Sheet1");
	}
	
	@Test()//dataProvider="searchdata")
	public void printBestMatchList() {//String str, String str2) {
		hm=new HomePage(driver);
		
		/*try {
			hm.search(str);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		fp=hm.shopByCategory();
		
		dp=fp.womenSClothing();
		dp.bestMatchSelect();
		dp.cartSize();
		
		
	}


}
