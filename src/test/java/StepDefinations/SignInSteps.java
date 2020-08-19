package StepDefinations;

import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.GherkinKeyword;
import com.aventstack.extentreports.gherkin.model.Feature;
import com.aventstack.extentreports.gherkin.model.Scenario;

import Actions.SignInActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps extends ExtentReportListner {
	
	ExtentTest test = null;
	ExtentTest featureNode = null;
	ExtentTest scenarioNode = null;
	
	
	SignInActions signinaction= new SignInActions();
	
	@Given("^Customer clicks on Hello Sign In button$")
	public void customer_clicks_on_Hello_Sign_In_button() throws Throwable {
		featureNode = extent.createTest(Feature.class,"SignIn to Amazon.com");
		scenarioNode = featureNode.createNode(Scenario.class,"Registered Customer Sign In with valid credentials");

		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Given"), "Customer clicks on Hello Sign In button");
		signinaction.clickloginlink();
		
		logInfo.pass("User clicked the sign in link ");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Login link click fail");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}

	@Given("^Customer enters username$")
	public void customer_enters_username() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer enters username");
		signinaction.UserName("emonyousufy@gmail.com");
		logInfo.pass("Email Entered");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Email not Entered");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}
	@When("^Customer see continue button$")
	public void customer_see_continue_button() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("When"), "Customer see continue button");
		logInfo.pass("User see the continue button");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon Sign-In");
		logInfo.pass("Expected Title : "+"Amazon Sign-In" );
		logInfo.pass("Actual Title : "+ "Amazon Sign-In" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Next Continue Page not Displayed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		System.out.println("The title of the page is : " + Hooks.driver.getTitle());
	
	}

	@When("^Customer click continue button$")
	public void customer_click_continue_button() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer click continue button");
		signinaction.clickContinue();
		
		logInfo.pass(" Click on Continue Success");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Click on Continue Failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}

	@When("^Customer enters password$")
	public void customer_enters_password() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer enters password");
		signinaction.Password("ScrollDown22");
		logInfo.pass("Password Entered");
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Email not Entered");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		
	}

	@When("^Customer clicks signIn button$")
	public void customer_clicks_signIn_button() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("And"), "Customer clicks signIn button");
		signinaction.SignIn();
		
		logInfo.pass(" Customer Clicked on Sign In button");
		}
		
		catch(AssertionError|Exception e){
			logInfo.fail("Sign In button click failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
	}

	@Then("^Customer lands on account homepage$")
	public void customer_lands_on_account_homepage() throws Throwable {
		ExtentTest logInfo = null;
		try{
		logInfo = scenarioNode.createNode(new GherkinKeyword("Then"), "Customer lands on account homepage\n" + 
				"   ");
		logInfo.pass("Customer Successfully Landed on Amazon User HomePage");
		Assert.assertEquals(Hooks.driver.getTitle(), "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more");
		logInfo.pass("Expected Title : "+"Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" );
		logInfo.pass("Actual Title : "+ "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more" );
	}
		catch(AssertionError|Exception e){
			logInfo.fail("Sign In Failed");
			logInfo.addScreenCaptureFromPath(captureScreenShot(Hooks.driver));
			}
		System.out.println("The title of Customer's homepage is : " + Hooks.driver.getTitle());
	}
	////span[@class='icp-nav-flag icp-nav-flag-us']
	
}
