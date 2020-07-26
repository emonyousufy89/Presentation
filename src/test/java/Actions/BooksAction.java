package Actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
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

	public void EnterSearchItem() throws InterruptedException {
		bookpage.SearchBox.sendKeys("books for toddlers");
		Thread.sleep(2000);
	}
	public void clickSearchicon() throws InterruptedException {	
		wait.until(ExpectedConditions.visibilityOf(bookpage.SearchIcon));
		bookpage.SearchIcon.click();
		Thread.sleep(2000);
	}
	public void clickSortby() throws InterruptedException {
		//Select s=new Select(clickSortby);
		//s.selectByIndex(2);
		bookpage.Sorting.click();
		Thread.sleep(2000);
	}
	public void ClickhighToLow() throws InterruptedException {
		bookpage.HighToLow.click();
		Thread.sleep(2000);
	}
	public void ClickPrime() throws InterruptedException {
		bookpage.Prime.click();
		Thread.sleep(2000);
	}
	public void SelectPictureBook() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", bookpage.PictureBook);
		Thread.sleep(2000);
		bookpage.PictureBook.click();
		Thread.sleep(2000);
	}
	public void SelectTheFirstReader() throws InterruptedException {
		js.executeScript("arguments[0].scrollIntoView();", bookpage.TheFirstReader);
		Thread.sleep(2000);
		bookpage.TheFirstReader.click();
		Thread.sleep(2000);
	}
	public void SelectpolarBearPictureBook() throws InterruptedException {
		bookpage.PolarBear.click();
		Thread.sleep(2000);
	}
	public void ClickQauantity() throws InterruptedException {
		bookpage.Quantity.click();
		Thread.sleep(2000);
	}
	public void SelectQuantity() {
		bookpage.SelectQuantity.click();
	}
	public void ClickAddToCart() throws InterruptedException {
		bookpage.Addtocart.click();
		Thread.sleep(2000);
	}
	public String PrintThePrice() {
		return bookpage.TotalPrice.getText();
	}

}
