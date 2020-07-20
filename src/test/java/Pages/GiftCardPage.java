package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;


public class GiftCardPage {

	@FindBy(how = How.LINK_TEXT,using ="Gift Cards")
	public WebElement giftcardlink;
	
	@FindBy(how = How.XPATH,using ="//input[@name='s-ref-checkbox-2740967011']")
	public WebElement chooseDeliveryType;
	
	@FindBy(how = How.XPATH,using ="//li[@id='p_89/Amazon']//i[@class='a-icon a-icon-checkbox']")
	public WebElement chooseFeaturedBrands;
	
	@FindBy(how = How.XPATH,using ="//span[contains(text(),'$25 to $50')]")
	public WebElement entersPriceRange;
	
	@FindBy(how = How.XPATH,using ="//li[@id='p_n_feature_three_browse-bin/7239374011']//i[@class='a-icon a-icon-checkbox']")
	public WebElement chooseFormat;
	
	@FindBy(how = How.LINK_TEXT,using ="Amazon.com Gift Card in a Birthday Pop-Up Box")
	public WebElement clickstheCard;
	
	@FindBy(how = How.XPATH,using ="//input[@id='add-to-cart-button']")
	public WebElement addsthecardtoShoppingCart;
	
	@FindBy(how = How.XPATH,using ="//div[@class='a-row a-spacing-micro']//b[contains(text(),'Cart subtotal')]")
	public WebElement CartSubtotal;

}
