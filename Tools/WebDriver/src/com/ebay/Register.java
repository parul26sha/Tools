package com.ebay;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Register {
	
	WebDriver driver;
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.gecko.driver","/home/parul/Downloads/geckodriver");
		driver=new FirefoxDriver();
		driver.get("http://www.monsterindia.com");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	
	}
	
	@Test
	public void resumeUpload() throws AWTException, InterruptedException {
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		for(String s:allWindow) {
			if(!s.equals(parentWindow)) {
				driver.switchTo().window(s).close();
			}
		}
		driver.switchTo().window(parentWindow);
		driver.findElement(By.cssSelector(".fileUpload.btn")).click();
		parentWindow=driver.getWindowHandle();
		allWindow=driver.getWindowHandles();
		for(String s:allWindow) {
			if(!s.equals(parentWindow)) {
				driver.switchTo().window(s);
			}
		}
		
		driver.findElement(By.id("wordresume")).click();
		
		StringSelection selectPath=new StringSelection("/home/parul/Desktop/test.txt");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selectPath,null);
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		
	}
}
