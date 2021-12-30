package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class SchedulePage extends BaseTest 
{
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[4]")
	WebElement ClickOnSchedulle;
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
	WebElement TimeTable;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement create;
	
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input input-component'])[1]")
	WebElement Subject;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])/div[1]/div/div/div[1]")
	WebElement SelectSubject;

	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[2]")
	WebElement Class;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div/div/div/span")
	WebElement SelectClass;
	@FindBy(xpath="(//input[@class='ant-input ant-select-selection-search-input'])[4]")
	WebElement Teacher;
	@FindBy(xpath="((//div[@class='rc-virtual-list'])[3]/div/div/div/div/div/div/span)[1]")
	WebElement SelectTeacher;
	@FindBy(xpath="(//button[@class='ant-btn'])[7]")
	WebElement ModeOfClass;
	@FindBy(xpath="(//div[@class='ant-picker'])[3]")
	WebElement SelectDate;
	@FindBy(xpath="//div[@class='ant-picker-date-panel']/div[2]/table/tbody/tr[5]/td[4]")
	WebElement SelectStartDate;                                  
	@FindBy(xpath="(//div[@class='ant-picker-input'])[7]")
	WebElement StartTime;
	@FindBy(xpath="(//div[text()='05'])[1]")
	WebElement StartTimeHours;
	@FindBy(xpath="(//div[text()='00'])[2]")
	WebElement StartTimeMinutes;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")
	WebElement StartOK;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[8]")
	WebElement EndTime;
	@FindBy(xpath="(//div[text()='06'])[3]")
	WebElement SelectHrs;
	@FindBy(xpath="(//div[text()='00'])[4]")
	WebElement SelectMinutes;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")
	WebElement OK;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-default ant-btn-circle'])[9]")
	WebElement SelectMonday;
	@FindBy(xpath="(//div[@class='ant-picker'])[9]")
	WebElement LastDate;
	@FindBy(xpath="(//div[@class='ant-picker-date-panel'])[2]/div[2]/table/tbody/tr[5]/td[6]")
	WebElement SelectDate1;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement Save;
	////**********Timetable with class filter****************************//
	@FindBy(xpath="(//div[@class='ant-select-selector'])[4]")
	WebElement SelectClassDropDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder'])/div/div/div[1]")
	WebElement SelClass;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary']")
	WebElement Create;
	@FindBy(xpath="(//span[@class='anticon anticon-close ant-modal-close-icon'])[2]")
	WebElement CloseIcon;
	
	
	public SchedulePage()
	{
	PageFactory.initElements(driver, this);
	}
	
	
	public void AddDetails() throws InterruptedException
	{
		Thread.sleep(5000);
		ClickOnSchedulle.click();
		Thread.sleep(4000);
		TimeTable.click();
		Thread.sleep(4000);
		create.click();
		Thread.sleep(4000);
		Subject.sendKeys("Hindi");
		Thread.sleep(4000);
		SelectSubject.click();
		Thread.sleep(4000);
		Class.click();
		Thread.sleep(4000);
		SelectClass.click();
		Thread.sleep(4000);
		Teacher.click();
		Thread.sleep(4000);
		SelectTeacher.click();
		Thread.sleep(4000);
		ModeOfClass.click();
		Thread.sleep(4000);
		SelectDate.click();
		Thread.sleep(4000);
		SelectStartDate.click();
		Thread.sleep(4000);
		StartTime.click();
		Thread.sleep(4000);
		StartTimeHours.click();
		Thread.sleep(4000);
		StartTimeMinutes.click();
		Thread.sleep(4000);
		StartOK.click();
		Thread.sleep(4000);
		EndTime.click();
		Thread.sleep(4000);
		SelectHrs.click();
		Thread.sleep(4000);
		SelectMinutes.click();
		Thread.sleep(4000);
		OK.click();
		Thread.sleep(4000);
		SelectMonday.click();
		Thread.sleep(4000);
		LastDate.click();
		Thread.sleep(4000);
		SelectDate1.click();
		Thread.sleep(4000);
		Save.click();
		String ExtTest = "schedule created successfully";
		String elem = driver.findElement(By.xpath("//div[text()='schedule created successfully']")).getText();
		if(ExtTest.equalsIgnoreCase(elem))
		{
			System.out.println("The expected heading is same as actual heading --- " +elem);
		}
		else
		{
			System.out.println("The expected heading doesn't match the actual heading --- " +elem);
		}
	}
		
		public  void Filters() throws InterruptedException
		{
			Thread.sleep(5000);
			ClickOnSchedulle.click();
			Thread.sleep(4000);
			TimeTable.click();
			Thread.sleep(2000);
			SelectClassDropDwn.click();
			Thread.sleep(2000);
			SelClass.click();
			Thread.sleep(4000);
			Create.click();
			Thread.sleep(2000);
			CloseIcon.click();
			
		}
	
	
}




