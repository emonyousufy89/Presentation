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

	public void clickSignInlink() throws InterruptedException {
		signuppage.SignInlink.click();
		Thread.sleep(2000);
	}
	public void clickCreateAccount() throws InterruptedException {
		signuppage.CreateAccount.click();
		Thread.sleep(2000);
	}
	public void EnterName(String name) throws InterruptedException {
		signuppage.Name.sendKeys(name);
		Thread.sleep(2000);
	}
	public void EnterEmail(String email) throws InterruptedException {
		signuppage.email.sendKeys(email);
		Thread.sleep(2000);
	}
	public void EnterPassword(String password) throws InterruptedException {
		signuppage.password.sendKeys(password);
		Thread.sleep(2000);
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
