package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Aulas_Base.BaseTest;


public class TestPages extends BaseTest
{
	Actions Ac;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[2]/li[2]")
	WebElement TestModule;
	@FindBy(xpath="//button[@class='ant-btn purpleBtnWrap radius-100']")
	WebElement CreateTest;
	///---------------------Test for class-------------------------//
	@FindBy(xpath="(//div[@class='text-right m-b-10'])[1]")
	WebElement SelectObjectiveType;
	@FindBy(xpath="(//button[@class='ant-btn purpleBtnWrap radius-100'])[2]")
	WebElement ClickOnNext;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[1]")
	WebElement SearchSubject;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])/div[1]/div/div/div[1]")
	WebElement SelectFiestSubject;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement ClassDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder-inner'])[2]/div[1]")
	WebElement SelClass;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[3]")
	WebElement Examiner;
	@FindBy(xpath="(//div[@class='rc-virtual-list-holder-inner'])[3]/div[1]")
	WebElement SelectExaminer;
	@FindBy(xpath="(//input[@class='ant-input createmodalbg'])")
	WebElement Title;
	@FindBy(xpath="((//button[@class='ant-btn purpleBtnWrap radius-100'])[2])")
	WebElement Next;
	//------------------------date and time------------------------------//
	@FindBy(xpath="(//div[@class='ant-picker createmodalbg'])[1]")
	WebElement TestDate;
	@FindBy(xpath="//div[@class='ant-picker-footer']")
	WebElement SelectToday;
	@FindBy(xpath="(//div[@class='flex-1 m-r-20'])[2]/div[2]")
	WebElement StartTestTime;
	@FindBy(xpath="(//div[text()='16'])[2]")
	WebElement SelHR;
	@FindBy(xpath="(//div[text()='00'])[2]")
	WebElement SelMin;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[1]")
	WebElement OkBtn;
	@FindBy(xpath="(//div[@class='flex-1'])[1]/div[2]")
	WebElement EndTime;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[3]/li[19]/div")
	WebElement SelEndHR;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[4]/li[1]/div")
	WebElement SelEndMin;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[2]")
	WebElement OkEndBtn;
	@FindBy(xpath="(//div[@class='m-t-20'])[2]/div[2]/div[1]/div[2]")
	WebElement ResultDate;
	@FindBy(xpath="(//div[@class='ant-picker-footer'])[4]")
	WebElement ResultDateAsToday;
	@FindBy(xpath="(//div[@class='flex-1'])[2]/div[2]")
	WebElement ResultTime;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[5]/li[21]/div")
	WebElement SelTimeHR;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[6]/li[1]/div")
	WebElement SelTimeMin;
	@FindBy(xpath="(//button[@class='ant-btn ant-btn-primary ant-btn-sm'])[3]")
	WebElement OKButton;
	@FindBy(xpath="(//div[@class='m-t-20'])[3]/textarea")
	WebElement Instructions;
	@FindBy(xpath="(//button[@class='ant-btn purpleBtnWrap radius-100'])[2]")
	WebElement Create;
	
	
	
	
	
	
	//**********************************************************//
	@FindBy(xpath="(//div[@class='text-right m-b-10'])[2]")
	WebElement SelectSubjectiveType;
	@FindBy(xpath="(//div[@class='ant-picker createmodalbg'])[1]")
	WebElement ObjDate;
	@FindBy(xpath="//td[@title='2021-12-25']")
	WebElement SubTestDate;
	@FindBy(xpath="(//div[@style='width: 100%;'])[19]")
	WebElement SubSelTime;
	@FindBy(xpath="(//div[@class='ant-picker-time-panel-cell-inner'])[2]")
	WebElement SubSelHr;
	@FindBy(xpath="(//li[@class='ant-picker-time-panel-cell'])[82]")
	WebElement SubSelMin;
	@FindBy(xpath="((//button[@type='button'])[12]")
	WebElement OkOkbtn;
	@FindBy(xpath="(//div[@class='ant-picker createmodalbg'])[3]")
	WebElement SubSelEndTime;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[1]/li[22]/div")
	WebElement SelHr;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[2]/li[32]/div")
	WebElement SelMinn;
	@FindBy(xpath="//textarea[@class='ant-input createmodalbg']")
	WebElement SubInstr;
