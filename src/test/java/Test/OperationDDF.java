package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import Aulas_Base.BaseTest;

public class OperationDDF extends BaseTest
{
	@BeforeMethod
	public void setUp() throws InterruptedException
	{
		initilization();
	}
	@AfterMethod
	public static void takeScreenshotAtEndOfTest() throws IOException, InterruptedException{
	// Take screenshot and store as a file format
	File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	String currentDir = System.getProperty("user.dir");
	// now copy the screenshot to desired location using copyFile //method
	FileUtils.copyFile(src, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));

	//FileUtils.copyFile(src, ----->
	// new File("C:\\Users\\Bhargav\\git\\repository\\Aulas_Project\\screenshots" + fileName + "_"+".jpg"));
	Thread.sleep(2000);
	//driver.quit();
	}
	

	@Test(dataProvider="operationNewRegister")
	public void createnewlogin(String Name,String Email,String Phone,String HouseNO,String City,String State,String Zip,String EmgCon,String EmgPh) throws InterruptedException, AWTException
	//public void createnewLogin(String email,String password)
	{
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys("developer@vectorseducation.com");
	//driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys(email);
	driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys("classroom7@brigosha");
	//driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys(password);
	driver.findElement(By.xpath("//button[contains(@class,'primary')]/span[text()='Login']")).click();
	Thread.sleep(5000);
	// Actions ac = new Actions(driver);
	// WebElement link=driver.findElement(By.xpath("//ul[contains(@class,'ant-menu')]/li[1]"));
	// ac.moveToElement(link).click().build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//ul[contains(@class,'ant-menu')]/li[1]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//div[@class='ant-select-selector']")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='rc-virtual-list']/div/div)[1]/div/div[5]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@class='ant-input userInput']")).sendKeys(Name);
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@class,'rc-virtual')])[6]/div/div/div/div[1]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[3]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("(//div[contains(@class,'rc-virtual')])[12]/div/div/div[6]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("//div[@class='ant-picker']/div/input")).click();
	Thread.sleep(6000);
	driver.findElement(By.xpath("//div[@class='ant-picker-body']/table/tbody/tr[1]/td[5]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[2]")).sendKeys(Email);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='PhoneInputInput'])[1]")).sendKeys(Phone);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[3]")).sendKeys(HouseNO);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[4]")).sendKeys(City);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[5]")).sendKeys(State);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//div[@class='r-c-sb']/input)[6]")).sendKeys(Zip);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath("((//div[@class='r-c-sb'])/input)[11]")).sendKeys(EmgCon);
	Thread.sleep(4000);
	driver.findElement(By.xpath("(//input[@class='PhoneInputInput'])[2]")).sendKeys(EmgPh);
	Thread.sleep(4000);
	WebElement ele=driver.findElement(By.xpath("//span[@class='ant-upload']"));
	ele.click();
	Thread.sleep(4000);
	Robot r = new Robot();
	//Step no 36 is Picture Location Path
	StringSelection str = new StringSelection("C:\\Users\\Brigosha_Guest\\Pictures\\Saved Pictures\\1.png");
	Thread.sleep(4000);
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	r.keyPress(KeyEvent.VK_CONTROL);
	r.keyPress(KeyEvent.VK_V);
	r.keyRelease(KeyEvent.VK_CONTROL);
	r.keyRelease(KeyEvent.VK_V);
	r.keyPress(KeyEvent.VK_ENTER);
	r.keyPress(KeyEvent.VK_ENTER);
	driver.findElement(By.xpath("//button[@class='ant-btn mod-assign-btn']")).click();
	
	}
	

	@Test(priority=2)
	public void Cancel() throws InterruptedException, AWTException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys("developer@vectorseducation.com");
		driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys("classroom7@brigosha");
		driver.findElement(By.xpath("//button[contains(@class,'primary')]/span[text()='Login']")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//ul[contains(@class,'ant-menu')]/li[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[2]")).click();
			//upload Photo
		Thread.sleep(2000);
		WebElement ele=driver.findElement(By.xpath("//span[@class='ant-upload']"));
		ele.click();
		Thread.sleep(4000);
		Robot r = new Robot();
		//Step no 36 is Picture Location Path
		StringSelection str = new StringSelection("C:\\Users\\Brigosha_Guest\\Pictures\\Saved Pictures\\1.png");
		Thread.sleep(4000);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='ant-btn mod-cancel-btn']")).click();
	}


	@DataProvider(name = "operationNewRegister")
	public Object[][] getData()
	{
	Object[][] data = new Object[1][9];
	data[0][0] = "student1";
	data[0][1] = "classroom@mailinator.com";
	data[0][2] = "7896541888";
	data[0][3] = "25";
	data[0][4] = "Bangalore";
	data[0][5] = "Karnataka";
	data[0][6] = "522013";
	data[0][7] = "Tester";
	data[0][8] = "9652784152";

	// data[1][0] = "developers";
	// data[1][1] = "classroom@mailinator.com";
	// data[1][2] = "9874587412";
	// data[1][3] = "22/10/4";
	// data[1][4] = "Tenali";
	// data[1][5] = "AP";
	// data[1][6] = "522013";
	// data[1][7] = "Tester";
	// data[1][8] = "9652784152";

	return data;
	}
	

	
	
	
}
