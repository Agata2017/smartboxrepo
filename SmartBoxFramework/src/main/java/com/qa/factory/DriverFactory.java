package com.qa.factory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {

	public WebDriver driver;

	public static ThreadLocal<WebDriver> threadlocalDriver = new ThreadLocal<>();
	
	/*
	 * This method is used to initialize the treadlocal driver on the basis of a  given browser
	 * 
	 * @param browser
	 * 
	 * @return this will return threadlocalDriver
	 */

	public WebDriver initDriver(String browser) {

		System.out.println("browser value is " + browser);

		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			threadlocalDriver.set(new ChromeDriver());
			
		} 
		else if (browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			threadlocalDriver.set(new FirefoxDriver());
		} 
		else if (browser.equals("safari"))
		{
			threadlocalDriver.set(new SafariDriver());
		}
		else {
			System.out.println(" Please pass the correct browser value: " + browser);
		}
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();
		getDriver().manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		getDriver().manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS); 
		return getDriver();
	}
	
	public static synchronized WebDriver getDriver() {
		return threadlocalDriver.get();
		
	}

}
