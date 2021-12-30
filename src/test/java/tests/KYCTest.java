package tests;

import java.awt.AWTException;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.FeeManagementPage;
import Pages.HomePage;
import Pages.KYCPage;
import Pages.LoginPage;
import Pages.UserPage;
import Util.TestUTil;

public class KYCTest extends TestBase
{
	LoginPage loginpage;
	HomePage homePage;
	UserPage userpage;
	TestUtil testUtil;
	FeeManagementPage feemanagenmentpage;
	KYCPage kycPage;
	
	
	public KYCTest()
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
	   kycPage = new KYCPage();
	  feemanagenmentpage=new FeeManagementPage();
	   homePage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	  feemanagenmentpage=homePage.Feemanagement();
	}
//	@Test(priority=1)
//	public void KYCForm() throws InterruptedException
//	{
//		kycPage.validKYCForm(prop.getProperty("Details"),prop.getProperty("PayAmount"));
//	}
//	@Test(priority=2)
//	public void KYCSubmit() throws InterruptedException, AWTException
//	{
//		kycPage.validKYCForm(prop.getProperty("Details"),prop.getProperty("PayAmount"));
//		kycPage.validKYCSubmit(prop.getProperty("InstituteWebsite"),prop.getProperty("CINNumber"),prop.getProperty("SigPANNumber"),prop.getProperty("OwnerName"),
//				prop.getProperty("GSTNumber"),prop.getProperty("Beneficiaryname"),prop.getProperty("IFSCCode"),prop.getProperty("AccNumber"),prop.getProperty("VerifyAccNumber"),prop.getProperty("UploadCanCheque"),
//				prop.getProperty("FrontEndPhoto"),prop.getProperty("BackEndPhoto"),prop.getProperty("BusinessProof"),prop.getProperty("BusinessPanProof"));
//	}
//	@Test(priority=3)
//	public void ViewForm() throws InterruptedException, AWTException
//	{
//		kycPage.ValidviewForm(prop.getProperty("UploadCanCheque"));
//		
//	}
//	@Test(priority=4)
//	public void Proprietorship() throws InterruptedException, AWTException
//	{
//		kycPage.ValidProprietorship(prop.getProperty("ADDARNO"),prop.getProperty("InstituteWebsite"),prop.getProperty("FrontEndPhoto"),prop.getProperty("CertificateBusiness"));
//	}
	@Test(priority=5)
	public void Parternship() throws InterruptedException, AWTException
	{
		kycPage.ValidParternship(prop.getProperty("ADDARNO"),prop.getProperty("InstituteWebsite"),prop.getProperty("FrontEndPhoto"),prop.getProperty("CertificateBusiness"));
	}
//	@Test(priority=6)
//	public void LLB() throws InterruptedException
//	{
//		kycPage.validLLB();
//	}
//	@Test(priority=7)
//	public void Trust() throws InterruptedException
//	{
//		kycPage.validTrust();
//	}
//	@Test(priority=8)
//	public void Society() throws InterruptedException
//	{
//		kycPage.validSociety();
//	}
//	@Test(priority=9)
//	public void NotRegister() throws InterruptedException
//	{
//		kycPage.validNotRegister();
//	}
	
}


