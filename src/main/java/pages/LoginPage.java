package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Delivery.BaseClass.TestBase;

public class LoginPage extends TestBase{
	@FindBy(xpath="//input[@id='userId']")
	WebElement username;

	@FindBy(xpath="//input[@id='userPassword']")
	WebElement password;

	@FindBy(xpath="//button[@id='login_user']")
	WebElement loginBtn;
	
	//Initializing the page Objects:
		public LoginPage(){
		 PageFactory.initElements(driver,this);	
		}
   //Action:
		public String validateLoginPageTitle() throws InterruptedException{
		 return driver.getTitle();
		}
		public HomePage login(String eml,String pwd) throws InterruptedException{
		username.sendKeys(eml);
		password.sendKeys(pwd);
		//Thread.sleep(4000);
		loginBtn.click();
		try {
	            Thread.sleep(6000);
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	    }
		//Thread.sleep(8000);
		return new HomePage();
		}	
}
