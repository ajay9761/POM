package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Delivery.BaseClass.TestBase;
import pages.UserPage;
import pages.CreateUserPage;
import pages.HomePage;
import pages.LoginPage;

public class UserTestCases extends TestBase{
	LoginPage loginPage;
	HomePage homepage;
	UserPage userPage;
	CreateUserPage createuserPage;
	
	public UserTestCases(){
		super();
	}
	//Test cases should be seperated & Independent with each other
	 @BeforeMethod
	  public void setUp() throws InterruptedException{
		initialization();
	  loginPage	= new LoginPage();
	  userPage = new UserPage();
	  createuserPage=new CreateUserPage();
	  homepage=loginPage.login((String) prop.getProperty("username"),prop.getProperty("password"));
	  userPage=homepage.ClickOnUserLink();
	  createuserPage= userPage.ClickOnUserlinkLabel(); 
	  /*loginPage	= new LoginPage();
	  itemsPage=new ItemsPage();
	  createitemsPage=new CreateItemsPage();
	  homepage=loginPage.login((String) prop.getProperty("username"),prop.getProperty("password"));
	  itemsPage=homepage.ClickOnItemsPageLink();
	  createitemsPage=itemsPage.ClickOnCreateItemLabel();*/
	}
	 @Test(priority=1,enabled=false)
	 public void verifyUserPageTitleTest() throws InterruptedException{
		String UserPageTitle=  userPage.verifyUserPageTitle();
		Assert.assertEquals(UserPageTitle,"Delivery Management System","Home Page title not matched");
	 }
	 @Test(priority=2,enabled=true)
	 public void verifyUserPage() throws InterruptedException{
		 //userPage= homepage.ClickOnUserLink();
		 homepage.ClickOnUserLink();
		 userPage.ClickOnUserlinkLabel();
		 System.out.println("Click NewUserLink Sucessfully");
	 }
	 @AfterMethod
	 public void tearDown(){
	 driver.quit();
  }
}
