package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Delivery.BaseClass.TestBase;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//a[contains(text(),'Create Item')]")
	@CacheLookup//Improve performance of script
	WebElement ItemsPageLink;
	
	//@FindBy(xpath=".//*[@id='main-content']/div[1]/div/button")
    //WebElement NewItemLink;
	
	@FindBy(xpath="//a[contains(text(),'Create User')]")
	WebElement UserLink;
	
	@FindBy(xpath="//a[contains(text(),'Create Request')]")
	WebElement CreateRequestLink;

	@FindBy(xpath="//a[contains(text(),'Create Order')]")
	WebElement CreateOrdersLink;
	
	@FindBy(xpath="//a[contains(text(),'View/Update Request/Order')]")
	WebElement ViewUpdateRequestOrderLink;
	
	@FindBy(xpath="//a[contains(text(),'View/Update Old Request/Order')]")
	WebElement ViewUpdateOldRequestOrderLink;
	
	@FindBy(xpath="//a[contains(text(),'View/Update Delivery')]")
	WebElement ViewUpdateDeliveryLink;
	
	
	
	//Initializing the page Objects:
		public HomePage(){
		 PageFactory.initElements(driver,this);	
		}
		public String verifyHomePageTitle() throws InterruptedException{
			//Thread.sleep(3000);
		 return driver.getTitle();
		}
		public ItemsPage ClickOnItemsPageLink() throws InterruptedException{
			ItemsPageLink.click();
			//Thread.sleep(3000);
			return new ItemsPage();
		}	
		public UserPage ClickOnUserLink() throws InterruptedException {
			UserLink.click();
			//Thread.sleep(3000);
			return new UserPage();
		}
		public CreateRequestPage ClickOnCreateRequestLink() throws InterruptedException {
			CreateRequestLink.click();
			//Thread.sleep(3000);
			return new CreateRequestPage ();
		}
		public CreateOrderPage ClickOnCreateOrderLink() throws InterruptedException{
			CreateOrdersLink.click();
			//Thread.sleep(3000);
			return new CreateOrderPage();	
		}
		public ViewUpdateRequestOrderPage ClickOnUpdateRequestOrderLink() throws InterruptedException{
			ViewUpdateRequestOrderLink.click();
			//Thread.sleep(3000);
			return new ViewUpdateRequestOrderPage();
		}
		public ViewUpdateOldRequestOrderPage ClickOnViewUpdateoldRequestOrderLink() throws InterruptedException{
			ViewUpdateOldRequestOrderLink.click();
			//Thread.sleep(3000);
			return new ViewUpdateOldRequestOrderPage();
		}
		public ViewUpdateDeliveryPage ClickOnViewUpdateDeliveryLink() throws InterruptedException{
			ViewUpdateDeliveryLink.click();
			//Thread.sleep(3000);
			return new ViewUpdateDeliveryPage();
}	
}



