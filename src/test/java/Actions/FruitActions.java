package Actions;

import org.openqa.selenium.support.PageFactory;
import Pages.FruitPages;
import StepDefinations.Hooks;

public class FruitActions {

	FruitPages fruitpage;

	public FruitActions() { 

		fruitpage = new FruitPages ();
		PageFactory.initElements(Hooks.driver, fruitpage);

	}
	public void Clickhamburgericon() throws InterruptedException {
		fruitpage.hamburgericon.click();
		Thread.sleep(2000);
	}

	public void Clickfood() throws InterruptedException {
		fruitpage.food.click();
		Thread.sleep(2000);
	}
	public void Clickamazonfresh() throws InterruptedException {
		fruitpage.amazonfresh.click();
		Thread.sleep(2000);
	}

	public void Clickclose()throws InterruptedException {
		fruitpage.close.click();
		Thread.sleep(2000);
	}

	public void Clickfreshproduce()throws InterruptedException {
		fruitpage.freshproduce.click();
		Thread.sleep(2000);
	}

	public void Clickfreshfruit()throws InterruptedException {
		fruitpage.freshfruit.click();
		Thread.sleep(2000);
	}

	public void Clickbananas()throws InterruptedException {
		fruitpage.bananas.click();
		Thread.sleep(2000);
	}

	public void Clickdolebananas()throws InterruptedException {
		fruitpage.dolebananas.click();
		Thread.sleep(2000);
	}
}
