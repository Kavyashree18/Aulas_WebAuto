package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.FeeMgmtPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.SchedulePage;
import Pages.UserManagementPage;

public class FeeMgmtTest extends BaseTest 
{

	LoginClass LC;
	HomePage1 HP;
	SchedulePage SP;
	UserManagementPage UM;
	FeeMgmtPage FP;
	
	public FeeMgmtTest()
	{
	super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
	initilization();

	LC = new LoginClass();
	HP = new HomePage1();
	FP = new FeeMgmtPage();
    HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));

	}
	
	@Test(priority=1)
	 public void validatelogo() throws InterruptedException
	 {
		String expText = "Fee Management";
		 String text = FP.Logo();
		 if(expText.equalsIgnoreCase(text))
		 System.out.println("The Expected Test is---"+ expText);
		 else
		 System.out.println("This is not Expected Test---"+ expText);
	 }
	
	
	 @Test(priority=2)
	 public void FeeGenerateRequest() throws InterruptedException
	 {
		 Thread.sleep(4000);
		 FP.FeeGenerateRequest();
	 }

	 @Test(priority=3)
	 public void validateViewDetailLinkGenerater() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 FP.ViewDetailLinkGenerater();
	 }

	 @Test(priority=4)
	 public void viewAllTransactions() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 FP.viewAllTransactions();
	 }
	
	
 @Test(priority=5)
	 public void viewAllStudents() throws InterruptedException
	 {
		 Thread.sleep(2000);
		 FP.viewAllStudents();
	 }
	
	
}
