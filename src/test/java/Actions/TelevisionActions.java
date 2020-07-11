package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Pages.TelevisionPages;
import StepDefinations.Hooks;

public class TelevisionActions {

	TelevisionPages tvpage;
	//JavascriptExecutor js=(JavascriptExecutor) tvpage;

	public TelevisionActions() {
		tvpage = new TelevisionPages();
		PageFactory.initElements(Hooks.driver, tvpage);
	}

	public void clickHamBurger() {
		tvpage.HamburgurIcon.click();
	}
	public void clickElectronics() {	
		tvpage.Electronics.click();
	}
	public void clickTV() {
		tvpage.TV.click();
	}
	public void Year() {
		tvpage.Year.click();
	}
	public void Brand() {
		tvpage.Brand.click();
	}
	public void ItemTV() {
		tvpage.ItemTv.click();
	}
	public void Addtocart() {
		tvpage.AddToCart.click();
	}
	public void AddWrrenty() {
		tvpage.Addwarrenty.click();
	}
	public void pricePrint() {
		tvpage.Price.getText();
	}

}
