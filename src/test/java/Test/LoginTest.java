package Test;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;

public class LoginTest extends BaseTest
{
	LoginClass LC;
	HomePage1 HP;
	public LoginTest()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		LC = new LoginClass();
	}

	@Test
	public void LogoTest()
	{
		boolean flag = LC.aulasLogo();
		Assert.assertTrue(flag);
	}
	
	
	@Test(groups= {"SanityTesting"})
	public void validatePrivacyPolicy() throws InterruptedException
	{
		LC.Privacypolicy();
	}

	@Test(groups= {"regression"})
	public void validateTermsAndConditions() throws InterruptedException
	{
		LC.TermsAndConditions();
	}
	
	@Test(groups= {"regression"})
	public void validateLoginTest() throws InterruptedException
	{
		LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	


	
	@Test(priority= 4)
	public void validateForgotPassword() throws InterruptedException
	{
		LC.ForgotPassword();
	}
	
	@Test(priority= 5)
	public void ValidateAulasCareLink() throws InterruptedException
	{
		LC.AulasCareLink();
	}
	

	@Test(priority= 6)
	public void ValidateRegisterClick() throws InterruptedException
	{
		LC.Register();
	}
	
	@Test(priority= 7)
	public void ValidateMobile() throws InterruptedException
	{
		LC.MobileRegister();
	}
	/*
	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	*/
}

