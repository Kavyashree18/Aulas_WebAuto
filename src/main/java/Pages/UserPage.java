package Pages;

import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class UserPage extends BaseTest 
{
	@FindBy(xpath="//ul[contains(@class,'ant-menu')]/li[1]")
	WebElement UserManagement;
/*	@FindBy(xpath="//span[text()='CHANGE SETTINGS']")
	WebElement CHANGESETTINGS;
	@FindBy(xpath="(//span[@class='ant-select-selection-item'])[2]")
	WebElement dropdown;
	@FindBy(xpath="//div[text()='Auto approval']")
	WebElement AutoApproval;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement xicon;
*/	@FindBy(xpath="//h3[text()='VIEW ALL']")
	WebElement ViewAll;
	@FindBy(xpath="//div[@class='ant-tabs-nav-list']/div[2]")
	WebElement Rejected;
	@FindBy(xpath="//div[@class='ant-tabs-nav-list']/div[1]")
	WebElement Pending;
	@FindBy(xpath="//div[@class='ant-select-selector']")
	WebElement SearchInUsers;
//	@FindBy(xpath="//span[@class='ant-select-arrow']")
//	WebElement dropdwn;
//	@FindBy(xpath="//div[@class='ant-select-selector']")
//	WebElement Close;

	

	
	public UserPage()
	{
	PageFactory.initElements(driver, this);
	}
	
	public void ChangeSettings() throws InterruptedException
	{
		Thread.sleep(4000);
		UserManagement.click();
		Thread.sleep(2000);
/*		CHANGESETTINGS.click();
		Thread.sleep(1000);
		dropdown.click();
		Thread.sleep(1000);
		AutoApproval.click();
		Thread.sleep(2000);
		xicon.click();
*/		Thread.sleep(4000);
		ViewAll.click();
		Thread.sleep(2000);
		Rejected.click();
		Thread.sleep(2000);
		SearchInUsers.click();
		Thread.sleep(2000);
//		dropdwn.click();
//		Thread.sleep(4000);
		List<WebElement>tabs=driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));


//		List<WebElement>tabs=driver.findElements(By.xpath("//div[@class='rc-virtual-list-holder-inner']/div"));
		int size = tabs.size();
		
		System.out.println(size);
		for(int i=1;i<size;i++)
		{
			Thread.sleep(8000);
			tabs.get(i).click();
			Thread.sleep(8000);
			
		}
		SearchInUsers.click();
	}
}





















