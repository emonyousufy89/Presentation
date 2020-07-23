package StepDefinations;


import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.SignUpActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps extends ExtentReportListner {
	ExtentTest test = null;
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	
	
	SignUpActions signupaction= new SignUpActions();
	
	@Given("^Customer clicks in the signIn button$")
	public void customer_clicks_in_the_signIn_button() throws Throwable {
		featureNode = extent.createTest(Feature.class,"Sign Up into Amazon.com");
		scenarioNode = featureNode.createNode(Scenario.class,"Customer wants to create an account with valid data");

		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer clicks in the signIn button");
		signupaction.clickSignInlink();
		
		logInfo.pass("User clicked the sign in link passed ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("User clicked the sign in link Failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	}

	@Given("^Customer clicks on create an account$")
	public void customer_clicks_on_create_an_account() throws Throwable {
		
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks on create an account");
		signupaction.clickCreateAccount();
		
		logInfo.pass("User clicked Create Account link passed ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("User clicked Create Account link Failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		
	}

	@When("^Custoemer lands in account creating page$")
	public void custoemer_lands_in_account_creating_page() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("When"), "Custoemer lands in account creating page");
		logInfo.pass("Customer Successfully Landed on Amazon Registration Link Page");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon Registration");
		logInfo.pass("Expected Title : " + "Amazon Registration" );
		logInfo.pass("Actual Title : " + "Amazon Registration" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Registration Page desplay Failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		System.out.println("The title of Registration Page is : " + Hooks.driver.getTitle());
	}

	@When("^Customer Enters name$")
	public void customer_Enters_name() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer Enters name");
		signupaction.EnterName("Kazi Rizwana Hoque");
		logInfo.pass("User Entered The Name");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("User Could not Enter The Name");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}

	@When("^Customer Enters email$")
	public void customer_Enters_email() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer Enters email");
		signupaction.EnterEmail("KAZIRIZWANAHAQUE@gmail.com ");
		logInfo.pass("User Entered email");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("User Could not Enter The Email");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	}

	@When("^Customer Enters password$")
	public void customer_Enters_password() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer Enters password");
		signupaction.EnterPassword("kaziUSADel25");
		logInfo.pass("User Set The Password");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("User Could not Set The Password");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	}

	@When("^Customer Check password$")
	public void customer_Check_password() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer Check password");
		signupaction.ConfirmPassword("kaziUSADel25");
		logInfo.pass("User Re-Enter The Password");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("User Could not Re-Enter The Password");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	}

	@Then("^Customer clicks on Submit button$")
	public void customer_clicks_on_Submit_button() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer clicks on Submit button");
		signupaction.ClickSubmit(); 
		
		logInfo.pass(" Account Created Successfully ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Account was not created");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}	
	}

}
