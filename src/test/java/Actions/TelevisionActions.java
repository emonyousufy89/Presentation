package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.TelevisionPages;
import StepDefinations.Hooks;

public class TelevisionActions {

	TelevisionPages tvpage;
	JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;
	WebDriverWait wait= new WebDriverWait(Hooks.driver,20);


	public TelevisionActions() {
		tvpage = new TelevisionPages();
		PageFactory.initElements(Hooks.driver, tvpage);
	}

	public void clickHamBurger() throws InterruptedException {
		tvpage.HamburgurIcon.click();
		Thread.sleep(1000);
	}
	public void clickElectronics() throws InterruptedException {	
		tvpage.Electronics.click();
		Thread.sleep(1000);
	}
	public void clickTV() throws InterruptedException {
		tvpage.TV.click();
		Thread.sleep(000);
	}
	public void ClickYear() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", tvpage.Year);
		tvpage.Year.click();
		Thread.sleep(1000);
	}
	public void ClickBrand() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", tvpage.Brand);
		tvpage.Brand.click();
		Thread.sleep(2000);
	}
	public void ClickItemTV() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", tvpage.ItemTv);
		wait.until(ExpectedConditions.visibilityOf(tvpage.ItemTv));
		Thread.sleep(1000);
		tvpage.ItemTv.click();
		Thread.sleep(1000);
	}
	public void ClickAddtocart() throws InterruptedException {
		tvpage.AddToCart.click();
		Thread.sleep(1000);
	}
	public void ClickAddWrrenty() throws InterruptedException {
		tvpage.Addwarrenty.click();
		Thread.sleep(1000);
	}
	public void pricePrint() throws InterruptedException {
		tvpage.Price.getText();
		Thread.sleep(1000);
	}

}
