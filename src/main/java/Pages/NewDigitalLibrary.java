package Pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.TestBase;

public class NewDigitalLibrary extends TestBase
{
	Actions ac;
	Robot r;
	@FindBy(xpath="(//ul[@class='ant-menu-item-group-list'])[2]/li[1]")
	WebElement DigitalLibrary;
	@FindBy(xpath="//div[text()='Digital library']")
	WebElement DigitalLibraryText;
	@FindBy(xpath="(//span[contains(@class,'anticon')])[1]")
	WebElement PerformenceInfo;
	@FindBy(xpath="//div[contains(@class,'ant-select-show-arrow')]/div")
	WebElement ImpressionDrpDwn;
	@FindBy(xpath="(//div[text()='Engagements'])[2]")
	WebElement EngagementsClick;
	@FindBy(xpath="(//button[contains(@class,'ant-btn-primary')])[1]")
	WebElement UploadBtn;
	@FindBy(xpath="(//span[@class='ant-radio'])[1]")
	WebElement LectureNotes;
	@FindBy(xpath="//button[contains(@class,'primary')]/span[text()='Next']")
	WebElement Nextbtn;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]/span/input")
	WebElement SubjectField;
	@FindBy(xpath="(//div[@class='ant-select-item ant-select-item-option'])[1]")
	WebElement SelSubject;
	@FindBy(xpath="(//span[@class='ant-select-selection-item'])[2]")
	WebElement ClassField;
	@FindBy(xpath="(//div[@class='ant-select-item ant-select-item-option'])[1]")
	WebElement SelClass;
	@FindBy(xpath="(//span[@class='ant-select-selection-search']/input[contains(@class,'selection')])[4]")
	WebElement ChapterField;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div[1]/div/div/div[1]")
	WebElement SelChapter;
	@FindBy(xpath="//div[@class='uploadfilesinput']/input")
	WebElement TopicField;
	@FindBy(xpath="(//button[contains(@class,'ant-btn-default')])[2]")
	WebElement ChooseFile;
	@FindBy(xpath="//span[text()='PUBLISH']")
	WebElement PublishBtn;
	@FindBy(xpath="//span[text()='CANCEL']")
	WebElement CancelBtn;
	@FindBy(xpath="(//span[@class='ant-radio'])[2]")
	WebElement Videos;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement videoLink;
	@FindBy(xpath="//div[@class='udloadFilesDropdown']/div/div/span/input")
	WebElement VideoClass;
	@FindBy(xpath="(//div[@class='ant-select-selector']/span/input)[3]")
	WebElement Chaptervideoclass;
	@FindBy(xpath="(//span[@class='ant-radio'])[3]")
	WebElement QuestionBank;
	@FindBy(xpath="(//div[@class='lecturenotesmain cursor-pointer'])[7]")
	WebElement SelectClass;
	@FindBy(xpath="//div[contains(@class,'sub-flex')]/div[2]")
	WebElement SubjectClass;
	@FindBy(xpath="//div[@class='lecturenotesmain ']/div/div/div/div")
	WebElement MenuDots;
	@FindBy(xpath="//span[text()='Edit']")
	WebElement Edit;
	
     public NewDigitalLibrary()
     {
    	 PageFactory.initElements(driver, this);
     }
     public String validateDigitalLibraryText() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 DigitalLibrary.click();
    	 Thread.sleep(3000);
		 return DigitalLibraryText.getText();
    	 
     }
     public void infoIcon() throws InterruptedException
     {
    	 Thread.sleep(3000);
    	 DigitalLibrary.click();
    	 Thread.sleep(6000);
    	 PerformenceInfo.click();
    	// ac = new Actions(driver);
    	 //ac.moveToElement(PerformenceInfo).click().build().perform(); 
     }
     public void impDrpDwn() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 DigitalLibrary.click();
    	 Thread.sleep(6000);
    	 ImpressionDrpDwn.click();
    	 Thread.sleep(2000);
    	 EngagementsClick.click();
    	 Thread.sleep(3000);
     }
     public void Upload(String files) throws InterruptedException, AWTException
     {
    	 Thread.sleep(2000);
    	 DigitalLibrary.click();
    	 Thread.sleep(2000);
    	 UploadBtn.click();
    	 Thread.sleep(2000);
    	 LectureNotes.click();
    	 Nextbtn.click();
    	 Thread.sleep(4000);
    	 SubjectField.sendKeys("English");
    	 Thread.sleep(4000);
    	 SelSubject.click();
 //   	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 ClassField.click();
    	 Thread.sleep(2000);
    	 SelClass.click();
  	 Thread.sleep(2000);
    	 ChapterField.sendKeys("The Three Questions");
    	 SelChapter.click();
    	 Thread.sleep(2000);
    	 TopicField.sendKeys("Unit Exam");
    	 WebElement file = ChooseFile;
    	 file.click();
    	 Thread.sleep(2000);
    	 r = new Robot();
    	 StringSelection str = new StringSelection(files);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER); 
		    PublishBtn.click();
		    
     }
     public void UploadCancel(String files) throws InterruptedException, AWTException
     {
    	 Thread.sleep(2000);
    	 UploadBtn.click();
    	 Thread.sleep(2000);
    	 LectureNotes.click();
    	 Nextbtn.click();
    	 SubjectField.sendKeys("EC2");
    	 SelSubject.click();
    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 ClassField.sendKeys("Devops Class");//Devops Class - aws
    	 SelClass.click();
    	 ChapterField.sendKeys("VPC");
    	 SelChapter.click();
    	 TopicField.sendKeys("Unit Exam");
    	 WebElement file = ChooseFile;
    	 file.click();
    	 Thread.sleep(2000);
    	 r = new Robot();
    	 StringSelection str = new StringSelection(files);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_C);
			r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER); 
		    CancelBtn.click();	    
     }
     public void VideoPublished(String link) throws InterruptedException
     {
    	 Thread.sleep(4000);
    	 UploadBtn.click();
    	 Thread.sleep(2000);
    	 Videos.click();
    	 Nextbtn.click();
    	 Thread.sleep(4000);
    	 videoLink.sendKeys(link);
    	 SubjectField.sendKeys("Science");
    	 SelSubject.click();
    	 Thread.sleep(4000);
    	 VideoClass.sendKeys("Testing");
    	 SelClass.click();
    	 Chaptervideoclass.sendKeys("Chemical");
    	 SelChapter.click();
    	 TopicField.sendKeys("VectorVideo");
    	 PublishBtn.click();
     }
     public void VideoCancel(String link) throws InterruptedException
     {
    	 Thread.sleep(4000);
    	 UploadBtn.click();
    	 Thread.sleep(2000);
    	 Videos.click();
    	 Nextbtn.click();
    	 Thread.sleep(4000);
    	 videoLink.sendKeys(link);
    	 SubjectField.sendKeys("Science");
    	 SelSubject.click();
    	 Thread.sleep(4000);
    	 VideoClass.sendKeys("Testing");
    	 SelClass.click();
    	 Chaptervideoclass.sendKeys("Chemical");
    	 SelChapter.click();
    	 TopicField.sendKeys("VectorVideo");
    	 CancelBtn.click();	
     }
     public void QuestionbankPublished(String files) throws InterruptedException, AWTException
     {
    	 Thread.sleep(4000);
    	 UploadBtn.click();
    	 Thread.sleep(4000);
    	 QuestionBank.click();
    	 Nextbtn.click();
    	 SubjectField.sendKeys("EC2");
    	 SelSubject.click();
    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 ClassField.sendKeys("Devops Class");//Devops Class - aws
    	 SelClass.click();
    	 ChapterField.sendKeys("VPC");
    	 SelChapter.click();
    	 TopicField.sendKeys("Unit Exam");
    	 WebElement file = ChooseFile;
    	 file.click();
    	 Thread.sleep(2000);
    	 r = new Robot();
    	 StringSelection str = new StringSelection(files);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER); 
      	 PublishBtn.click();
     }
     public void QuestionbankCancel(String files) throws InterruptedException, AWTException
     {
    	 Thread.sleep(4000);
    	 UploadBtn.click();
    	 Thread.sleep(4000);
    	 QuestionBank.click();
    	 Nextbtn.click();
    	 SubjectField.sendKeys("EC2");
    	 SelSubject.click();
    	 driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    	 ClassField.sendKeys("Devops Class");//Devops Class - aws
    	 SelClass.click();
    	 ChapterField.sendKeys("VPC");
    	 SelChapter.click();
    	 TopicField.sendKeys("Unit Exam");
    	 WebElement file = ChooseFile;
    	 file.click();
    	 Thread.sleep(2000);
    	 r = new Robot();
    	 StringSelection str = new StringSelection(files);
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_V);
			r.keyRelease(KeyEvent.VK_CONTROL);
		    r.keyRelease(KeyEvent.VK_V);
		    r.keyPress(KeyEvent.VK_ENTER);
		    r.keyRelease(KeyEvent.VK_ENTER); 
		    CancelBtn.click();
     }
     public void selectingClass()
     {
    	 SelectClass.click();
     }
     public void EditField()
     {
    	 SubjectClass.click();
    	 MenuDots.click();
    	 Edit.click();
    	 TopicField.sendKeys("Unit Test");
     }
     
     
     
}
