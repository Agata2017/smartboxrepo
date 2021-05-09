package com.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {

	private WebDriver driver;

	By slider = By.xpath(".//a[@class='slick-slide slick-current slick-active']");
	By giftBox = By.xpath(".//section[@data-productlist='Our most popular gift boxes']//h3)[1]");
	By giftBoxList = By.xpath(".//section[@data-productlist='Our most popular gift boxes']//h3");

	By productBoxDetails = By.xpath(".//div[@class='product-page__box-details box-details']");
	By productTitle = By.xpath(".//h1[@class='qa-box-product-title box-details__box-title']");
	By addToCartButton = By.xpath(".//div[@class='add-to-cart--primary']");
	By continueShoppingButton = By.xpath(".//a[contains(text(),'Continue shopping')]");
	By goToCartButton = By.xpath(".//a[contains(text(),'Go to cart')]");

	public ProductDetailsPage(WebDriver driver) {
		this.driver = driver;
	}

	// Actions to be performed
	
	public String getProductDetailsPageTitle() {
		return driver.getTitle();
	}
	
	public boolean ifAddToChartPageDisplayed() {
		return driver.findElement(productBoxDetails).isDisplayed();
	}

	public void clickOnAddToChartButton() throws InterruptedException {
       driver.findElement(addToCartButton).click();
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

	public String verifyProductTitle() {
		return driver.findElement(productTitle).getText();
	}
	
	public void clickContinueShoppingButton() throws InterruptedException {
		driver.findElement(continueShoppingButton).click();
	}
	
	public void clickgoToCartButton() throws InterruptedException {
		driver.findElement(goToCartButton).click();
	}
}
