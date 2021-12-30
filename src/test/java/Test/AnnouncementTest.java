package Test;



import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.AnnouncementPage;
import Pages.HomePage1;
import Pages.LoginClass;

import Pages.TestPages;
import Pages.UserManagementPage;


public class AnnouncementTest extends BaseTest
{
	LoginClass LC;
	HomePage1 HP;
	TestPages TP;
	UserManagementPage UM;
	AnnouncementPage announcementpage;
	
	public AnnouncementTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setUp() throws InterruptedException   
	{
			initilization();
		 	LC = new LoginClass();
			HP = new HomePage1();
			announcementpage = new AnnouncementPage();
//			HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
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
//			ExtendHtmlReports htmlReporters= new ExtendHtmlReports("extendReport.html");
//			ExtendReports extend new Extendreports();
//			extend.attachReport(htmlReporters);
			
			
			
	}
	@Test(priority=1)
	public void AnnouncementText() throws InterruptedException
	{
		String expText = "Announcements";
		String text = announcementpage.validateAnnounveText();
		if(expText.equalsIgnoreCase(text))
			System.out.println("The Excepted Test is ----" + expText);
		else
			System.out.println("This is not Excepted Test ----" + expText);
		//String text = announcementpage.validateAnnounveText();
		//Assert.assertEquals(text, "Announcements");
	}

	@Test(priority=2)
	public void ClickAnyoneAnnouncement() throws InterruptedException
	{
		Thread.sleep(8000);
		announcementpage.validateAnyOneAnnouncement();
	}
		
	@Test(priority=3)
	public void newAnnouncement() throws InterruptedException 
	{
		announcementpage.validateNewAnnouncementButton();	
	}
	@Test(priority=4)
	public void newAnnouncementClose() throws InterruptedException 
	{
		announcementpage.NewAnnouncementClose();	
	}

	@Test(priority=5)
	public void newHeader() throws InterruptedException
	{
		announcementpage.validateAnnouncementDescription();
	}
	
	@Test(priority=6)
	public void SaveToDraft() throws InterruptedException
	{
		Thread.sleep(4000);
		announcementpage.Draft();
	}
	
/*	@Test(priority=7)
	public void Draftfilter() throws InterruptedException
	{
		Thread.sleep(4000);
		announcementpage.DraftFilter();
	}
	@Test(priority=8)
	public void Announcefilter() throws InterruptedException
	{
		Thread.sleep(4000);
		announcementpage.AnnounceFilter();
	}
*/	
	@Test(priority=9)
	public void DraftOptions() throws InterruptedException
	{
		Thread.sleep(4000);
		announcementpage.DraftHeader();
	}

}