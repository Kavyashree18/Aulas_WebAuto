package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
import Pages.RegistrationPage;
import Pages.SchedulePage;
import Util.TestUtil;

public class ScheduleTest extends BaseTest 
{
	LoginClass LC;
	HomePage1 HP;
	TestUtil testUtil;
	SchedulePage SP;

	public ScheduleTest()
	{
		super();
	}
	
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initilization();
		LC = new LoginClass();
		HP = new HomePage1();
		SP = new SchedulePage();
		HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));


	}
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
	}
	
/*	@Test(priority=1)
	public void AddDetails() throws InterruptedException
	{
		
		SP.AddDetails();
	}
	
*/
	@Test(priority=2)
	public void Filters() throws InterruptedException
	{
		SP.Filters();
	}


}







