package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Delivery.BaseClass.TestBase;

public class CreateUserPage extends TestBase {
	@FindBy(xpath=".//*[@id='main-content']/div[1]/div/button")
	WebElement CreateUserlinkLabel;

	
	//Initializing the page Objects:
	public CreateUserPage(){
		  PageFactory.initElements(driver,this);
		}
		/*public CreateUserPage ClickOnUserLink(){
			try { Thread.sleep(3000);}
			catch (InterruptedException e) {}
			return new CreateUserPage();	
		}*/
		public UserPage ClickOnCreateUserlink(){
			//for(int i=1;i<4 ;i++) {
			CreateUserlinkLabel.click();
				   //itemName.sendKeys("Tech"+i);
				   //costPrice.sendKeys("1"+i);
				   //salePrice.sendKeys("2"+i);
				   //createItemBtn.click();
				   //System.out.println("i");
				try { Thread.sleep(3000);}
				catch (InterruptedException e) {} 
			
				return new UserPage();
		}
	}

