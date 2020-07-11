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
	public void EnterName(String name) {
		signuppage.Name.sendKeys("kkkkk");
	}
	public void EnterEmail(String email) {
		signuppage.email.sendKeys("jjjjj");
	}
	public void EnterPassword(String password) {
		signuppage.password.sendKeys("kkkk");
	}
	public void ConfirmPassword(String passwd) {
		signuppage.ConfPasswd.sendKeys("kkk");
	}
	public void ClickSubmit() {
		signuppage.Submit.click();
	}

}
