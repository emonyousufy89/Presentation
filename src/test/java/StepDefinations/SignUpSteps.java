package StepDefinations;


import Actions.SignUpActions;
import Reporterutils.ExtentReportListner;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps extends ExtentReportListner {
	
	SignUpActions signupaction= new SignUpActions();
	
	@Given("^Customer clicks in the signIn button$")
	public void customer_clicks_in_the_signIn_button() throws Throwable {
		signupaction.clickSignInlink();
	}

	@Given("^Customer clicks on create an account$")
	public void customer_clicks_on_create_an_account() throws Throwable {
		signupaction.clickCreateAccount();
	}

	@When("^Custoemer lands in account creating page$")
	public void custoemer_lands_in_account_creating_page() throws Throwable {
	    System.out.println("the account creating page");
	}

	@When("^Customer Enters name$")
	public void customer_Enters_name() throws Throwable {
		signupaction.EnterName("kazi");
	}

	@When("^Customer Enters email$")
	public void customer_Enters_email() throws Throwable {
		signupaction.EnterEmail("kazi.com");
	
	}

	@When("^Customer Enters password$")
	public void customer_Enters_password() throws Throwable {
		signupaction.EnterPassword("kaziUsaDel");
	}

	@When("^Customer Check password$")
	public void customer_Check_password() throws Throwable {
		signupaction.ConfirmPassword("kaziUsaDel");
	   
	}

	@Then("^Customer clicks on Submit button$")
	public void customer_clicks_on_Submit_button() throws Throwable {
		signupaction.ClickSubmit(); 
	}



}
