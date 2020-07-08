package StepDefinations;

import org.openqa.selenium.WebDriver;

import Actions.SignInActions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SignInSteps {
	
	WebDriver driver;
	
	SignInActions signinaction= new SignInActions();
	
	@Given("^Customer clicks on Hello Sign In button$")
	public void customer_clicks_on_Hello_Sign_In_button() throws Throwable {
		signinaction.clickloginlink();
	}

	@Given("^Customer enters username$")
	public void customer_enters_username() throws Throwable {
		signinaction.UserName("emonyousufy89@gmail.com");
	}

	@When("^Customer see continue button$")
	public void customer_see_continue_button() throws Throwable {
		System.out.println("The title of the page is : ");
	
	}

	@When("^Customer click continue button$")
	public void customer_click_continue_button() throws Throwable {
		signinaction.clickContinue();
	}

	@When("^Customer enters password$")
	public void customer_enters_password() throws Throwable {
		signinaction.Password("ScrollDown22");
	}

	@When("^Customer clicks signIn button$")
	public void customer_clicks_signIn_button() throws Throwable {
		signinaction.SignIn();
	}

	@Then("^Customer lands on account homepage$")
	public void customer_lands_on_account_homepage() throws Throwable {
		System.out.println("The title of the homepage is : ");
	}
	
	
}
