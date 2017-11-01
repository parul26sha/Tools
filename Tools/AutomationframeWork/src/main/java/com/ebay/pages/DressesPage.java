package com.ebay.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.ebay.base.CommonPage;

public class DressesPage extends CommonPage{
	
	static Logger logger = LogManager.getLogger(DressesPage.class);
	
	
	List<String> titles;
	
	@FindBy(id="w_1504721177697_cbx")
	WebElement size;
	
	@FindBy(css="#w5-w0-w1_btn")//#w5-w0-w1_btn
	WebElement bestMatchIcon;
	
	@FindBy(linkText="Newly Listed")
	WebElement bestMatchSelectValue;

	@FindBy(css=".s-item__title")
	List<WebElement> itemTitles;
	
	
	@FindBy(css=".b-list__items_nofooter>li:nth-child(1)>div>div>a>h3")//.//*[@id='w5-items[0]']/div/div[2]/a/h3
	WebElement item1;
	
	@FindBy(css=".b-list__items_nofooter>li:nth-child(2)>div>div>a>h3")
	WebElement item2;
	
	@FindBy(xpath=".//*[@id='msku-sel-1']")
	WebElement itemsize;

	@FindBy(css="#isCartBtn_btn")
	WebElement addTocartIcon;
	
	@FindBy(xpath=".//*[@id='msku-sel-1']")
	WebElement selectcolor;

	@FindBy(css="#msku-sel-2")
	WebElement item2size;

	
	
	
	Select select;
	
	public DressesPage(WebDriver driver) {
		super(driver);
		logger.info("In DressesPage ");
		titles=new ArrayList<String>();
		PageFactory.initElements(driver,this);
	}
	
	public void selectSize () {
		size.click();
		
	}

	public void bestMatchSelect() {
		
		//driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		titles.add(item1.getText());
		item1.click();
		select=new Select(itemsize);
		select.selectByVisibleText("S");
		addTocartIcon.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
