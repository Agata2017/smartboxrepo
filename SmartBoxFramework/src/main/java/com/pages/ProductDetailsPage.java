package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {


	public ProductDetailsPage (WebDriver driver) {
        super(driver);
    }

	By productBoxDetails = By.xpath(".//div[@class='product-page__box-details box-details']");
	By productTitle = By.xpath(".//h1[@class='qa-box-product-title box-details__box-title']");
	By addToCartButton = By.xpath(".//div[@class='add-to-cart--primary']");
	By continueShoppingButton = By.xpath(".//a[contains(text(),'Continue shopping')]");
	By goToCartButton = By.xpath(".//a[contains(text(),'Go to cart')]");
	By logo = By.xpath("//*[@id='qa-logo']");

	
	public String getProductDetailsPageTitle() {
		return driver.getTitle();
	}

	public boolean ifAddToChartPageDisplayed() {
		return driver.findElement(productBoxDetails).isDisplayed();
	}

	public void clickOnAddToChartButton() throws InterruptedException {
		driver.findElement(addToCartButton).click();
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

	public void clickLogo() throws InterruptedException {
		driver.findElement(logo).click();
	}

}
