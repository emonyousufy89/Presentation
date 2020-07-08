package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TelevisionPages {
	
	@FindBy(how=How.XPATH,using="//i[@class='hm-icon nav-sprite']")
	public WebElement HamburgurIcon;
	
	@FindBy(how=How.XPATH,using="//a[@data-menu-id='12']//div")
	public WebElement Electronics;
	
	@FindBy(how=How.LINK_TEXT,using="TV & Video")
	public WebElement TV;
	
	@FindBy(how=How.XPATH,using="//input[@name='s-ref-checkbox-21103541011']")
	public WebElement Year;
	
	@FindBy(how=How.LINK_TEXT,using="SAMSUNG")
	public WebElement Brand;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="SAMSUNG 65-inch Class QLED Q70T Series - 4K UHD Dual LED Quantum HDR Smart TV")
	public WebElement ItemTv;
	
	@FindBy(how=How.LINK_TEXT,using="//input[@id='add-to-cart-button']")
	public WebElement AddToCart;
	
	@FindBy(how=How.LINK_TEXT,using="//button[@id='siAddCoverage-announce']")
	public WebElement Addwarrenty;
	
	@FindBy(how=How.LINK_TEXT,using="//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")
	public WebElement Price;
	

}
