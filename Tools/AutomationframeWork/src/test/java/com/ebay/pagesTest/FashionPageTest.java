package com.ebay.pagesTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.ebay.base.BaseTest;
import com.ebay.pages.FashionPage;
import com.ebay.pages.HomePage;
import com.ebay.utility.ExcelHelper;

public class FashionPageTest extends BaseTest{
	
	HomePage hm;
	FashionPage fp;
	
	@Test(enabled=false)
	public void checkhm() {
		
		hm=new HomePage(driver);
		fp=new FashionPage(driver);
		fp=hm.shopByCategory();
		fp.womenSClothing();
		AssertJUnit.assertEquals(fp.logoDisplayed(),true);
	}
	
	@Test( enabled=true,dataProvider="SearchData")
	public void searchData(String str,String expected)
	{
		hm=new HomePage(driver);
		fp=hm.shopByCategory();
		try {
			AssertJUnit.assertEquals(fp.search(str),expected);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
	
	
	
	
	@DataProvider(name="SearchData")
	public Object[][] searchData(){
		return ExcelHelper.getExcelData("searchData.xlsx", "Sheet1");
	}
	
	
	
	
	
	

	
	

}
