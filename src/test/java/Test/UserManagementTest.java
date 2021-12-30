package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.RegistrationPage;
import Pages.SchedulePage;
import Pages.UserManagementPage;


public class UserManagementTest extends BaseTest
{

	LoginClass LC;
	HomePage1 HP;
//	TestUtil testUtil;
	RegistrationPage RP;
	SchedulePage SP;
	UserManagementPage UM;
	
	
	public UserManagementTest()
	{
	super();
	}

	
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	initilization();
	LC = new LoginClass();
//	HP= new HomePage();
	RP = new RegistrationPage();
	SP = new SchedulePage();
	UM = new UserManagementPage();
	HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
//	RP = HomePage.User()
	}
	

	
/*
@AfterMethod
public static void takeScreenshotAtEndOfTest() throws IOException, InterruptedException
{
// Take screenshot and store as a file format
File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
String currentDir = System.getProperty("user.dir");
// now copy the screenshot to desired location using copyFile //method
FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));



//FileUtils.copyFile(src, ----->
// new File("C:\\Users\\Bhargav\\git\\repository\\Aulas_Project\\screenshots" + fileName + "_"+".jpg"));
Thread.sleep(5000);
driver.quit();

}

	
	@AfterMethod
	public void teardown()
	{
		driver.quit();
	}
	*/

	@Test(priority=1)
	public void UserRegistrartionTeacher() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.UserMgmt();
	}
	@Test(priority=2)
	public void UserRegistrartionStudent() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.StudentCreation();
	}
	@Test(priority=3)
	public void UserRegistrartionDataOperator() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.DataOperatorCreation();
	}
	@Test(priority=4)
	public void UserRegistrartionOperation() throws InterruptedException
	{
		Thread.sleep(2000);
		UM.Operation();	
	}

}

