package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Delivery.BaseClass.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTestCases extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	public LoginTestCases(){
		super();
	}
	
	 @BeforeMethod
	  public void setUp(){
		initialization();
	  loginPage	= new LoginPage();
	}
	 @Test(priority=1)
	 public void loginPageTitleTest() throws InterruptedException{
		String title = loginPage.validateLoginPageTitle();
		//Thread.sleep(8000);
		Assert.assertEquals(title, "Log in | Delievery Management");
	 }
	 @Test(priority=2)
	 public void loginTest() throws InterruptedException{
	    homepage =loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	 }
	 
	 @AfterMethod
	 public void tearDown(){
	 driver.quit();
  }
  
}
