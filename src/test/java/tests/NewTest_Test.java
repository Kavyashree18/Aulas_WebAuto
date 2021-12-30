package tests;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.New_Test;

import Util.TestUtil;

public class NewTest_Test extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	TestUtil testUtil;
	New_Test newTest;
	
	public NewTest_Test()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
	   	  testUtil = new TestUtil();
	   	  loginpage=new LoginPage();
	   	  homePage=new HomePage();
	   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	   	newTest=homePage.Tests();
	}
	@Test
	public void clickCreateTestButton()
	{
		newTest.ValidCreateTest();
	}

}
