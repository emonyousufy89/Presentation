package StepDefinations;

import Actions.BooksAction;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BooksSteps extends ExtentReportListner {
	
	BooksAction bookaction=new BooksAction();
	
	@Given("^Customer enters item name in the search box$")
	public void customer_enters_item_name_in_the_search_box() throws Throwable {
	    bookaction.EnterSearchItem();
	}

	@Given("^Customer clicks on search icon$")
	public void customer_clicks_on_search_icon() throws Throwable {
		bookaction.clickSearchicon();
	}

	@When("^Customer lands on toddler book page$")
	public void customer_lands_on_toddler_book_page() throws Throwable {
		System.out.println("The book Page");
	}

	@When("^Customer clicks in the sort option$")
	public void customer_clicks_in_the_sort_option() throws Throwable {
		bookaction.clickSortby();
	}

	@When("^Customer selects high to low option$")
	public void customer_selects_high_to_low_option() throws Throwable {
		bookaction.ClickhighToLow();
	}

	@Then("^Customer selects prime options$")
	public void customer_selects_prime_options() throws Throwable {
		bookaction.ClickPrime();
	}

	@Then("^Customer selects picture book from the filter option$")
	public void customer_selects_picture_book_from_the_filter_option() throws Throwable {
		bookaction.SelectPictureBook();
	}

	@Then("^Customer selects my first reader from the next filter option$")
	public void customer_selects_my_first_reader_from_the_next_filter_option() throws Throwable {
		bookaction.SelectTheFirstReader();
	}

	@Then("^Customer clicks in th polar bear picture book$")
	public void customer_clicks_in_th_polar_bear_picture_book() throws Throwable {
		bookaction.SelectpolarBearPictureBook();
	}

	@Then("^Customer lands on Item page$")
	public void customer_lands_on_Item_page() throws Throwable {
	    System.out.println("The Item Page");
	}
	@Then("^Customer clicks the quantity button$")
	public void customer_clicks_the_quantity_button() throws Throwable {
		bookaction.ClickQauantity();
	}

	@Then("^Customer selects the quantity of the item$")
	public void customer_selects_the_quantity_of_the_item() throws Throwable {
		bookaction.SelectQuantity();
	}

	@Then("^Customer clicks on add to cart$")
	public void customer_clicks_on_add_to_cart() throws Throwable {
		bookaction.ClickAddToCart();
	}

	@Then("^Customer lands on the check out option page$")
	public void customer_lands_on_the_check_out_option_page() throws Throwable {
		bookaction.PrintThePrice();
	    System.out.println("The books price is " );
	}



}
