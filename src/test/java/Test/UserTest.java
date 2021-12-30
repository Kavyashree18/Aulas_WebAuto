package Test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.RegistrationPage;
import Pages.SchedulePage;
import Pages.UserManagementPage;
import Pages.UserPage;

public class UserTest extends BaseTest
{

	LoginClass LC;
	HomePage1 HP;
	UserPage UP;
	RegistrationPage RP;
	SchedulePage SP;
	UserManagementPage UM;
	

	public UserTest()
	{
	super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
	initilization();
	LC = new LoginClass();
	RP = new RegistrationPage();
	SP = new SchedulePage();
	UM = new UserManagementPage();
	UP = new UserPage();
	HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void ChangeSettings() throws InterruptedException
	{
		UP.ChangeSettings();
		
	}
	
	
}
