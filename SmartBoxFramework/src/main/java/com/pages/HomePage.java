package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	// constractor, by, actions

	private WebDriver driver;

	// 1. By locators:
	By slider = By.xpath(".//a[@class='slick-slide slick-current slick-active']");
	By giftBox = By.xpath("(.//section[@data-productlist='Our most popular gift boxes']//img)[1]");
	By acceptCookieMsg = By.id("onetrust-accept-btn-handler");
	By listOfGifts = By.xpath(".//section[@data-productlist='Our most popular gift boxes']//img)[1]");

	// 2. Constructor of the page class:

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	// 3. page actions: features (behaviour) of the page in the form of the method

	public String getHomePageTitle() {
		return driver.getTitle();
	}

	public boolean isHomePageDisplayed() {
		return driver.findElement(giftBox).isDisplayed();
	}

	public void clickOnGiftSection() {
		driver.findElement(giftBox).click();
	}
	
	public String verifyGiftText() {
		String text =driver.findElement(giftBox).getText();
;		return text;
	}
}
