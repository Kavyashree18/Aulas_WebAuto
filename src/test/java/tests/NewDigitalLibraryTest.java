package tests;


import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.FeeMgmtPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.LoginPage;
import Pages.NewDigitalLibrary;
import Pages.SchedulePage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class NewDigitalLibraryTest extends TestBase
{


	
	LoginClass LC;
	HomePage1 HP;
	SchedulePage SP;
	UserManagementPage UM;
	FeeMgmtPage FP;
	NewDigitalLibrary Newdigitallibrary;
	
	public NewDigitalLibraryTest()
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
	   	Newdigitallibrary=HP.DigitalLibrary();
	   	
	}
//	@Test(priority=1)
//	public void DigitalText()
//	{
//		String text = Newdigitallibrary.validateDigitalLibraryText();
//		Assert.assertEquals(text, "Digital library");
//	}
//	@Test(priority=2)
//	public void InfoPerformence() throws InterruptedException
//	{
//		Newdigitallibrary.infoIcon();
//	}
//	@Test(priority=3)
//	public void EngagementsCLICK() throws InterruptedException
//	{
//		Newdigitallibrary.impDrpDwn();
//	}
//	@Test(priority=4)
//	public void UploadPublichButton() throws InterruptedException, AWTException
//	{
//		Newdigitallibrary.Upload(prop.getProperty("FILE"));
//	}
//	@Test(priority=5)
//	public void UploadCancelButton() throws InterruptedException, AWTException
//	{
//		Newdigitallibrary.UploadCancel(prop.getProperty("FILE"));
//	}
//	@Test(priority=6)
//	public void videoPublished() throws InterruptedException
//	{
//		Newdigitallibrary.VideoPublished(prop.getProperty("LINK"));
//	}
//	@Test(priority=7)
//	public void videocancel() throws InterruptedException
//	{
//		Newdigitallibrary.VideoCancel(prop.getProperty("LINK"));
//	}
//	@Test(priority=8)
//	public void QuestionBankPublished() throws InterruptedException, AWTException
//	{
//		Newdigitallibrary.QuestionbankPublished(prop.getProperty("FILE"));
//	}
//	@Test(priority=9)
//	public void QuestionBankCancel() throws InterruptedException, AWTException
//	{
//		Newdigitallibrary.QuestionbankCancel(prop.getProperty("FILE"));
//	}
//	@Test(priority=10)
//	public void ClassSelected()
//	{
//		Newdigitallibrary.selectingClass();
//	}
	@Test(priority=11)
	public void EditTest()
	{
		Newdigitallibrary.selectingClass();
		Newdigitallibrary.EditField();
	}
	
//	@AfterMethod
//		public static void takeScreenshotAtEndOfTest() throws IOException, InterruptedException{
//			// Take screenshot and store as a file format
//			File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//			String currentDir = System.getProperty("user.dir");
//			// now copy the screenshot to desired location using copyFile //method
//			FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
//		
//			//FileUtils.copyFile(src, ----->
//				//	new File("C:\\Users\\Bhargav\\git\\repository\\Aulas_Project\\screenshots" + fileName + "_"+".jpg"));
//			Thread.sleep(5000);
			//driver.quit();
	//	}
    	
    }
	
