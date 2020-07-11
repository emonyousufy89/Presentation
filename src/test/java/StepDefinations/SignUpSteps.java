package StepDefinations;


import Actions.SignUpActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignUpSteps {
	
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

	@When("^Enters name$")
	public void enters_name(String name) throws Throwable {
		signupaction.EnterName(name);
	}

	@When("^Enters email$")
	public void enters_email(String email) throws Throwable {
		signupaction.EnterEmail(email);
	
	}

	@When("^Enters password$")
	public void enters_password(String password) throws Throwable {
		signupaction.EnterPassword(password);
	}

	@When("^Check password$")
	public void check_password(String passwd) throws Throwable {
		signupaction.ConfirmPassword(passwd);
	   
	}

	@Then("^Customer clicks on Submit button$")
	public void customer_clicks_on_Submit_button() throws Throwable {
		signupaction.ClickSubmit(); 
	}



}
