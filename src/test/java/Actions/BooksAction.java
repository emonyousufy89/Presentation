package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BooksPage;
import StepDefinations.Hooks;

public class BooksAction {

	BooksPage bookpage;
	JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;
	WebDriverWait wait= new WebDriverWait(Hooks.driver,10);

	public BooksAction() {
		bookpage = new BooksPage ();
		PageFactory.initElements(Hooks.driver, bookpage);
	}

	public void EnterSearchItem() {
		bookpage.SearchBox.sendKeys("books for toddlers");
	}
	public void clickSearchicon() {	
		wait.until(ExpectedConditions.visibilityOf(bookpage.SearchIcon));
		bookpage.SearchIcon.click();
	}
	public void clickSortby() throws InterruptedException {
		bookpage.Sorting.click();
		Thread.sleep(1000);
	}
	public void ClickhighToLow() {
		bookpage.HighToLow.click();
	}
	public void ClickPrime() {
		bookpage.Prime.click();
	}
	public void SelectPictureBook() {
		js.executeScript("arguments[0].scrollIntoView();", bookpage.PictureBook);
		bookpage.PictureBook.click();
	}
	public void SelectTheFirstReader() {
		js.executeScript("arguments[0].scrollIntoView();", bookpage.TheFirstReader);
		bookpage.TheFirstReader.click();
	}
	public void SelectpolarBearPictureBook() throws InterruptedException {
		bookpage.PolarBear.click();
		Thread.sleep(1000);
	}
	public void ClickQauantity() throws InterruptedException {
		bookpage.Quantity.click();
		Thread.sleep(1000);
	}
	public void SelectQuantity() {
		bookpage.SelectQuantity.click();
	}
	public void ClickAddToCart() throws InterruptedException {
		bookpage.Addtocart.click();
		Thread.sleep(1000);
	}
	public void PrintThePrice() {
		bookpage.TotalPrice.getText();
	}

}
