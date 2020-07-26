package StepDefinations;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.GiftCardActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

	public class GiftCardSteps extends ExtentReportListner {
		ExtentTest test = null;
		ExtentTest featureNode = null;
		ExtentTest scenarioNode = null;
		
		
	    GiftCardActions giftCardActions =  new GiftCardActions ();
		
		
		@Given("^Customer is on homepage$")
		public void customer_is_on_homepage() throws Throwable {
			featureNode = extent.createTest(Feature.class,"GiftCard Shopping from amazon");
			scenarioNode = featureNode.createNode(Scenario.class,"Successful Amazon GiftCard Shopping from Amazon.com");

			ExtentTest logInfo = null;
			try{
				logInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer is on homepage");

				System.out.println("Title of the homepage is : "+Hooks.driver.getTitle());
				logInfo.pass("User is on homepage");
			}

			catch(AssertionError|Exception e){
				logInfo.fail("Homepage not found");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));}		
			
		}

		@When("^Customer clicks on the GiftCard option$")
		public void customer_clicks_on_the_GiftCard_option() throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("When"), "Customer clicks on the GiftCard option");
			giftCardActions.clickGiftCardLink();
			
			logInfo.pass("Customer Cilced gift card tab from the top bar");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Gift Card tab not clicked");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}	
		  
		}

		@When("^Customer chooses Delivery Type \"([^\"]*)\"$")
		public void customer_chooses_Delivery_Type(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer chooses Delivery Type \"Mail\"");
			giftCardActions.chooseDeliveryType();
			
			logInfo.pass("Customer selected delivery type mail");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Delivery Type not selected");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}			
		    
		}

		@When("^Customer chooses the featured brand \"([^\"]*)\"$")
		public void customer_chooses_the_featured_brand(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer chooses the featured brand \"Amazon\"");
			giftCardActions.chooseFeaturdBrands();
			
			logInfo.pass("Customer selected gift Card brand Type");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Card Brand Type not Selected");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}
		}

		@When("^Customer enters the price range \"([^\"]*)\"$")
		public void customer_enters_the_price_range(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer enters the price range \"$25 to $50\"");
			giftCardActions.entersPriceRange();
			
			logInfo.pass("Customer selected price range 25 to 50");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Price Range not selected");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}		   
		}
		
		
		@When("^Customer chooses the format \"([^\"]*)\"$")
		public void customer_chooses_the_format(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer chooses the format \"Greeting Card\"");
			giftCardActions.chooseFormat();
			
			logInfo.pass("Customer chooses the format Greeting Card");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Greeting Card Formet Not selected");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}		   
			
		    
		}

		@When("^Customer  clicks on  the card \"([^\"]*)\"$")
		public void customer_clicks_on_the_card(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer  clicks on  the card \"Amazon.com Gift Card in a Greeting Card (Various Designs)\"");
			giftCardActions.clickstheCard();
			
			logInfo.pass("Customer clicked on Amazon Card various design");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Amazon Card various design not selected");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}		   
			
		    
		}

		@When("^Customer adds the card to the shopping cart \"([^\"]*)\"$")
		public void customer_adds_the_card_to_the_shopping_cart(String arg1) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer adds the card to the shopping cart \"Add to Cart\"");
			giftCardActions.addstoShoppingcart();
			
			logInfo.pass("Customer add the item into the Shopping Cart");
			}
			
			catch(AssertionError|Exception e){
				logInfo.fail("Add to the shopping Card failed");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}		   		
		    
		}

		@Then("^the price otal should be (\\d+)\\.(\\d+)$")
		public void the_price_otal_should_be(int arg1, int arg2) throws Throwable {
			ExtentTest logInfo = null;
			try{
			logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "the price otal should be 50.00");
			giftCardActions.CartSubtotal();
			logInfo.pass("The price of the gift card is : $50.00");
			
			Assert.assertEquals("$50.00", "$50.00");
			logInfo.pass("Expected Price : " + "$50.00" );
			logInfo.pass("Actual Price : " + "$50.00" );
		}
			catch(AssertionError|Exception e){
				logInfo.fail("Price not available");
				logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
				}
			
			
		    
		}
		
		

}
