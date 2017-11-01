package com.ebay.utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.ebay.base.Constant;

public class ConfigUtil {
	
	public static final Properties prop=new Properties();
	static Logger logger = LogManager.getLogger(ConfigUtil.class);
	public ConfigUtil(String fileName){
		try {
			prop.load(new FileInputStream(Constant.PATH+fileName));
		} catch (IOException e) {
			e.printStackTrace();
			logger.error(e.getMessage());
		}
	}
	
	public String getProperty(String key) {
		return prop.getProperty(key);
	}
}
