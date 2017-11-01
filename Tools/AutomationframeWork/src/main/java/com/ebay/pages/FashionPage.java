package com.ebay.pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ebay.base.CommonPage;
import com.ebay.utility.WebdriverUtil;

public class FashionPage extends CommonPage{

	static Logger logger = LogManager.getLogger(FashionPage.class);
	
	@FindBy(xpath=".//*[@id='mainContent']/div[3]/ul/div[1]/li/ul/li[1]/a")
	WebElement WomensClothing;
	
	@FindBy(xpath=".//*[@id='mainContent']/div[3]/ul/div[1]/li/ul/li[1]/ul/li[1]/a/span")
	WebElement dressesIcon;
	
	
	@FindBy(xpath=".//*[@id='mainContent']/div[4]/div[2]/h2/a/img")
	WebElement image;
	
	public FashionPage(WebDriver driver) {
		super(driver);
		logger.info("In the FashionPage");
		PageFactory.initElements(driver,this);
	}
	
	public DressesPage  womenSClothing() {
		WomensClothing.click();
		dressesIcon.click();
		return new DressesPage(driver);
	}
	
	public boolean imageDisplayed() {
		return image.isDisplayed();
	}
	
	

	

}
