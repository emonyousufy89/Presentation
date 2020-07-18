package StepDefinations;

import Actions.SignInActions;
import Actions.TelevisionActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelevisionSteps extends ExtentReportListner{
	
	TelevisionActions TVaction= new TelevisionActions();
	
	@Given("^Customer clicks on ham burgur icon$")
	public void customer_clicks_on_ham_burgur_icon() throws Throwable {
		TVaction.clickHamBurger();
	    
	}

	@Given("^Customer selects electronics from drop down$")
	public void customer_selects_electronics_from_drop_down() throws Throwable {
		TVaction.clickElectronics(); 
	}

	@When("^Customer clicks TV & Video from next drop down$")
	public void customer_clicks_TV_Video_from_next_drop_down() throws Throwable {
		TVaction.clickTV();
	}

	@When("^Customer clicks (\\d+) model from filtering option$")
	public void customer_clicks_model_from_filtering_option(int arg1) throws Throwable {
		TVaction.ClickYear();
	}

	@When("^Customer clicks SAMSUNG Brand from filtering option$")
	public void customer_clicks_SAMSUNG_Brand_from_filtering_option() throws Throwable {
		TVaction.ClickBrand();
	}

	@Then("^Customer lands on Samsung brand listing page$")
	public void customer_lands_on_Samsung_brand_listing_page() throws Throwable {
	    System.out.println("available Samsung tv");
	}

	@Then("^Customer clicks on a TV from the right side$")
	public void customer_clicks_on_a_TV_from_the_right_side() throws Throwable {
		TVaction.ClickItemTV();
	}

	@Then("^Customer clicks add to cart$")
	public void customer_clicks_add_to_cart() throws Throwable {
		TVaction.ClickAddtocart();
	}

	@Then("^Customer lands on warrenty option$")
	public void customer_lands_on_warrenty_option() throws Throwable {
		System.out.println("Add warrenty for your future protection");
	}

	@Then("^Customer clicks on add warrenty option$")
	public void customer_clicks_on_add_warrenty_option() throws Throwable {
		TVaction.ClickAddWrrenty();
	}

	@Then("^Customer lands on checkOut Page & see the price$")
	public void customer_lands_on_checkOut_Page_see_the_price() throws Throwable {
	    TVaction.pricePrint();
	}


}
