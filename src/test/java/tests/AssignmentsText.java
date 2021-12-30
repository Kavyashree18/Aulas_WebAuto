package tests;

import java.lang.reflect.InvocationTargetException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.AssignmentsPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUtil;

public class AssignmentsText extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUtil testUtil;
	AssignmentsPage Assignmentpage;
	
	public AssignmentsText()
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
	   	Assignmentpage=homePage.Assignment();
	}
	@Test(priority=1)
	public void AssignmentTest()
	{
		String text = Assignmentpage.validateText();
		Assert.assertEquals(text, "Assignments");
	}
	@Test(priority=2)
	public void FilterApplyTest() throws InterruptedException
	{
		Assignmentpage.validateFilterApply();
	}
	@Test(priority=3)
	public void FilterClearAllTest() throws InterruptedException
	{
		Assignmentpage.validateClearallFilter();
	}
	@Test(priority=4)
	public void CreateAssignment() throws InterruptedException
	{
		Assignmentpage.validateAssignmentCreate(prop.getProperty("Testtitle"),prop.getProperty("IndexValue"), prop.getProperty("InstructionsValue"));
	}
	@Test(priority=5)
	public void DetailPage() throws InterruptedException, InvocationTargetException
	{
		Assignmentpage.ValidDetails(prop.getProperty("EditorTextField"),prop.getProperty("Option1"),prop.getProperty("Option2"),prop.getProperty("Option3"),prop.getProperty("Option4"),prop.getProperty("Marks"));
	}
	@Test(priority=6)
	public void viewEditQuestion() throws InterruptedException
	{
		Assignmentpage.ValidViewQuestion(prop.getProperty("Marks"));
	}
	@Test(priority=7)
	public void viewComment() throws InterruptedException
	{
		Assignmentpage.ValidComment(prop.getProperty("Comment"));
	}
	@Test(priority=8)
	public void viewDelete() throws InterruptedException
	{
		
		Assignmentpage.ValidDelete();
	}
	@Test(priority=9)
	public void TestEdit() throws InterruptedException
	{
		Assignmentpage.ValidTestEdit(prop.getProperty("InstructionsValue"));	
	}
	@Test(priority=10)
	public void ViewClone() throws InterruptedException
	{
		Assignmentpage.ValidClone(prop.getProperty("IndexValue"),prop.getProperty("InstructionsValue"));
	}
	@Test(priority=11)
	public void Published()
	{
		Assignmentpage.ValidPublished();
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
