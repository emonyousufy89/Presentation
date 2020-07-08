package talentech.presentation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class App 
{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "Driver/chromedriver");
		
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		WebElement burger= driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']"));
		action.moveToElement(burger);
		action.click().build().perform();
		 
		JavascriptExecutor js=(JavascriptExecutor) driver;
		WebElement electronics = driver.findElement(By.xpath("//a[@data-menu-id='12']//div"));
		js.executeScript("arguments[0].scrollIntoView();", electronics);
		Thread.sleep(2000);
		electronics.click();
		Thread.sleep(2000);
		
		WebElement TV = driver.findElement(By.linkText("TV & Video"));
		action.moveToElement(TV);
		action.click().build().perform();
		
		WebElement Year = driver.findElement(By.xpath("//input[@name='s-ref-checkbox-21103541011']")); 
		js.executeScript("arguments[0].scrollIntoView();", Year);
		Thread.sleep(2000);
		Year.click();
		Thread.sleep(2000);
		
		WebElement Brand = driver.findElement(By.linkText("SAMSUNG"));
		js.executeScript("arguments[0].scrollIntoView();", Brand);
		Thread.sleep(2000);
		Brand.click();
		Thread.sleep(2000);
		
		WebElement IssueYear = driver.findElement(By.partialLinkText("SAMSUNG 65-inch Class QLED Q70T Series - 4K UHD Dual LED Quantum HDR Smart TV"));
		action.moveToElement(IssueYear);
		action.click().build().perform();
		
		
		WebElement AddToCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button']"));
		action.moveToElement(AddToCart);
		action.click().build().perform();
		
		
		
		WebElement Warrenty = driver.findElement(By.xpath("//button[@id='siAddCoverage-announce']"));
		action.moveToElement(Warrenty);
		action.click().build().perform();
		/*
		WebElement color=driver.findElement(By.xpath("//div[@class='result-color-container']//div[@style='background-color:#d10000;']"));
		action.moveToElement(color);
		action.click().build().perform();
		
		WebElement birds= driver.findElement(By.xpath("//a[@href='/store/product/cards-envelopes/birds-in-winter-notecards-S_681966']//div[@class='results-product-desc']"));
		action.moveToElement(birds);
		action.click().build().perform();
		
		WebElement quantity5=driver.findElement(By.xpath("//span[@class='quantity-stepup']"));
		action.moveToElement(quantity5);
		action.click().build().perform();
		action.click().build().perform();
		action.click().build().perform();
		action.click().build().perform();
		
		WebElement price= driver.findElement(By.xpath("//span[@id='totalPrice']"));
		String totalPrice= price.getText();
		System.out.println("The price of your order is :" + totalPrice);
		
		WebElement date=driver.findElement(By.xpath("//span[@class='datecolor']"));
		String Date=date.getText();
		System.out.println("Your Issue Date is : " + Date);
		
		WebElement sku=driver.findElement(By.xpath("//span[@class='sku-id']"));
		String SKU=sku.getText();
		System.out.println("the SKU number is : " + SKU);
		
		WebElement addTocart=driver.findElement(By.xpath("//a[@id='addToCartVisBtn681966']")); 
		action.moveToElement(addTocart);
		action.click().build().perform();*/
		
		

	}

}
