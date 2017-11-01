package com.ebay.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage {
	protected WebDriver driver;
	@FindBy(css="#gh-topl li")
	List<WebElement> listOfEle;
	
	@FindBy(id="gh-logo")
	WebElement logo;
	
	@FindBy(id="gh-ac")
	WebElement searchBtn;
	
	@FindBy(css="#gh-cart-i")
	WebElement cart;
	
	public CommonPage(WebDriver driver) {
		this.driver=driver;
		driver.manage().window().maximize();
	}
	public int toplist() {
		return listOfEle.size();
	}
	
	public boolean logoDisplayed() {
		return logo.isDisplayed();
	}
	public String search(String str) throws AWTException {
		
		searchBtn.sendKeys(str);
		WebElement elem=driver.findElement(By.id("gh-btn"));
		elem.click();
		System.out.println(driver.getTitle());
		return driver.getTitle();	
	}
	public void cartSize() {
		cart.click();
	}
	
	
	
}
