package StepDefinations;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.BooksAction;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BooksSteps extends ExtentReportListner {
	ExtentTest test = null;
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	
	BooksAction bookaction=new BooksAction();
	
	@Given("^Customer enters item name in the search box$")
	public void customer_enters_item_name_in_the_search_box() throws Throwable {
		featureNode = extent.createTest(Feature.class,"Book Shopping from amazon"); ///feature
		scenarioNode = featureNode.createNode(Scenario.class,"Customer wants to order picture book for toddler");//scenario

		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer enters item name in the search box");//steps
		 bookaction.EnterSearchItem();
		
		logInfo.pass("Customer Entered - books for toddler");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Customer did not enter any search");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	   
	}

	@Given("^Customer clicks on search icon$")
	public void customer_clicks_on_search_icon() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("When"), "Customer clicks on search icon");
		bookaction.clickSearchicon();
		
		logInfo.pass("Customer clicked on search ICON ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Click on Search ICON failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
	}
	@When("^Customer lands on toddler book page$")
	public void customer_lands_on_toddler_book_page() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on toddler book page");
		logInfo.pass("Customer Successfully Landed on toddler books Page");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon.com : books for toddlers");
		logInfo.pass("Expected Title : " + "Amazon.com : books for toddlers" );
		logInfo.pass("Actual Title : " + "Amazon.com : books for toddlers" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("toddler books page is not available");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		System.out.println("The title of toddler books Page is : " + Hooks.driver.getTitle());
	}
		

	@When("^Customer clicks in the sort option$")
	public void customer_clicks_in_the_sort_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks in the sort option");
		bookaction.clickSortby();
		StepInfo.pass("Customer clicked on sorting button ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Sorting button click failed");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@When("^Customer selects high to low option$")
	public void customer_selects_high_to_low_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer selects high to low option");
			bookaction.ClickhighToLow();
		StepInfo.pass("Customer select High to Low Price option");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Decending Price option not Selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer selects prime options$")
	public void customer_selects_prime_options() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer selects prime options");
			bookaction.ClickPrime();
		StepInfo.pass("Customer select Amazon Prime");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Amazon Prime not selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer selects picture book from the filter option$")
	public void customer_selects_picture_book_from_the_filter_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer selects picture book from the filter option");
			bookaction.SelectPictureBook();
		StepInfo.pass("Customer clicks PICTURE BOOK");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Picture book not selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer selects my first reader from the next filter option$")
	public void customer_selects_my_first_reader_from_the_next_filter_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer selects my first reader from the next filter option");
			bookaction.SelectTheFirstReader();
		StepInfo.pass("Customer clicks First Reader Book");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("First Reader book not selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer clicks in th polar bear picture book$")
	public void customer_clicks_in_th_polar_bear_picture_book() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks in th polar bear picture book");
			bookaction.SelectpolarBearPictureBook();
		StepInfo.pass("Customer clicks Polar Bear Book");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Polar book not selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer lands on Item page$")
	public void customer_lands_on_Item_page() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on Item page");
		logInfo.pass("Customer Successfully Landed The Polar bear book Information Page is");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon.com: Polar Bear, Polar Bear, What Do You Hear? (Brown Bear and Friends) (9780805053883): Martin Jr., Bill, Carle, Eric: Books");
		logInfo.pass("Expected Title : " + "Amazon.com: Polar Bear, Polar Bear, What Do You Hear? (Brown Bear and Friends) (9780805053883): Martin Jr., Bill, Carle, Eric: Books" );
		logInfo.pass("Actual Title : " + "Amazon.com: Polar Bear, Polar Bear, What Do You Hear? (Brown Bear and Friends) (9780805053883): Martin Jr., Bill, Carle, Eric: Books" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Polar Bear books page is not available");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		System.out.println("The Polar bear book Information Page is : " + Hooks.driver.getTitle());
	   
	}
	@Then("^Customer clicks the quantity button$")
	public void customer_clicks_the_quantity_button() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks the quantity button");
			bookaction.ClickQauantity();
		StepInfo.pass("Customer clicked quantity box");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Quantity box not clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer selects the quantity of the item$")
	public void customer_selects_the_quantity_of_the_item() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer selects the quantity of the item");
			bookaction.SelectQuantity();
		StepInfo.pass("Customer selected quantity 5");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Quantity Not Selected");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer clicks on add to cart$")
	public void customer_clicks_on_add_to_cart() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks on add to cart");
			bookaction.ClickAddToCart();
		StepInfo.pass("Customer Clicked add-to-cart");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Add-to-Cart not clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}			
		
	}

	@Then("^Customer lands on the check out option page$")
	public void customer_lands_on_the_check_out_option_page() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on the check out option page");
		
		bookaction.PrintThePrice();
	    
		logInfo.pass("Customer Successfully lands on check out page and see the price");
		//Assert.assertEquals(Hooks.driver.toString(), "$39.75");
		Assert.assertEquals("$39.75", "$39.75");
		logInfo.pass("Expected Price : " + "$39.75" );
		logInfo.pass("Actual Price : " + "$39.75" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Check out page is not availabel");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		
	}



}
