package com.ebay.pages;

import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ebay.base.CommonPage;
import com.ebay.utility.Wait;

public class HomePage extends CommonPage {
	static Logger logger = LogManager.getLogger(HomePage.class);
	
	@FindBy(css=".hl-image.js-only.hl-item__bg-image>img")
	List<WebElement> dailyDealsList;
	
	@FindBy(css="#gh-shop-a")
	WebElement shopBycategory;
	
	@FindBy(xpath=".//*[@id='gh-sbc']/tbody/tr/td[2]/h3[1]/a\n")
	WebElement fashionIcon;
	
	@FindBy(css="..nav-wrapper")
	List<WebElement> h2Title;
	
	@FindBy(css="#item1a2c12c02a h3 a")
	WebElement item1;
	
	@FindBy(css="#item2354aef69b h3 a")
	WebElement item2;
	
	@FindBy(css="#msku-sel-1")
	WebElement color;
	
	@FindBy(id="isCartBtn_btn")
	WebElement addtocart;
	
	@FindBy(css="#qtyTextBox")
	WebElement amoutOfItem;
	
	
	//dependency injection
	public HomePage(WebDriver driver){
		super(driver);
		logger.info("In the HomePage");
		PageFactory.initElements(driver,this);
	}
	
	public int counntH2title() {
		return h2Title.size();
	}
	
	public int dailyDeals() {
		return dailyDealsList.size();
	}
	
	public String selectItemAndAddtoCart() throws InterruptedException {
		item1.click();
		Select select=new Select(color);
		select.selectByVisibleText("Blue");
		amoutOfItem.clear();
		amoutOfItem.sendKeys("2");
		addtocart.sendKeys(Keys.ENTER);
		
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		navigateBack();
		
		item2.click();
		addtocart.sendKeys(Keys.ENTER);
		WebElement elem=driver.findElement(By.xpath(".//*[@id='ADDON_0']/div/div[2]/div/div[4]/div/button[2]"));
		System.out.println(elem.isDisplayed());
		elem.sendKeys(Keys.ENTER);
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver.findElement(By.cssSelector(".ff-ds3.fs16.mb5.fw-n.sci-itmttl")).getText();

	}
	
	public  FashionPage shopByCategory() {
		shopBycategory.click();
		fashionIcon.click();
		return new FashionPage(driver);
	}
	
	public void navigateBack() {
		driver.navigate().back();
	}
	
	
	
	
	
	

}
