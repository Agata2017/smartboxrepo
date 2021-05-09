package stepdefinitions;

import org.junit.Assert;

import com.pages.HomePage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps {
	
	private HomePage home = new HomePage(DriverFactory.getDriver());
	

	@When("I am navigated to Our popular box section {string}")
	public void i_am_navigated_to_Our_popular_box_section(String expectedTitleName) {
		 String title =  home.getHomePageTitle();
		 System.out.println("Home Page title is "+ title);
		 Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("I should be able to navigate to box details page")
	public void i_should_be_able_to_navigate_to_box_details_page() {
	    System.out.println("I am navif=gate to Next page");
	}

	//Scenario 1
	
	@Given("I am navigated to Smartbox website")
	public void i_am_navigated_to_Smartbox_website() {
	 DriverFactory.getDriver().get("https://www.smartbox.com/ie/");
	
	}

	@When("I select Our popular box section {string}")
	public void i_select_to_Our_popular_box_section(String expectedGiftSectionTitle) {
		 String title =  home.getHomePageTitle();
		 System.out.println("Home Page title is "+ title);
	//	 Assert.assertTrue(title.contains(expectedGiftSectionTitle));
	}
	
	@When("I choose desired box")
	public void i_choose_desired_box() {	  
	  home.clickOnGiftSection();
	  	  
	}
}
