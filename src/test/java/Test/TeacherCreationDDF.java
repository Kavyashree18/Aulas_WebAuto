package Test;




import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Aulas_Base.BaseTest;
import Pages.HomePage1;
import Pages.LoginClass;
//import Pages.RegistrationPage;
import Pages.SchedulePage;
import Pages.UserManagementPage;
import Util.TestUtil;

public class TeacherCreationDDF extends BaseTest
{

	LoginClass LC;
	HomePage1 HP;

	@BeforeMethod
	public void setup() throws InterruptedException
	{
	initilization();
	LC = new LoginClass();
	HP = new HomePage1();
	HP = LC.newLogin(prop.getProperty("username"),prop.getProperty("password"));
	}
	
	@Test(dataProvider="TeacherData")
	public void createNewTeacher(String Name,String Phone,String Email) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='ant-menu-item-group-list'])[1]/li[1]")).click();
		Thread.sleep(2000);                  //Click on UserManagement
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(2000);                  //Click on +AddUser
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[2]")).click();
		Thread.sleep(2000);   				//Click on Teacher
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys(Name);
		Thread.sleep(2000);					//Name
		driver.findElement(By.xpath("//input[@class='PhoneInputInput']")).sendKeys(Phone);
		Thread.sleep(2000);					//Phone Number
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(Email);
		Thread.sleep(2000);					//Email
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[1]")).click();
		Thread.sleep(2000);					//Check box(Admin)
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[3]")).click();
		Thread.sleep(2000);					//Add Button	
	}
	
	@Test(dataProvider="StudentData")
	public void createNewStudent(String Name,String Phone,String Email) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='ant-menu-item-group-list'])[1]/li[1]")).click();
		Thread.sleep(2000);                  //Click on UserManagement
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(2000);					//Click on +AddUser
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[1]")).click();
		Thread.sleep(2000);					//Click on Student
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys(Name);
		Thread.sleep(2000);					//Name
		driver.findElement(By.xpath("//input[@class='PhoneInputInput']")).sendKeys(Phone);
		Thread.sleep(2000);					//Phone Number
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(Email);
		Thread.sleep(2000);					//Email
		driver.findElement(By.xpath("(//div[@class='ant-select-selector'])[2]")).click();
		Thread.sleep(2000);					//Class
		driver.findElement(By.xpath("(//div[@class='ant-select-item ant-select-item-option'])[1]")).click();
		Thread.sleep(2000);					//select class(1st class)
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[3]")).click();
		Thread.sleep(2000);					//Add Button
	}	
	
	@Test(dataProvider="DataOperator")
	public void createNewDataOperator(String Name,String Phone,String Email) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='ant-menu-item-group-list'])[1]/li[1]")).click();
		Thread.sleep(2000);                  //Click on UserManagement
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(2000);					//Click on +AddUser
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[3]")).click();
		Thread.sleep(2000);					//Click on DataOperator
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys(Name);
		Thread.sleep(2000);					//Name
		driver.findElement(By.xpath("(//input[@class='PhoneInputInput'])[1]")).sendKeys(Phone);
		Thread.sleep(2000);					//Phone Number
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(Email);
		Thread.sleep(2000);					//Email
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		Thread.sleep(2000);					//planner
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[5]")).click();
		Thread.sleep(2000);					//Attendance marker
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[3]")).click();
		Thread.sleep(2000);					//Add Button
	}
	
	@Test(dataProvider="Operation")
	public void createNewOperation(String Name,String Phone,String Email) throws InterruptedException
	{
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//ul[@class='ant-menu-item-group-list'])[1]/li[1]")).click();
		Thread.sleep(2000);                  //Click on UserManagement
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[1]")).click();
		Thread.sleep(2000);					//Click on +AddUser
		driver.findElement(By.xpath("(//span[@class='anticon anticon-right'])[4]")).click();
		Thread.sleep(2000);					//Click on Operation
		driver.findElement(By.xpath("(//input[@class='ant-input'])[1]")).sendKeys(Name);
		Thread.sleep(2000);					//Name
		driver.findElement(By.xpath("//input[@class='PhoneInputInput']")).sendKeys(Phone);
		Thread.sleep(2000);					//Phone Number
		driver.findElement(By.xpath("(//input[@class='ant-input'])[2]")).sendKeys(Email);
		Thread.sleep(2000);					//Email
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[2]")).click();
		Thread.sleep(2000);					//planner
		driver.findElement(By.xpath("(//input[@class='ant-checkbox-input'])[5]")).click();
		Thread.sleep(2000);					//Attendance marker
		driver.findElement(By.xpath("(//button[@class='ant-btn ant-btn-primary'])[3]")).click();
		Thread.sleep(2000);					//Add Button
	}
	
	@DataProvider(name = "TeacherData")
	public Object[][] getData()
	{
		Object[][] data3 = new Object[2][3];
		data3[0][0] = "Teacher1";
		data3[0][1] = "7535555568";
		data3[0][2] = "teacher1@mailinator.com";
		
	
		data3[1][0] = "Teacher2";
		data3[1][1] = "7896444488";
		data3[1][2] = "teacher2@mailinator.com";
		return data3;
	}
	
	@DataProvider(name = "StudentData")
	public Object[][] getdata1()
	{
		Object[][] data2 = new Object[2][3];
		data2[0][0] = "Student1";
		data2[0][1] = "5371595468";
		data2[0][2] = "student1@mailinator.com";
		
	
		data2[1][0] = "Student2";
		data2[1][1] = "7896454488";
		data2[1][2] = "student2@mailinator.com";
		return data2;
	}
	
	@DataProvider(name = "DataOperator")
	public Object[][] getdata()
	{
		Object[][] data1 = new Object[2][3];
		data1[0][0] = "DataOperator1";
		data1[0][1] = "3371595468";
		data1[0][2] = "dataoperator1@mailinator.com";
		
	
		data1[1][0] = "DataOperator2";
		data1[1][1] = "8896454488";
		data1[1][2] = "dataoperator2@mailinator.com";
		return data1;
	}
	
	@DataProvider(name = "Operation")
	public Object[][] getData3()
	{
		Object[][] data = new Object[2][3];
		data[0][0] = "Operation1";
		data[0][1] = "3371595466";
		data[0][2] = "operation1@mailinator.com";
		
	
		data[1][0] = "Operation2";
		data[1][1] = "8896454588";
		data[1][2] = "operation2@mailinator.com";
		return data;
	}
	
}
