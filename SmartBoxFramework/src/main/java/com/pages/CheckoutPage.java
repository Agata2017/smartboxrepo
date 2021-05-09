package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage{

	public CheckoutPage(WebDriver driver) {
        super(driver);
    }

	By giftBoxTitle = By.xpath(".//a[@class='dark-grey item__box-title']");
	By qty = By.xpath(".//select[@class='quote-item-version-qty']");
	By removeButton = By.xpath(".//a[@title='Remove']");
	By yesClearCartButton = By.xpath(".//a[@id='cart-remove-confirm-accept']");
	By cancelClearCartButton = By.xpath("//button[contains(text(),'Cancel')]");
	By placeOrderButton = By.xpath("(.//button[@class='button button-cart submitShipping js-go-to-payment primary cart-page-cta'])[1]");

	
	public String getCheckoutPageTitle() {
		return driver.getTitle();
	}

	public void clickOnRemoveButton() throws InterruptedException {
		driver.findElement(removeButton).click();
	}

	public void clickOnYesClearCartButton() throws InterruptedException {
		driver.findElement(yesClearCartButton).click();
	}

	public void clickOnCancelClearCartButton() throws InterruptedException {
		driver.findElement(cancelClearCartButton).click();
	}

	public void selectQTY(String QTY) {
		Select select = (Select) driver.findElement(qty);
		select.selectByValue(QTY);

	}

	public void clickOnPlaceOrderButton() throws InterruptedException {
		driver.findElement(placeOrderButton).click();
	}
}
