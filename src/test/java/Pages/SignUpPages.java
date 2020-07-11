package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignUpPages {
	
	@FindBy(how=How.XPATH,using="//a[@id='nav-link-accountList']")
	public WebElement SignInlink;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Create your Amazon account')]")
	public WebElement CreateAccount;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_customer_name']")
	public WebElement Name;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_email']")
	public WebElement email;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password']")
	public WebElement password;
	
	@FindBy(how=How.XPATH,using="//input[@id='ap_password_check']")
	public WebElement ConfPasswd;
	
	@FindBy(how=How.XPATH,using="//input[@type='submit']")
	public WebElement Submit;
	
}
