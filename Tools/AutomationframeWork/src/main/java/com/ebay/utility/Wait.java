package com.ebay.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.google.common.base.Function;

public class Wait {
	public static WebElement getElement(By locator, WebDriver driver) {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(50, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
 
		WebElement element = wait.until(new Function<WebDriver, WebElement>() {
			@Override
			public WebElement apply(WebDriver arg0) {
				return arg0.findElement(locator);
			}
		});
 
		return element;
	}

}
