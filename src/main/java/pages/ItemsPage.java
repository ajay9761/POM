package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Delivery.BaseClass.TestBase;

public class ItemsPage extends TestBase {
	@FindBy(xpath="//a[contains(text(),'Create Item')]")
	@CacheLookup
	WebElement CreateItemLabel;
	
	@FindBy(xpath=".//*[@id='main-content']/div[1]/div/button")
	@CacheLookup
	WebElement ItemLink;
	
	@FindBy(xpath="//label[contains(text(),'Item Name')]")
	WebElement itemName;
	
	@FindBy(xpath="//label[contains(text(),'Cost Price')]")
	WebElement costPrice;
	
	@FindBy(xpath="//label[contains(text(),'Sale Price')]")
	WebElement salePrice;
	
	@FindBy(xpath="//button[@id='create_item']")
	WebElement createItemBtn;
	
//Initializing the page Objects:
	public ItemsPage(){
	  PageFactory.initElements(driver,this);
	}
	public CreateItemsPage ClickOnCreateItemLabel(){
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
		return new CreateItemsPage();	
	}
}

