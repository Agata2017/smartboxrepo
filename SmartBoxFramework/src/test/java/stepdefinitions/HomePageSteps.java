package stepdefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomePageSteps {

	private HomePage home = new HomePage(DriverFactory.getDriver());

	@Given("I am navigated to Smartbox website")
	public void i_am_navigated_to_Smartbox_website() {
		DriverFactory.getDriver().get("https://www.smartbox.com/ie/");

	}

	@When("I am navigated to Our popular box section {string}")
	public void i_am_navigated_to_Our_popular_box_section(String expectedTitleName) {
		String title = home.getHomePageTitle();
		Assert.assertTrue(title.contains(expectedTitleName));
	}

	@When("I am on the home page {string}")
	public void i_select_to_Our_popular_box_section(String expectedGiftSectionTitle) {
		String title = home.getHomePageTitle();
		Assert.assertTrue(title.contains(expectedGiftSectionTitle));
	}

	@When("I choose desired box")
	public void i_choose_desired_box() {
	   home.clickOnGiftSection();
	}
	
	@When("I choose desired box2")
	public void i_choose_desired_box2() {
		home.clickOnGiftSection2();
	}
}
