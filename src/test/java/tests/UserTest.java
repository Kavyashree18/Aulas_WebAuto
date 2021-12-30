package tests;


import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;

import Util.TestUtil;

public class UserTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUtil testUtil;
	
	public UserTest()
	{
		super();
	}
	 @BeforeMethod
     public void setUp() throws InterruptedException
     {
   	  initilization();
   	  testUtil = new TestUtil();
   	  loginpage=new LoginPage();
   	  homePage=new HomePage();
   	  userpage=new UserPage();
   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
   	  userpage=homePage.User();
     }
	 @Test(priority=1)
	 	 public void validateSearchname() throws InterruptedException 
		 {
		 userpage.enter(prop.getProperty("searchname"));
		 }
	 
     @Test(priority=2)
	 public void validatexbutton() throws InterruptedException
	 {
		 userpage.crossbutton(prop.getProperty("sname"));
	 }
	 @Test(priority=3)
	 public void validateEditbutton()
	 {
		 userpage.EditScreenbutton();
		 
	 }
	 @Test(priority=4)
	 public void validateXicon()
	 {
		 userpage.Xiconbutton();
	 }
	 @Test(priority=5)
	 public void validateAddButton() throws InterruptedException
	 {
		 
		 userpage.Addbuttono();
	 }

	 
	 @AfterMethod
	 public void tearDown()
	 {
		 driver.quit();
	 }

}
