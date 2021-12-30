package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.TestPages;
import Pages.UserManagementPage;



public class TestTest extends BaseTest
{
	LoginClass LC;
	HomePage1 HP;
	UserManagementPage UM;
	TestPages TP;

	public TestTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		 initilization();
		 	LC = new LoginClass();
			HP = new HomePage1();
			UM = new UserManagementPage();
			TP = new TestPages();
			HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
//			TP = HP.Test();	
	}

	@Test(priority=1)
	public void Objective() throws InterruptedException
	{
		Thread.sleep(5000);
		TP.ValidObjTest();
	}
/*	@Test(priority=2)
	public void Subjective() throws InterruptedException
	{
		Thread.sleep(5000);
		TP.ValidSubjTest();
	}
*/	
//	@Test(priority=3)
//	public void ClearAll() throws InterruptedException
//	{
//		TestPages.validClearAll();
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
//	@Test(priority=8)
//	public void View() throws InterruptedException
//	{
//		TP.validQuestionSave();
//	}
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
