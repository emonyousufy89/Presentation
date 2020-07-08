package Actions;

import org.openqa.selenium.support.PageFactory;

import Com.talentech.Stepdefination.Hooks;
import Com.talentech.pages.LoginPage;

public class SignUpActions {
	
	LoginPage loginpage;

	public LoginPageActions() {
		loginpage = new LoginPage();
		PageFactory.initElements(Hooks.driver, loginpage);
	}

	public void clickloginlink() {
		loginpage.loginlink.click(); 
	}
	public void UserName(String user) {
		loginpage.username.sendKeys(user);
	}
	public void Password(String passwd) {
		loginpage.passwd.sendKeys(passwd);
	}
	public void Sign() {
		loginpage.signIn.click();
	}

}
