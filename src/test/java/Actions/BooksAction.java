package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;

import Pages.BooksPage;
import StepDefinations.Hooks;

public class BooksAction {

	BooksPage bookpage;
	JavascriptExecutor js=(JavascriptExecutor) Hooks.driver;

	public BooksAction() {
		bookpage = new BooksPage ();
		PageFactory.initElements(Hooks.driver, bookpage);
	}

	public void EnterSearchItem() {
		bookpage.SearchBox.sendKeys("books for toddlers");
	}
	public void clickSearchicon() {	
		bookpage.SearchIcon.click();
	}
	public void clickSortby() {
		bookpage.Sorting.click();
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
	public void SelectpolarBearPictureBook() {
		bookpage.PolarBear.click();
	}
	public void ClickQauantity() {
		bookpage.Quantity.click();
	}
	public void SelectQuantity() {
		bookpage.SelectQuantity.click();
	}
	public void ClickAddToCart() {
		bookpage.Addtocart.click();
	}
	public void PrintThePrice() {
		bookpage.TotalPrice.getText();
	}

}
