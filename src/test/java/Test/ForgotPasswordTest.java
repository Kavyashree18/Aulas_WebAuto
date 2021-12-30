package Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.ForgotPassword;
import Pages.LoginClass;

public class ForgotPasswordTest extends BaseTest {
	
	LoginClass LC;
	ForgotPassword FP;
	public ForgotPasswordTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		LC = new LoginClass();
		FP = new ForgotPassword();
	}
	
	@Test
	public void emailTest() throws InterruptedException
	{
		LC.ForgotPassword();
		FP.Login(prop.getProperty("username"));
	}
	
	@Test
	public void GoBack() throws InterruptedException
	{
		LC.ForgotPassword();
		FP.Goback();
	}
	
	
		
		

}
