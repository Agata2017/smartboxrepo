package stepdefinitions;

import org.junit.Assert;

import com.pages.CheckoutPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class ChartPageSteps {
	
	private CheckoutPage checkout = new CheckoutPage(DriverFactory.getDriver());
	
	@Then("I should be able to navigate to chart page {string}")
	public void i_should_be_able_to_navigate_to_chart_page(String expectedTitle) {
		String title = checkout.getCheckoutPageTitle();
		System.out.println("Checkout Page title is " + title);
		Assert.assertTrue(title.contains(expectedTitle));
	
	}

	@Then("I should be able to place my order")
	public void i_should_be_able_to_place_my_order() {
		try {
			checkout.clickOnPlaceOrderButton();
		} catch (InterruptedException e) {
		   e.printStackTrace();
		}
	   
	}
}
