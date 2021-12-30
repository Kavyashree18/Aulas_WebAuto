package tests;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.HomePage;
import Pages.HomePage1;
import Pages.LoginPage;
import Pages.TestPage;
import Pages.TestPages;
import Pages.UserPage;

import Util.TestUtil;

public class TestTest extends TestBase
{
	LoginPage loginpage;
	HomePage1 homePage;
	UserPage userpage;
	TestUtil testUtil;
	TestPages Testpages;
	
	public TestTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 initilization();
	   	  testUtil = new TestUtil();
	   	  loginpage=new LoginPage();
	   	  homePage=new HomePage1();
	   	  userpage=new UserPage();
	   	  homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
//	   	Testpages=homePage
	}
	
//	@Test(priority=1)
//	public void TestMessage()
//	{
//		String text = Testpage.ValidateText();
//		Assert.assertEquals(text, "Test");
//	}
//	@Test(priority=2)
//	public void Filter() throws InterruptedException
//	{
//		Testpage.ValidFilter();
//	}
//	@Test(priority=3)
//	public void ClearAll() throws InterruptedException
//	{
//		Testpage.validClearAll();
//	}
//	@Test(priority=4)
//	public void Create() throws InterruptedException
//	{
//		Testpage.validCreate(prop.getProperty("AssignemntTitle"),prop.getProperty("IndexValue"),prop.getProperty("InstructionsValue"));
//	}
//	@Test(priority=5)
//	public void Details() throws InterruptedException
//	{
//		Testpage.ValidDetails(prop.getProperty("Q1"),prop.getProperty("OptionA"),prop.getProperty("OptionB"),prop.getProperty("OptionC"),prop.getProperty("OptionD"),prop.getProperty("Markss"),prop.getProperty("Q2"),prop.getProperty("Optiona"),prop.getProperty("Optionb"),prop.getProperty("Optionc"),prop.getProperty("Optiond"),prop.getProperty("NegaitiveMarks"));
//	}
//	@Test(priority=6)
//	public void Publish() throws InterruptedException
//	{
//		Testpage.ValidPublish();	
//	}
//	@Test(priority=7)
//	public void Delete() throws InterruptedException
//	{
//		Testpage.ValidDelete();
//	}
	@Test(priority=8)
	public void View() throws InterruptedException
	{
		Testpage.validViewQuestion();	
	}
//	@Test(priority=9)
//	public void Comment() throws InterruptedException
//	{
//		Testpage.validComment();
//	}
//	@Test(priority=10)
//	public void Deleted() throws InterruptedException
//	{
//		Testpage.validDeleted();
//	}
//	@Test(priority=11)
//	public void ActionsEdit() throws InterruptedException
//	{
//		Testpage.validTestEdit();
//	}
//	@Test(priority=12)
//	public void Clone() throws InterruptedException
//	{
//		Testpage.validClone(prop.getProperty("AssignemntTitle"),prop.getProperty("IndexValue"),prop.getProperty("InstructionsValue"));
//	}
//	@AfterMethod
//	public void tearDown()
//	{
//		driver.quit();
//	}
}
