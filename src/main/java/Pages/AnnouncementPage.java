package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Aulas_Base.BaseTest;

public class AnnouncementPage extends BaseTest
{
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[3]/li[1]")
	WebElement Announcement;
	@FindBy(xpath="//div[contains(@class,'ant-page-header-compact')]")
	WebElement AnnouncementText;
	//**************validateAnyOneAnnouncement******************//
	@FindBy(xpath="//div[@class='ant-tabs-tab']")
	WebElement Announced;
	@FindBy(xpath="(//div[@class='sc-dJjYzT CmgHA cursor-pointer'])[1]")
	WebElement anyoneAnnouncement;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseButton;
		//*******************CreateNewAnnounced*********************************//
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateButton;
	@FindBy(xpath="(//input[@class='ant-input'])[2]")
	WebElement EnterTitle;
	@FindBy(xpath="//div[contains(@class,'container')]/div[1]")
	WebElement EnterDescription;
	@FindBy(xpath="(//div[contains(@class,'ant-select-selector')])[2]")
	WebElement SelectTarget;
	//Target
	@FindBy(xpath="(//div[contains(@class,'holder')])[3]/div[1]")
	WebElement Target;
	@FindBy(xpath="//span[text()='Save As Draft']")
	WebElement SaveAsDraftbtn;
	@FindBy(xpath="//span[text()='Announce Now']")
	WebElement AnnounceBtn;
	@FindBy(xpath="//span[@class='anticon anticon-close ant-modal-close-icon']")
	WebElement CloseAnnounceBtn;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[3]")
	WebElement AnnounceNowInDraft;

	//*******************Header/font Change*********************************//
	@FindBy(xpath="//span[contains(@class,'ql-header')]")
	WebElement Normalbtn;
	@FindBy(xpath="//span[contains(@class,'ql-picker-options')]/span[1]")
	WebElement Selheader;
	@FindBy(xpath="(//span[contains(@class,'ql-formats')]/button[2])[1]")
	WebElement SelItalic;
	@FindBy(xpath="(//span[contains(@class,'ql-formats')]/button[1])[2]")
	WebElement SelPoints;
	///////////////***********Draft************//////////
	@FindBy(xpath="//div[@class='ant-tabs-tab ant-tabs-tab-active']")
	WebElement Draft;
	@FindBy(xpath="(//div[@class='sc-bqiRlB dTUKFo cursor-pointer'])[1]")
	WebElement Draft1;
	@FindBy(xpath="//button[@class='ant-btn ant-btn-default']")
	WebElement SaveAsDraft;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary'])[2]")
	WebElement DeleteDraft;
	
	
	
	
	
	
	public AnnouncementPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateAnnounveText() throws InterruptedException
	{
		Thread.sleep(5000);
		Announcement.click();
		Thread.sleep(2000);
		return AnnouncementText.getText();
		
	}
	
	public void validateAnyOneAnnouncement() throws InterruptedException
	{
		Thread.sleep(2000);
		Announcement.click();
		Thread.sleep(5000);
		Announced.click();
		Thread.sleep(2000);
		anyoneAnnouncement.click();
		Thread.sleep(2000);
		CloseButton.click();
	}
	
	public void validateNewAnnouncementButton() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("Testing Department");
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		Target.click();
		//CloseAnnounceBtn.click();
		AnnounceBtn.click();
	}
	public void NewAnnouncementClose() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
	//	EnterTitle.sendKeys("Testing Department");
	//	Thread.sleep(2000);
	//	EnterDescription.sendKeys("This is a Automation Testing Department.");
	//	Thread.sleep(3000);
	//	SelectTarget.click();
	//	Thread.sleep(2000);
	//	Target.click();
		CloseAnnounceBtn.click();
		Thread.sleep(4000);
	}
	
	public void validateAnnouncementDescription() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("Testing Department");
		Thread.sleep(2000);
		Normalbtn.click();
		Thread.sleep(2000);
		Selheader.click();
		Thread.sleep(2000);
		SelItalic.click();
		Thread.sleep(2000);
		//SelPoints.click();
		EnterDescription.sendKeys("This is a Testing Department. \r\n"
				+ "This is a Testing.\r\n"
				+ "﻿This is a Aulas.");
		SelectTarget.click();
		Thread.sleep(2000);
		Target.click();
		Thread.sleep(2000);
		//CloseAnnounceBtn.click();
		AnnounceBtn .click();
		Thread.sleep(4000);
	}

	public void Draft() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(5000);
		CreateButton.click();
		Thread.sleep(4000);
		EnterTitle.sendKeys("Testing Department");
		Thread.sleep(2000);
		EnterDescription.sendKeys("This is a Automation Testing Department.");
		Thread.sleep(3000);
		SelectTarget.click();
		Thread.sleep(2000);
		Target.click();
		Thread.sleep(2000);
		SaveAsDraftbtn.click();
		Thread.sleep(8000);
		Draft.click();
		Thread.sleep(8000);
		Draft1.click();
		Thread.sleep(8000);
		AnnounceNowInDraft.click();
		Thread.sleep(4000);	
	}
	
/*	public void DraftFilter() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(8000);
		Draft.click();
		Thread.sleep(8000);
	
	
	
	
	
	
	
	
	
	}
	public void AnnounceFilter() throws InterruptedException
	{
	
	
	
	
	
	
	
	
	
	
	}
*/	
	public void DraftHeader() throws InterruptedException
	{
		Thread.sleep(8000);
		Announcement.click();
		Thread.sleep(8000);
		Draft.click();
		Thread.sleep(8000);
		Draft1.click();
		Thread.sleep(8000);
		SaveAsDraft.click();
		Thread.sleep(8000);
		Draft1.click();
		Thread.sleep(4000);
		DeleteDraft.click();
		Thread.sleep(4000);
	}
	
	
   
}
