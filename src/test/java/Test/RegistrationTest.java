package Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.RegistrationPage;
//import Pages.UserRegistration;
import Util.TestUtil;


public class RegistrationTest extends BaseTest {
	
	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	RegistrationPage RP;
	

	public RegistrationTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		LC = new LoginClass();
		HP = new HomePage1();
		//UR = new UserRegistration();
		RP = new RegistrationPage();
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
//		RP = HP.Users();
	}

	
	@Test(priority=1)
	public void AddDetails() throws InterruptedException
	{
		
		RP.AddDetails();
	}
	
	

	@Test(priority=2)
	public void Cancel() throws InterruptedException
	{
		
		RP.Cancel();
	}
	
	/*
	@Test(priority=3)
	public void DataOperator() throws InterruptedException
	{
		RP.DataOperatorRegistration();
	}
	*/

}
