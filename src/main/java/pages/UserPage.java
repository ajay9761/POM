package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Delivery.BaseClass.TestBase;

public class UserPage extends TestBase{

	@FindBy(xpath="//a[contains(text(),'Create User')]")
	 @CacheLookup
	WebElement UserLink;
	
	@FindBy(xpath=".//button[@class='c-btn c-btn--success u-ml-small crus']")
     @CacheLookup
	WebElement CreateUserlinkLabel;
	
//Initializing the page Objects:
	public UserPage(){
		  PageFactory.initElements(driver,this);
		}
	public String verifyUserPageTitle() throws InterruptedException{
		Thread.sleep(1000);
	 return driver.getTitle();
	}
	public CreateUserPage ClickOnUserlinkLabel() throws InterruptedException{
		Thread.sleep(3000);
		return new CreateUserPage ();	
			}		
}
