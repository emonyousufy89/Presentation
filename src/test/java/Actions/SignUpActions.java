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
	public void EnterEmail(String email) throws InterruptedException {
		signuppage.email.sendKeys(email);
		Thread.sleep(1000);
	}
	public void EnterPassword(String password) throws InterruptedException {
		signuppage.password.sendKeys(password);
		Thread.sleep(1000);
	}
	public void ConfirmPassword(String passwd) throws InterruptedException {
		signuppage.ConfPasswd.sendKeys(passwd);
		Thread.sleep(1000);
	}
	public void ClickSubmit() throws InterruptedException {
		signuppage.Submit.click();
		Thread.sleep(2000);
	}

}
