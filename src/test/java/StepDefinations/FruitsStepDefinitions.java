package StepDefinations;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.FruitActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.*;

public class FruitsStepDefinitions extends ExtentReportListner {
	ExtentTest test = null;
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	

	FruitActions fruitaction = new FruitActions();



	@Given("^Customer clicks on hamburger icon$")
	public void customer_clicks_on_hamburger_icon() throws Throwable {
		featureNode = extent.createTest(Feature.class,"Fruits Shopping");
		scenarioNode = featureNode.createNode(Scenario.class,"Customer purchase Fruits using different filtering options");

		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer clicks on hamburger icon");
		fruitaction.Clickhamburgericon();
		
		logInfo.pass("Customer clicked on hamburger ICON");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Hamburger ICON not clicked");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	  
	}
	@Given("^Customer select Food & Grocery from drop down$")
	public void customer_select_Food_Grocery_from_drop_down() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("And"), "Customer select Food & Grocery from drop down");
			fruitaction.Clickfood();
			stepinfo.pass("Customer clicked on Food & Grocery");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Food & grocery not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}

		
	}
	@When("^Customer clicks Amazon fresh from next drop down$")
	public void customer_clicks_Amazon_fresh_from_next_drop_down() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("When"), "Customer clicks Amazon fresh from next drop down");
			fruitaction.Clickamazonfresh();
			stepinfo.pass("Customer clicked on Amazon fresh");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Amazon Fresh not clicked not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}
		
	}

	@Then("^Customer clicks close button on pop-up windows$")
	public void customer_clicks_close_button_on_pop_up_windows() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks close button on pop-up windows");
			fruitaction.Clickclose();
			stepinfo.pass("Customer closed the pop up window");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Pop up window not closed");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}

		
	}
	@Then("^Customer clicks Fresh Produce$")
	public void customer_clicks_Fresh_Produce() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks Fresh Produce");
			fruitaction.Clickfreshproduce();
			stepinfo.pass("Customer clicked Fresh Produce");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Fresh Produce not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}

		
	}
	@Then("^Customer clicks Fresh Fruit$")
	public void customer_clicks_Fresh_Fruit() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks Fresh Fruit");
			fruitaction.Clickfreshfruit();
			stepinfo.pass("Customer clicked Fresh Fruits");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Fresh Fruits not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}
		
	}
	@Then("^Customer clicks Bananas$")
	public void customer_clicks_Bananas() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks Bananas");
			fruitaction.Clickbananas();
			stepinfo.pass("Customer clicked BANANAS");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("BANANAS not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}

		
	}
	@Then("^Customer clicks Dole Bananas$")
	public void customer_clicks_Dole_Bananas() throws Throwable {
		ExtentTest stepinfo = null;
		try {
			stepinfo=scenarioNode.createNode(new GherkinKeyword("Then"), "Customer clicks Dole Bananas");
			fruitaction.Clickdolebananas();
			stepinfo.pass("Customer clicked Dole-BANANAS");
		}
		catch(AssertionError|Exception e) {
			stepinfo.fail("Dole-BANANAS not clicked");
			stepinfo.addScreencastFromPath(captureScreenShot(Hooks.driver));
		}


		
	}

}