//	@FindBy(xpath="//textarea[@placeholder='Add Instructions']")
//	WebElement SubSendInstr;
	@FindBy(xpath="(//button[@type='button'])[5]")
	WebElement SubCreate;	
	
	
	
	
	
	
	
	

     public TestPages()
     {
    	 PageFactory.initElements(driver, this);
     }

     public void ValidObjTest() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 TestModule.click();
    	 Thread.sleep(5000);
    	 CreateTest.click();
    	 Thread.sleep(2000);
    	 SelectObjectiveType.click();
    	 Thread.sleep(2000);
    	 ClickOnNext.click();
    	 Thread.sleep(4000);
    	 //---------------------//
    	 SearchSubject.click();
    	 Thread.sleep(3000);
    	 SelectFiestSubject.click();
    	 Thread.sleep(2000);
    	 ClassDrpDwn.click();
    	 Thread.sleep(2000);
    	 SelClass.click();
    	 Thread.sleep(2000);
    	 Examiner.click();
    	 Thread.sleep(2000);
    	 SelectExaminer.click();
    	 Thread.sleep(2000);
    	 Title.sendKeys("Chapter1");
    	 Thread.sleep(2000);
    	 Next.click();
    	 //-----------------//
    	 Thread.sleep(2000);
    	 TestDate.click();
    	 Thread.sleep(3000);
    	 SelectToday.click();
    	 Thread.sleep(2000);
    	 StartTestTime.click();
    	 Thread.sleep(2000);
    	 SelHR.click();
    	 Thread.sleep(2000);
    	 SelMin.click();
    	 Thread.sleep(2000);
    	 OkBtn.click();
    	 Thread.sleep(2000);
    	 EndTime.click();
    	 Thread.sleep(2000);
    	 SelEndHR.click();
    	 Thread.sleep(2000);
    	 SelEndMin.click();
    	 Thread.sleep(2000);
    	 OkEndBtn.click();
    	 Thread.sleep(3000);
    	 ResultDate.click();
    	 Thread.sleep(2000);
    	 ResultDateAsToday.click();
    	 Thread.sleep(2000);
    	 ResultTime.click();
    	 Thread.sleep(3000);
    	 SelTimeHR.click();
    	 Thread.sleep(2000);
    	 SelTimeMin.click();
    	 Thread.sleep(2000);
    	 OKButton.click();
    	 Thread.sleep(2000);
    	 Instructions.sendKeys("Good Luck!");
    	 Thread.sleep(2000);
    	 Create.click();
	
     }
     
     public void ValidSubjTest() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 TestModule.click();
    	 Thread.sleep(5000);
    	 CreateTest.click();
    	 Thread.sleep(2000);
    	 Thread.sleep(2000);
    	 SelectSubjectiveType.click();
    	 ClickOnNext.click();
    	 Thread.sleep(4000);
    	 SearchSubject.click();
    	 Thread.sleep(3000);
    	 SelectFiestSubject.click();
    	 Thread.sleep(2000);
    	 ClassDrpDwn.click();
    	 Thread.sleep(2000);
    	 SelClass.click();
    	 Thread.sleep(2000);
    	 Examiner.click();
    	 Thread.sleep(2000);
    	 SelectExaminer.click();
    	 Thread.sleep(2000);
    	 Title.sendKeys("Good Luck!");
    	 Thread.sleep(2000);
    	 Next.click();
    	 Thread.sleep(2000);
    	 ObjDate.click();
         Thread.sleep(2000);
 		SubTestDate.click();
 		Thread.sleep(2000);
 		SubSelTime.click();
  	    Thread.sleep(2000);
 		SubSelHr.click();
 		Thread.sleep(2000);
 		SubSelMin.click();
 		Thread.sleep(2000);
 		OkOkbtn.click();
 		Thread.sleep(2000);
 		SubSelEndTime.click();
 		Thread.sleep(2000);
 		SelHr.click();
 		Thread.sleep(2000);
 		SelMinn.click();
 		Thread.sleep(2000);
 		SubInstr.sendKeys("ghdskjhflkjwhf");
 		Thread.sleep(2000);
 		SubCreate.click();
     }
     
}

