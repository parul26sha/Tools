package com.ebay.pagesTest;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

import java.awt.AWTException;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.ebay.base.BaseTest;
import com.ebay.pages.FashionPage;
import com.ebay.pages.HomePage;
import com.ebay.utility.ExcelHelper;

public class HomePageTest extends BaseTest {
	
	HomePage hm;
		
	@Test(enabled=false)
	public void toplistTest() {
		hm=new HomePage(driver);
		AssertJUnit.assertEquals(hm.toplist(),5);
		AssertJUnit.assertEquals(hm.logoDisplayed(),true);
	}
	@DataProvider(name="SearchData")
	public Object[][] searchData(){
		return ExcelHelper.getExcelData("searchData.xlsx", "Sheet1");
	}
	
	@Test()//dataProvider="SearchData")
	public void search() throws InterruptedException{
		hm=new HomePage(driver);
		//	System.out.println("item::"+item);
		try {
			hm.search("laptop");
			String title=hm.selectItemAndAddtoCart();
			AssertJUnit.assertEquals(title,"DELL LAPTOP LATiTUDE WINDOWS 10 CORE 2 DUO 4GB RAM WIN DVD WIFI PC HD COMPUTER");
			hm.cartSize();
				
			//}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
