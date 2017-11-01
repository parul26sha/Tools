package com.ebay.utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.ebay.base.Constant;

import net.sf.cglib.core.Constants;

public class ScreenShotUtil {
	
	public static void takeScreenShot(String filename,WebDriver driver) {
		
		File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(file,new File(Constant.PATH+"/screenshots/"+filename+System.currentTimeMillis()+".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
