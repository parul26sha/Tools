package com.ebay.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ebay.utility.ConfigUtil;
import com.ebay.utility.ScreenShotUtil;
import com.ebay.utility.WebdriverUtil;

public class BaseTest {
	protected WebDriver driver;
	protected static String url;
	protected static String browser;

	@BeforeSuite
	public void beforeSuite() {
		ConfigUtil configUtil=new ConfigUtil("config.properties");
		url=configUtil.getProperty("stageURL");
		browser=configUtil.getProperty("browser");
	}
	
	@BeforeMethod
	public void setDriver() {
		driver=WebdriverUtil.getDriver(browser);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}
	@AfterMethod
	public void closeDriver(ITestResult rs) {
		if(ITestResult.FAILURE==rs.getStatus()) {
			ScreenShotUtil.takeScreenShot(rs.getName(),driver);
		}
		driver.quit();
	}
}
