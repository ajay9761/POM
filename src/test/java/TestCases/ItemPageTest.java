package TestCases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Delivery.BaseClass.TestBase;
import pages.CreateItemsPage;
import pages.HomePage;
import pages.ItemsPage;
import pages.LoginPage;

public class ItemPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homepage;
	ItemsPage itemsPage;
	CreateItemsPage createitemsPage;
	
	public ItemPageTest(){
		super();
	}
	//Test cases should be seperated & Independent with each other
	 @BeforeMethod
	  public void setUp() throws InterruptedException{
		initialization();
		//testUtil=new TestUtil();
	  loginPage	= new LoginPage();
	  itemsPage=new ItemsPage();
	  createitemsPage=new CreateItemsPage();
	  homepage=loginPage.login((String) prop.getProperty("username"),prop.getProperty("password"));
	  itemsPage=homepage.ClickOnItemsPageLink();
	  createitemsPage=itemsPage.ClickOnCreateItemLabel();
	}
	 @Test(priority=1,enabled=false)
	 public void verifyHomePageTitleTest() throws InterruptedException{
		String homePageTitle= homepage.verifyHomePageTitle();
		Assert.assertEquals(homePageTitle,"Delivery Management System","Home Page title not matched");
	 }
	 @Test(priority=2,enabled=true)
	 public void verifyItemsPage() throws InterruptedException{
		 homepage.ClickOnItemsPageLink();
		 itemsPage.ClickOnCreateItemLabel();
		 System.out.println("Create Item Sucessfully");
	 }
	 @Test(priority=3,enabled=false)
	 public void verifyCreateItemsPage() throws InterruptedException{
		 homepage.ClickOnItemsPageLink();
		 itemsPage.ClickOnCreateItemLabel();
		 System.out.println("Create New Item Sucessfully");
	 }
	 @AfterMethod
	 public void tearDown(){
	 driver.quit();
  }

}
