package stepdefinitions;

import org.junit.Assert;

import com.pages.ProductDetailsPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.When;

public class ProductDetailsSteps {

	private ProductDetailsPage product = new ProductDetailsPage(DriverFactory.getDriver());
	
	// Scenario 1
	@When("I navigate to box details page {string}")
	public void i_navigate_to_box_details_page(String expectedTitle) {
		String title = product.getProductDetailsPageTitle();
		System.out.println("Home Page title is " + title);
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@When("I click on Add To Chart button")
	public void i_click_on_Add_To_Chart_button() {
		try {
			product.clickOnAddToChartButton();
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@When("I accept Add To Chart pop up")
	public void i_accept_Add_To_Chart_pop_up() {
		try {
		product.clickgoToCartButton();
			
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	}
}
