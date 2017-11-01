package com.wbl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.wbl.Base.BasePage;

public class HomePage extends BasePage {
	
	@FindBy(css=".navbar-right a")
	WebElement loginbutton;

	
	public HomePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
		
	}
	
	public LoginPage clickLogin() {
		wait.until(ExpectedConditions.visibilityOf(loginbutton));
		loginbutton.click();
		return new LoginPage(driver);
	}
	
}
