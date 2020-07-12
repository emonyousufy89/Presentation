package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Pages.TelevisionPages;
import StepDefinations.Hooks;

public class TelevisionActions {

	TelevisionPages tvpage;
	JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;

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
	public void ClickYear() {
		js.executeScript("arguments[0].scrollIntoView();", tvpage.Year);
		tvpage.Year.click();
	}
	public void ClickBrand() {
		js.executeScript("arguments[0].scrollIntoView();", tvpage.Brand);
		tvpage.Brand.click();
	}
	public void ClickItemTV() {
		tvpage.ItemTv.click();
	}
	public void ClickAddtocart() {
		tvpage.AddToCart.click();
	}
	public void ClickAddWrrenty() {
		tvpage.Addwarrenty.click();
	}
	public void pricePrint() {
		tvpage.Price.getText();
	}

}
