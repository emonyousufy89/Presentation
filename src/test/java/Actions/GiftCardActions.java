package Actions;


import org.openqa.selenium.support.PageFactory;

import Pages.GiftCardPage;
import StepDefinations.Hooks;




public class GiftCardActions {
	
	GiftCardPage giftCardPage;

	public GiftCardActions() {
		giftCardPage = new GiftCardPage();  //action object as well as page object
		PageFactory.initElements(Hooks.driver, giftCardPage);


	}

	public void clickGiftCardLink() throws InterruptedException {
		
		giftCardPage.giftcardlink.click();
		Thread.sleep(1000);
	}
	
	public void chooseDeliveryType() throws InterruptedException {
		giftCardPage.chooseDeliveryType.click();
		Thread.sleep(1000);
	}
	
	public void chooseFeaturdBrands() throws InterruptedException {
		giftCardPage.chooseFeaturedBrands.click();
		Thread.sleep(1000);
	}
	
	public void entersPriceRange() throws InterruptedException {
		giftCardPage.entersPriceRange.click();
		Thread.sleep(1000);
	}
	
	public void chooseFormat() throws InterruptedException {
		giftCardPage.chooseFormat.click();
		Thread.sleep(1000);
	}
	
	public void clickstheCard() throws InterruptedException {
		giftCardPage.clickstheCard.click();
		Thread.sleep(1000);
	}
	
	public void addstoShoppingcart() throws InterruptedException {
		giftCardPage.addsthecardtoShoppingCart.click();
		Thread.sleep(1000);
	}
	
	public void CartSubtotal() throws InterruptedException {
		giftCardPage.CartSubtotal.getText();
	}
}


