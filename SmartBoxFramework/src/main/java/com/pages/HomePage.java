package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
        super(driver);
    }

	By slider = By.xpath(".//a[@class='slick-slide slick-current slick-active']");
	By giftBox = By.xpath("(.//section[@data-productlist='Our most popular gift boxes']//img)[1]");
	By acceptCookieMsg = By.id("onetrust-accept-btn-handler");
	By listOfGifts = By.xpath(".//section[@data-productlist='Our most popular gift boxes']//img)[1]");
	By giftBox2 = By.xpath("(.//section[@data-productlist='Our most popular gift boxes']//img)[2]");
	By giftBoxList = By.xpath(".//section[@data-productlist='Our most popular gift boxes']//h3");

	
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
		String text = driver.findElement(giftBox).getText();
		return text;
	}

	public void clickOnGiftSection2() {
		driver.findElement(giftBox2).click();
	}

	public int getGiftBoxCount() {
		return driver.findElements(giftBoxList).size();

	}

	public List<String> getGiftBoxesSectionList() {

		List<String> giftList = new ArrayList<>();
		List<WebElement> giftHeaderList = driver.findElements(giftBoxList);
		for (WebElement ele : giftHeaderList) {
			String text = ele.getText();
			System.out.println(text);
			giftList.add(text);
		}
		return giftList;
	}

}
