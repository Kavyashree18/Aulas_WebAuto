package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class FeeMgmtPage extends BaseTest
{

///////////////////********GenerateRequest to class*******************/////////////////////
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[1]/li[2]")
	WebElement FeeManagement;
	@FindBy(xpath="(//span[@class='anticon anticon-arrow-right'])[9]")
	WebElement GenerateRequest;
	@FindBy(xpath="(//button[contains(@class,'ant-btn-round ant-btn-lg')])[2]")
	WebElement GenerateRequestForClass;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement SelectClass;
	@FindBy(xpath="//div[@class='rc-virtual-list-holder-inner']/div[2]")
	WebElement Class;
	@FindBy(xpath="(//div[@class='ant-col'])[11]/textarea")
	WebElement Details;
	@FindBy(xpath="(//div[@class='ant-row m-t-10'])[5]/div[1]")
	WebElement Date;
	@FindBy(xpath="//div[@class='ant-picker-body']/table/tbody/tr[5]/td[5]")
	WebElement DueDate;            // can be modified as per requirement
	@FindBy(xpath="//span[contains(@class,'ant-input-affix-wrapper-borderless')]")
	WebElement EnterAmount;
	@FindBy(xpath="//input[@class='ant-input ant-input-lg ant-input-borderless']")
	WebElement EnterAmt;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-lg'])[2]")
	WebElement Send;
	///////////////////********Logo Test*******************/////////////////////
	@FindBy(xpath="//h1[text()='Fee Management']")
	WebElement FeemanagementLogo;
    ////////////////**********ViewDetailLinkGenerate*****************/////////////////////
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[1]")
	WebElement requestGenerated;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[2]")
	WebElement paid;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[3]")
	WebElement pending;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[4]")
	WebElement Overdue;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[5]")
	WebElement settled;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[6]")
	WebElement refunded;
	@FindBy(xpath="(//div[contains(@class,'space')]/div[text()='View details'])[7]")
	WebElement cancelled;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-icon-only']")
	WebElement BackButton;
	////////////////**********ViewAllRecentTransaction*****************/////////////////////
	@FindBy(xpath="//div[@class='ant-row ant-row-middle cursor-pointer']")
	WebElement ViewAll;
	@FindBy(xpath="//span[@class='ant-dropdown-trigger ant-table-filter-trigger']")
	WebElement Filters;
	@FindBy(xpath="//span[@class='ant-dropdown-trigger ant-table-filter-trigger active ant-dropdown-open']")
	WebElement ActiveFilter;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-primary ant-btn-sm']")
	WebElement OK;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-icon-only']")
	WebElement Back;
	////////////////**********ViewAllStudents*****************/////////////////////
	@FindBy(xpath="(//span[@class='anticon anticon-arrow-right'])[10]")
	WebElement ViewAllStudents;
	@FindBy(xpath="(//label[@class='ant-checkbox-wrapper'])[1]")
	WebElement AllCheckBox;
	@FindBy(xpath="//button[@type='button']/span[text()='Generate Requests']")
	WebElement GenReqButton;
	@FindBy(xpath="(//div[@class='ant-col'])/textarea")
	WebElement EnterDiscription;
	@FindBy(xpath="(//div[@class='ant-col ant-col-xs-11'])[1]")
	WebElement SelectDate;
	@FindBy(xpath="//div[@class='ant-picker-body']/table/tbody/tr[5]/td[5]")
	WebElement SetDate;
	@FindBy(xpath="//input[@class='ant-input ant-input-lg ant-input-borderless']")
	WebElement EnterDueAmount;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-round ant-btn-lg'])")
	WebElement ClickSend;
	
	
	
			
			
			
	public FeeMgmtPage()
	{
	PageFactory.initElements(driver,this);
	}
	
	public  void FeeGenerateRequest() throws InterruptedException 
	{
		Thread.sleep(5000);
		FeeManagement.click();
		Thread.sleep(4000);
		GenerateRequest.click();
		Thread.sleep(2000);
		GenerateRequestForClass.click();
		Thread.sleep(2000);
		SelectClass.click();
		Thread.sleep(2000);
		Class.click();
		Thread.sleep(2000);
		Details.sendKeys("Please Make the fee payment on or before due date!");
		Thread.sleep(2000);
		Date.click();
		Thread.sleep(2000);
		DueDate.click();
		Thread.sleep(4000);
		EnterAmount.click();
		EnterAmt.sendKeys("45999");
		Thread.sleep(4000);
		Send.click();
	}

	public String Logo() throws InterruptedException
	{
		Thread.sleep(5000);
		FeeManagement.click();
		Thread.sleep(2000);
		return FeemanagementLogo.getText();
	}

/*	public void ViewDetailLinkGenerater() throws InterruptedException
	{
		Thread.sleep(2000);
		FeeManagement.click();
		Thread.sleep(4000);
		List<WebElement>tabs=driver.findElements(By.xpath("//div[@class='sc-eCImPb eHacZN']/div[4]"));
		int size = tabs.size();
		System.out.println(size);
		for(int i=0; i<size; i++)
		{
			tabs.get(i).click();
			Thread.sleep(8000);	
			BackButton.click();
		}
		Thread.sleep(4000);
	}
*/		
	public void ViewDetailLinkGenerater() throws InterruptedException
	{
		Thread.sleep(2000);
		FeeManagement.click();
		Thread.sleep(4000);
		requestGenerated.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		paid.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		pending.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		Overdue.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		settled.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		refunded.click();
		Thread.sleep(4000);
		BackButton.click();
		Thread.sleep(2000);
		cancelled.click();
		Thread.sleep(4000);
		BackButton.click();	
	}
	
	public void viewAllTransactions() throws InterruptedException
	{
		Thread.sleep(2000);
		FeeManagement.click();
		Thread.sleep(4000);
		ViewAll.click();
		Thread.sleep(4000);
		Filters.click();
		List<WebElement>checkBox=driver.findElements(By.xpath("//label[@class='ant-checkbox-wrapper']"));
		int size = checkBox.size();
		System.out.println(size);
		for(int i=3 ;i<size;i++)
		{
			Thread.sleep(1000);
			checkBox.get(i).click();
		}
		OK.click();
		Thread.sleep(2000);
		ActiveFilter.click();
		for(int i=0 ;i<size;i++)
		{
			Thread.sleep(2000);
			checkBox.get(i).click();
		}
		OK.click();
		Thread.sleep(2000);
		Back.click();
	}
	
	public void viewAllStudents() throws InterruptedException
	{
		Thread.sleep(2000);
		FeeManagement.click();
		Thread.sleep(5000);
		ViewAllStudents.click();
		Thread.sleep(2000);
		AllCheckBox.click();
		Thread.sleep(2000);
		GenReqButton.click();
		Thread.sleep(2000);
		EnterDiscription.sendKeys("Due!");
		Thread.sleep(2000);
		SelectDate.click();
		Thread.sleep(2000);
		SetDate.click();
		Thread.sleep(2000);
		EnterDueAmount.sendKeys("1");
		Thread.sleep(2000);
		ClickSend.click();	
	}
	

}
