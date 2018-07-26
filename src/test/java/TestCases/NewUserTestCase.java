package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Delivery.BaseClass.TestBase;
import pages.CreateUserPage;
import pages.HomePage;
import pages.LoginPage;
import pages.UserPage;

public class NewUserTestCase extends TestBase {
	LoginPage loginPage;
	HomePage homepage;
	UserPage userPage;
	CreateUserPage createuserPage;
	
	public NewUserTestCase(){
		super();
	}
	//Test cases should be seperated & Independent with each other
	 @BeforeMethod
	  public void setUp() throws InterruptedException{
		initialization();
	  loginPage	= new LoginPage();
	  homepage=loginPage.login((String) prop.getProperty("username"),prop.getProperty("password"));
	  userPage=homepage.ClickOnUserLink();
	  //createuserPage= createuserPage.ClickOnCreateUserlink(); 
	}
	 @Test(priority=1,enabled=false)
	 public void verifyUserPageTitleTest() throws InterruptedException{
		String UserPageTitle=  userPage.verifyUserPageTitle();
		Assert.assertEquals(UserPageTitle,"Delivery Management System","Home Page title not matched");
	 }
	 @Test(priority=2,enabled=false)
	 public void verifyUserPage() throws InterruptedException{
		 homepage.ClickOnUserLink();
		 //itemsPage.ClickOnCreateItemLabel();
		 System.out.println("CLick UserLink Sucessfully");
	 }
	 @Test(priority=3,enabled=true)
	 public void verifyCreateNewUserPage() throws InterruptedException{
		 homepage.ClickOnUserLink();
		// userPage.ClickOnCreateUserlinkLabel();
		 //createuserPage.ClickOnCreateUserlink();
		 }
	 
	 @AfterMethod
	 public void tearDown(){
	 driver.quit();
  }

}
