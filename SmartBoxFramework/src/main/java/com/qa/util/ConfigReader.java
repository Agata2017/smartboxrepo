package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/*
	 * This method is used to load properties from config.properties file
	 * 
	 * @return it returns Properties prop object
	 */

	public Properties initProp() {
		prop = new Properties();
		try {                           
			FileInputStream inputProp = new FileInputStream("src\\test\\resources\\config\\config.properties");
			try {
				prop.load(inputProp);
			} catch (IOException e) {				
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		}
		return prop;
	}

}
