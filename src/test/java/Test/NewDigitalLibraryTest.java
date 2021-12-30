package Test;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.TestBase;
import Pages.FeeMgmtPage;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.NewDigitalLibrary;
import Pages.SchedulePage;
import Pages.UserManagementPage;

public class NewDigitalLibraryTest extends TestBase
{

	LoginClass LC;
	HomePage1 HP;
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
		Newdigitallibrary = new NewDigitalLibrary();
//	    HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//div[@class='ant-tabs-tab'])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='form-control']")).sendKeys("90728 63003");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send OTP']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='aulas-login__input-verify-otp']")).sendKeys("592726");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Verify OTP']")).click();
		Thread.sleep(4000);
	   	
	   	
	}
/*	@Test(priority=1)
	public void DigitalText() throws InterruptedException
	{
		String text = Newdigitallibrary.validateDigitalLibraryText();
		Assert.assertEquals(text, "Digital library");
	}
	
	@Test(priority=2)
	public void InfoPerformence() throws InterruptedException
	{
		Newdigitallibrary.infoIcon();
	}
	
	
	@Test(priority=3)
	public void EngagementsCLICK() throws InterruptedException
	{
		Newdigitallibrary.impDrpDwn();
	}
*/
	@Test(priority=4)
	public void UploadPublichButton() throws InterruptedException, AWTException
	{
		Newdigitallibrary.Upload(prop.getProperty("FILE"));
	}
	
/*	
	@Test(priority=5)
	public void UploadCancelButton() throws InterruptedException, AWTException
	{
		Newdigitallibrary.UploadCancel(prop.getProperty("FILE"));
	}
	@Test(priority=6)
	public void videoPublished() throws InterruptedException
	{
		Newdigitallibrary.VideoPublished(prop.getProperty("LINK"));
	}
	@Test(priority=7)
	public void videocancel() throws InterruptedException
	{
		Newdigitallibrary.VideoCancel(prop.getProperty("LINK"));
	}
	@Test(priority=8)
	public void QuestionBankPublished() throws InterruptedException, AWTException
	{
		Newdigitallibrary.QuestionbankPublished(prop.getProperty("FILE"));
	}
	@Test(priority=9)
	public void QuestionBankCancel() throws InterruptedException, AWTException
	{
		Newdigitallibrary.QuestionbankCancel(prop.getProperty("FILE"));
	}
	@Test(priority=10)
	public void ClassSelected()
	{
		Newdigitallibrary.selectingClass();
	}
	@Test(priority=11)
	public void EditTest()
	{
		Newdigitallibrary.selectingClass();
		Newdigitallibrary.EditField();
	}
*/	
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
	
