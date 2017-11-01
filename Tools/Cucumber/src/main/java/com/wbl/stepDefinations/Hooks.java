package com.wbl.stepDefinations;


import org.openqa.selenium.WebDriver;

import com.wbl.utility.ConfigUtil;
import com.wbl.utility.WebdriverUtil;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {	
	public static WebDriver driver;
	protected static String url;
	protected static String browser;
	
	static {
		ConfigUtil configutil=new ConfigUtil("config.properties");	
		url=configutil.getProperty("qaURL");
		browser=configutil.getProperty("browser");
		
	}
	@Before
	public void before() {
		
		driver=WebdriverUtil.getDriver(browser);
		driver.get(url);
		driver.manage().window().maximize();

	}
	@After
	public void afte() {
		driver.close();	
	}
}
