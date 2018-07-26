package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Delivery.BaseClass.TestBase;

public class CreateItemsPage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Create Item')]")
	@CacheLookup
	WebElement  CreateItemLabel;
	
	@FindBy(xpath=".//*[@id='main-content']/div[1]/div/button")
	//@CacheLookup
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
	public CreateItemsPage(){
	  PageFactory.initElements(driver,this);
	}
	public CreateItemsPage ClickOnCreateItemLabel(){
		try { Thread.sleep(3000);}
		catch (InterruptedException e) {}
		return new CreateItemsPage();	
	}
	public CreateItemsPage ClickOnItemLink(){
		for(int i=1;i<4 ;i++) {
			   ItemLink.click();
			   itemName.sendKeys("Tech"+i);
			   costPrice.sendKeys("1"+i);
			   salePrice.sendKeys("2"+i);
			   createItemBtn.click();
			   System.out.println("i");
			try { Thread.sleep(3000);}
			catch (InterruptedException e) {} 
		}
			return new CreateItemsPage();
	}
}
