package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignInPages {
	
	@FindBy(how=How.XPATH,using="//a[@id='nav-link-accountList']")
	public WebElement loginlink;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_email']")
	public WebElement username;
	
	@FindBy(how=How.XPATH,using="//input[@id='continue']")
	public WebElement conti;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
	public WebElement passwd;
	
	@FindBy(how=How.XPATH,using="//input[@id= 'signInSubmit']")
	public WebElement signIn;
	

}
