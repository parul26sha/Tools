package com.ebay.utility;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverUtil {
	static Logger logger = LogManager.getLogger(WebdriverUtil.class);
	public static WebDriver getDriver(String driverName) {

		WebDriver driver=null;
		try {
			logger.info("In the WebDriverUtil");
			switch(driverName) {
				
				case "chrome":
					System.setProperty("webdriver.chrome.driver","/home/parul/Downloads/chromedriver");
				    driver=new ChromeDriver();
				    break;
				case "firefox":
					System.setProperty("webdriver.gecko.driver","/home/parul/Downloads/geckodriver");
					driver=new FirefoxDriver();
					break;
				
				case "ie":
					//System.setProperty("webdriver.ie.driver","/home/parul/Desktop/Tools/AutomationFrameWork/resources/drivers/geckodriver");
					break;
				case "safari":
					//safari driver
					break;
			}
		
		}
		catch(Exception e){
			logger.info("Exception wile creating a webdriver object");
			logger.info(e.getStackTrace());	
		}
		
		return driver;
	}

}