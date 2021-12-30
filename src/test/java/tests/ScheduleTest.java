package tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.ClassroomPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SchedulePage;
import Pages.SchedulePage1;
import Pages.UserPage;
import Util.TestUtil;

public class ScheduleTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUtil testUtil;
	ClassroomPage classroompage;
	SchedulePage1 schedulepage;
	
	public ScheduleTest()
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
	   	schedulepage=homePage.schedule();
	}
	@Test(priority=1)
	public void ClassroomText()
	{
		String text = schedulepage.validateClassroomtext();
		Assert.assertEquals(text, "Time Table");
	}
	@Test(priority=2)
	public void SearchName() throws InterruptedException
	{
		schedulepage.ValidateSearchname(prop.getProperty("SearchnameField"));
	}
	@Test(priority=3)
	public void AllClassesdropdown() throws InterruptedException
	{
		schedulepage.validateClassesDrodpdown();
		
	}
	@Test(priority=4)
	public void AddSchedule() throws InterruptedException
	{
		schedulepage.validateAddSchedule();
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
}
