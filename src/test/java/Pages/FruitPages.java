package Pages;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.How;



public class FruitPages {

	@FindBy(how=How.XPATH,using="//i[@class='hm-icon nav-sprite']")
	public WebElement hamburgericon;

	@FindBy(how=How.LINK_TEXT,using="Food & Grocery")
	public WebElement food;
	
	@FindBy(how=How.LINK_TEXT,using="Amazon Fresh")
	public WebElement amazonfresh;
	
	@FindBy(how=How.XPATH,using="//input[@data-action-type='DISMISS']")
	public WebElement close;

	@FindBy(how=How.XPATH,using="//a[@title='Fresh Produce']")
	public WebElement freshproduce;

	@FindBy(how=How.XPATH,using="//a[@title='Fresh Fruit']")
	public WebElement freshfruit;

	@FindBy(how=How.LINK_TEXT,using="BANANAS")
	public WebElement bananas;

	@FindBy(how=How.LINK_TEXT,using="Dole Bananas, 2 lb Bag")
	public WebElement dolebananas;


}
