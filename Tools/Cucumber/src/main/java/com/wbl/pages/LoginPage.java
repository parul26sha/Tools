package com.wbl.pages;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.wbl.Base.BasePage;

public class LoginPage extends BasePage{
	
	@FindBy(id="username")//give xpath/css
	WebElement id;
	
	@FindBy(id="password")
	WebElement paswd;
	
	@FindBy(css=".btn.btn-primary")
	WebElement submit;

	@FindBy(css="[class*=btn-google]")
	WebElement googleBtn;
	
	@FindBy(css="[class*=btn-facebook]")
	WebElement fbBtn;
	
	@FindBy(id="homelink")
	WebElement googleHeading;
	
	
	@FindBy(id="headingText")
	WebElement fbHeading;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver,this);
	}
	
	public String login(String userName,String password) {
		
		id.sendKeys(userName);
		paswd.sendKeys(password);
		submit.click();
		return(driver.getCurrentUrl().toString());
	
	}
	public void  loginWithFacebook() {
		wait.until(ExpectedConditions.visibilityOf(fbBtn));
		fbBtn.click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		for(String s :allWindow ) {
			if(s!=parentWindow) {
				driver.switchTo().window(s);
				
			}
		}
		System.out.println(driver.getTitle().toString());
		
		
	}
	public void loginWithGoogle() {
		wait.until(ExpectedConditions.visibilityOf(googleBtn));
		googleBtn.click();
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		for(String s :allWindow ) {
			if(s!=parentWindow) {
				driver.switchTo().window(s);
			}
		}
		System.out.println(driver.getTitle().toString());	
	}
}