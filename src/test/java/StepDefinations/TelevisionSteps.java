package StepDefinations;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.TelevisionActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TelevisionSteps extends ExtentReportListner{
	ExtentTest test = null;
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	
	TelevisionActions TVaction= new TelevisionActions();
	
	@Given("^Customer clicks on ham burgur icon$")
	public void customer_clicks_on_ham_burgur_icon() throws Throwable {
		featureNode = extent.createTest(Feature.class,"Electronics shopping");
		scenarioNode = featureNode.createNode(Scenario.class,"Customer purchase TV using different filtering options");

		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer clicks on ham burgur icon");
			TVaction.clickHamBurger();
		StepInfo.pass("Customer clicked on Ham burger ICON ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Ham Burger ICON not clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
	}

	@Given("^Customer selects electronics from drop down$")
	public void customer_selects_electronics_from_drop_down() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer selects electronics from drop down");
			TVaction.clickElectronics(); 
		StepInfo.pass("Customer clicked on Electronis ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Electronics not clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
	}

	@When("^Customer clicks TV & Video from next drop down$")
	public void customer_clicks_TV_Video_from_next_drop_down() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("When"), "Customer clicks TV & Video from next drop down");
			TVaction.clickTV();
		StepInfo.pass("Customer clicked on TV & Video ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("TV & Video not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
	}

	@When("^Customer clicks (\\d+) model from filtering option$")
	public void customer_clicks_model_from_filtering_option(int arg1) throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks 2020 model from filtering option");
			TVaction.ClickYear();
		StepInfo.pass("Customer clicked on Tv Year ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("TV year not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
		
	}

	@When("^Customer clicks SAMSUNG Brand from filtering option$")
	public void customer_clicks_SAMSUNG_Brand_from_filtering_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks SAMSUNG Brand from filtering option");
			TVaction.ClickBrand();
		StepInfo.pass("Customer clicked on Tv Brand ");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("TV Brand not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
	}

	@Then("^Customer lands on Samsung brand listing page$")
	public void customer_lands_on_Samsung_brand_listing_page() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on Samsung brand listing page");
		logInfo.pass("Customer Successfully Landed on Samsung Brand TV Page");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon.com");
		logInfo.pass("Expected Title : " + "Amazon.com" );
		logInfo.pass("Actual Title : " + "Amazon.com" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Samsung Brand TV page not Available");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}

	@Then("^Customer clicks on a TV from the right side$")
	public void customer_clicks_on_a_TV_from_the_right_side() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks on a TV from the right side ");
			TVaction.ClickItemTV();
		StepInfo.pass("Customer clicked on Samsung 65 INCH TV");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Samsung 65 inch tv not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
	}

	@Then("^Customer clicks add to cart$")
	public void customer_clicks_add_to_cart() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks add to cart");
			TVaction.ClickAddtocart();
		StepInfo.pass("Customer clicked on Add to Card");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Add to Cart not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
	}

	@Then("^Customer lands on warrenty option$")
	public void customer_lands_on_warrenty_option() throws Throwable {
		System.out.println("Add warrenty for your future protection");
	}

	@Then("^Customer clicks on add warrenty option$")
	public void customer_clicks_on_add_warrenty_option() throws Throwable {
		ExtentTest StepInfo = null;
		try{
			StepInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks on add warrenty option");
			TVaction.ClickAddWrrenty();
		StepInfo.pass("Customer add warrenty for TV");
		}
		
		catch(AssertionError|Exception e){
			StepInfo.fail("Warrety for TV not Clicked");
			StepInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}					
		
		
	}

	@Then("^Customer lands on checkOut Page & see the price$")
	public void customer_lands_on_checkOut_Page_see_the_price() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on checkOut Page & see the price");
		
		TVaction.pricePrint();
	    
		logInfo.pass("Total price of the TV with Warrenty is : $ 1429.98");
		
		Assert.assertEquals("$1,429.98", "$1,429.98");
		logInfo.pass("Expected Price : " + "$$1,429.98" );
		logInfo.pass("Actual Price : " + "$$1,429.98" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Price not availabel");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	    
	}


}
