package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AutoKYC;


public class AutoKYCTest extends BaseTest
{
	AutoKYC autokyc;
	
	public AutoKYCTest()
	{
		super();
	}
	@BeforeMethod
    public void setUp() throws InterruptedException
    {
   initilization();
   autokyc=new AutoKYC();
    }
//	@Test(priority=1)
//	public void LoginTest()
//	{
//		autokyc.Validlogin(prop.getProperty("KYCUsername"), prop.getProperty("KYCPassword"));
//	}
//	@Test(priority=2)
//    public void KYCVerification() throws InterruptedException
//    {
//		autokyc.Validlogin(prop.getProperty("KYCUsername"), prop.getProperty("KYCPassword"));
//		autokyc.ValidKYCVerification();
//    }
//	@Test(priority=3)
//	public void Reject() throws InterruptedException
//	{
//		autokyc.Validlogin(prop.getProperty("KYCUsername"), prop.getProperty("KYCPassword"));
//		autokyc.validKYCReject(prop.getProperty("CancelledCheque"));
//	}
	@Test(priority=4)
	public void AddarReject() throws InterruptedException
	{
		autokyc.Validlogin(prop.getProperty("KYCUsername"), prop.getProperty("KYCPassword"));
		autokyc.RejectAddarCard(prop.getProperty("AddarFront"));
	}
}
