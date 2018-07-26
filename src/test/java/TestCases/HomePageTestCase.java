package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Delivery.BaseClass.TestBase;
import pages.CreateItemsPage;
import pages.CreateOrderPage;
import pages.CreateRequestPage;
import pages.UserPage;
import pages.HomePage;
import pages.ItemsPage;
import pages.LoginPage;
import pages.ViewUpdateDeliveryPage;
import pages.ViewUpdateOldRequestOrderPage;
import pages.ViewUpdateRequestOrderPage;

public class HomePageTestCase extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	//TestUtil testUtil;
	ItemsPage itemsPage;
	CreateItemsPage createitemsPage;
	UserPage userPage;
	CreateRequestPage createrequestPage;
	CreateOrderPage createorderPage;
	ViewUpdateRequestOrderPage viewupdaterequestorderPage;
	ViewUpdateOldRequestOrderPage viewupdateoldrequestorderPage;
	ViewUpdateDeliveryPage viewupdatedeliveryPage;
	
	public HomePageTestCase(){
		super();
	}
	//Test cases should be seperated & Independent with each other
	 @BeforeMethod
	  public void setUp() throws InterruptedException{
		initialization();
		//testUtil=new TestUtil();
	  loginPage	= new LoginPage();
	  itemsPage=new ItemsPage();
	  homepage=loginPage.login(prop.getProperty("username"),prop.getProperty("password"));
	}
	 @Test(priority=1,enabled=true)
	 public void verifyHomePageTitleTest() throws InterruptedException{
		String homePageTitle= homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"Delivery Management System","Home Page title not matched");
	 }
	 @Test(priority=2,enabled=true)
	 public void verifyCreateItemLinkTest() throws InterruptedException{
		 itemsPage= homepage.ClickOnItemsPageLink();	 
	 }
	 @Test(priority=3,enabled=true)
	 public void verifyCreateUserLinkTest() throws InterruptedException{
		 userPage= homepage.ClickOnUserLink();
	 }
	 @Test(priority=4,enabled=true)
	 public void verifyCreateRequestLinkTest() throws InterruptedException{
		 createrequestPage= homepage.ClickOnCreateRequestLink();
	 }
	 @Test(priority=5,enabled=true)
	 public void verifyOrderPageLinkTest() throws InterruptedException{
		 createorderPage= homepage.ClickOnCreateOrderLink();
	 }
	 @Test(priority=6,enabled=true)
	 public void verifyViewUpdateRequestOrderPageLinkTest() throws InterruptedException{
		 viewupdaterequestorderPage= homepage.ClickOnUpdateRequestOrderLink();
	 }
	 @Test(priority=7,enabled=true)
	 public void verifyViewUpdateOldRequestOrderPageLinkTest() throws InterruptedException{
		 viewupdateoldrequestorderPage= homepage.ClickOnViewUpdateoldRequestOrderLink();
	 }
	 @Test(priority=8,enabled=true)
	 public void verifyViewUpdateDeliveryPageLinkTest() throws InterruptedException{
		 viewupdatedeliveryPage= homepage.ClickOnViewUpdateDeliveryLink();
	 }
	 @AfterMethod
	 public void tearDown(){
	 driver.quit();
  }

}
