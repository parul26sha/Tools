package com.amazon;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class Search {
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver","/home/parul/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void scroll() throws AWTException, InterruptedException {
		WebElement element=driver.findElement(By.id("twotabsearchtextbox"));
		element.sendKeys("Watches");
		element.sendKeys(Keys.ENTER);
		Thread.sleep(3000);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,1000)");
		//js.executeScript("document.querySelectorAll('.a-color-secondary:nth-child(1)')");
		js.executeScript("alert('hello!!!')");
		
		//Thread.sleep(3000);
		driver.close();
		
	}
}
