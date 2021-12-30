package Pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Aulas_Base.BaseTest;
public class UserManagementPage extends BaseTest
{

	@FindBy(xpath="//ul[contains(@class,'ant-menu')]/li[1]")
	WebElement UserManagement;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[1]")
	WebElement AddUser;
	//****************TeacherCreation************************//
	@FindBy(xpath="(//span[@class='anticon anticon-right'])[2]")
	WebElement Teacher;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement TeacherName;
	@FindBy(xpath="//input[@class='PhoneInputInput']")
	WebElement TeacherNumber;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement TeacherEmail;
	@FindBy(xpath="(//input[@class='ant-checkbox-input'])[2]")
	WebElement CheckPlanner;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement Add;
	//****************StudentCreation************************//
	@FindBy(xpath="(//span[@class='anticon anticon-right'])[1]")
	WebElement Student;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement StudentName;
	@FindBy(xpath="//input[@class='PhoneInputInput']")
	WebElement StudentNumber;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement StudentEmail;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement StudentClassClick;
	@FindBy(xpath="(//div[@class='ant-select-item ant-select-item-option'])[1]")
	WebElement SelectClass;
	//****************DataOperatorCreation************************//
	@FindBy(xpath="(//span[@class='anticon anticon-right'])[3]")
	WebElement DataOperator;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement DataOperatorName;
	@FindBy(xpath="(//input[@class='PhoneInputInput'])[1]")
	WebElement DataOperatorNumber;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement DataOperatorEmail;
	@FindBy(xpath="(//input[@class='ant-checkbox-input'])[2]")
	WebElement DataOperatorCheckPlanner;
	@FindBy(xpath="(//input[@class='ant-checkbox-input'])[5]")
	WebElement DataOperatorAttendance;
	//****************OperationCreation************************//
	@FindBy(xpath="(//span[@class='anticon anticon-right'])[4]")
	WebElement Operation;
	@FindBy(xpath="(//input[@class='ant-input'])[1]")
	WebElement OperationName;
	@FindBy(xpath="//input[@class='PhoneInputInput']")
	WebElement OperationNumber;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement OperationEmail;
	@FindBy(xpath="(//input[@class='ant-checkbox-input'])[2]")
	WebElement OperationPlanner;
	@FindBy(xpath="(//input[@class='ant-checkbox-input'])[5]")
	WebElement OperationAttendance;


	public UserManagementPage()
	{
	PageFactory.initElements(driver, this);
	}


	public void UserMgmt() throws InterruptedException
	{
		Thread.sleep(2000);
		UserManagement.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Teacher.click();
		Thread.sleep(2000);
		TeacherName.sendKeys("Teacher1");
		Thread.sleep(1000);
		TeacherNumber.sendKeys("1472897855");
		Thread.sleep(1000);
		TeacherEmail.sendKeys("teacher1@gmail.com");
		Thread.sleep(1000);
		CheckPlanner.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
	}
	
	public void StudentCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UserManagement.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Student.click();
		Thread.sleep(2000);
		StudentName.sendKeys("Student1");
		Thread.sleep(1000);
		StudentNumber.sendKeys("9876543210");
		Thread.sleep(1000);
		StudentEmail.sendKeys("student1@gmail.com");
		Thread.sleep(1000);
		StudentClassClick.click();
		Thread.sleep(2000);
		SelectClass.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
	}
	

	public void DataOperatorCreation() throws InterruptedException
	{
		Thread.sleep(2000);
		UserManagement.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		DataOperator.click();
		Thread.sleep(2000);
		DataOperatorName.sendKeys("DataOperator1");
		Thread.sleep(1000);
		DataOperatorNumber.sendKeys("1236589756");
		Thread.sleep(1000);
		DataOperatorEmail.sendKeys("dataoperator1@gmail.com");
		Thread.sleep(1000);
		DataOperatorCheckPlanner.click();
		Thread.sleep(2000);
		DataOperatorAttendance.click();
		Thread.sleep(2000);
		Add.click();
		Thread.sleep(2000);
	}
	
	public void Operation() throws InterruptedException
	{
		Thread.sleep(2000);
		UserManagement.click();
		Thread.sleep(2000);
		AddUser.click();
		Thread.sleep(2000);
		Operation.click();
		Thread.sleep(2000);
		OperationName.sendKeys("Operation1");
		Thread.sleep(1000);
		OperationNumber.sendKeys("5879456123");
		Thread.sleep(1000);
		OperationEmail.sendKeys("operation1@gmail");
		Thread.sleep(1000);
		OperationPlanner.click();
		Thread.sleep(2000);
		OperationAttendance.click();
		Thread.sleep(3000);
		Add.click();
		Thread.sleep(2000);	
	}
}
