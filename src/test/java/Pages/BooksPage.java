package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BooksPage {
	
	@FindBy(how=How.XPATH,using="//input[@id='twotabsearchtextbox']")
	public WebElement SearchBox;
	
	@FindBy(how=How.XPATH,using="//span[@class='nav-search-submit-text nav-sprite']")
	public WebElement SearchIcon;
	
	@FindBy(how=How.XPATH,using="//span[@class='a-button-text a-declarative']")
	public WebElement Sorting;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Price: High to Low')]")
	public WebElement HighToLow;
	
	@FindBy(how=How.XPATH,using="//i[@aria-label='Prime Eligible']")
	public WebElement Prime;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'Picture Books')]")
	public WebElement PictureBook;
	
	@FindBy(how=How.XPATH,using="//span[contains(text(),'My First Reader')]")
	public WebElement TheFirstReader;
	
	@FindBy(how=How.PARTIAL_LINK_TEXT,using="Polar Bear, Polar Bear, What Do You Hear?")
	public WebElement PolarBear;
	
	@FindBy(how=How.XPATH,using="//span[@id='a-autoid-0-announce']")
	public WebElement Quantity;
	
	@FindBy(how=How.XPATH,using="//a[@id='quantity_4']")
	public WebElement SelectQuantity;
	
	@FindBy(how=How.XPATH,using="//input[@id='add-to-cart-button']")
	public WebElement Addtocart;
	
	@FindBy(how=How.XPATH,using="//span[@class='a-color-price hlb-price a-inline-block a-text-bold']")
	public WebElement TotalPrice;

}
