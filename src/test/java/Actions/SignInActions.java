package Actions;

import org.openqa.selenium.support.PageFactory;


import Pages.SignInPages;
import StepDefinations.Hooks;

public class SignInActions {
	
	SignInPages signinpage;

	public SignInActions() {
		signinpage = new SignInPages();
		PageFactory.initElements(Hooks.driver, signinpage);
	}

	public void clickloginlink() {
		signinpage.loginlink.click(); 
	}
	public void UserName(String user) {
		signinpage.username.sendKeys(user);
	}
	public void clickContinue() {
		signinpage.conti.click(); 
	}
	public void Password(String passwd) {
		signinpage.passwd.sendKeys(passwd);
	}
	public void SignIn() throws InterruptedException {
		signinpage.signIn.click();
		Thread.sleep(2000);
	}

}
