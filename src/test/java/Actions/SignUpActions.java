package Actions;

import org.openqa.selenium.support.PageFactory;

import Pages.SignUpPages;
import StepDefinations.Hooks;



public class SignUpActions {
	
	SignUpPages signuppage;

	public SignUpActions() {
		signuppage = new SignUpPages();
		PageFactory.initElements(Hooks.driver, signuppage);
	}

	public void clickSignInlink() {
		signuppage.SignInlink.click(); 
	}
	public void clickCreateAccount() {
		signuppage.CreateAccount.click();
	}
	public void EnterName(String name) throws InterruptedException {
		signuppage.Name.sendKeys(name);
		Thread.sleep(1000);
	}
	public void EnterEmail(String email) {
		signuppage.email.sendKeys(email);
	}
	public void EnterPassword(String password) {
		signuppage.password.sendKeys(password);
	}
	public void ConfirmPassword(String passwd) throws InterruptedException {
		signuppage.ConfPasswd.sendKeys(passwd);
		Thread.sleep(2000);
	}
	public void ClickSubmit() throws InterruptedException {
		signuppage.Submit.click();
		Thread.sleep(2000);
	}

}
