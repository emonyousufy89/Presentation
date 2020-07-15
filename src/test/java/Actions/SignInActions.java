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
	public void UserName(String user) throws InterruptedException {
		signinpage.username.sendKeys(user);
		Thread.sleep(1000);
	}
	public void clickContinue() throws InterruptedException {
		signinpage.conti.click();
		Thread.sleep(1000);
	}
	public void Password(String passwd) throws InterruptedException {
		signinpage.passwd.sendKeys(passwd);
		Thread.sleep(1000);
	}
	public void SignIn() throws InterruptedException {
		signinpage.signIn.click();
		Thread.sleep(2000);
	}

}
