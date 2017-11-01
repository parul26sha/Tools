package com.ebay;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class WebDriverUtil {

	
	public static void to(WebDriver driver) {
		String parentWindow=driver.getWindowHandle();
		Set<String> allWindow=driver.getWindowHandles();
		for(String s:allWindow) {
			if(!s.equals(parentWindow)) {
				driver.switchTo().window(s);
			}
		}
	}
}
