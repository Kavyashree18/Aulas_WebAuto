package Pages;

import java.lang.reflect.InvocationTargetException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Aulas_Base.TestBase;


public class AssignmentsPage extends TestBase
{
	@FindBy(xpath="//h3[text()='Assignments']")
	WebElement Assignmenttext;
	
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateButton;
	@FindBy(xpath="//div[@class='ant-tabs-tab']/div")
	WebElement DraftButton;
	@FindBy(xpath="(//div[@class='ant-tabs-tab-btn'])[2]")
	WebElement PublishedButton;
	@FindBy(xpath="//span[contains(@class,'anticon-filter')]")
	WebElement FilterIcon;
	@FindBy(xpath="(//div[contains(@class,'color-orange')])[4]/span")
	WebElement MenuDots;
	@FindBy(xpath="//div[text()=' Details']/span")
	WebElement Detailsbtn;
	@FindBy(xpath="//div[text()=' Clone']")
	WebElement CloneBtn;
	@FindBy(xpath="(//div[@class='ant-select-selector']/span[1])[1]")
	WebElement SelStabdardDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])/div/div/div/div[3]")
	WebElement ClassStnadard;
	@FindBy(xpath="((//div[@class='ant-select-selector'])[2]/span/span/span/span)[1]")
	WebElement SubjectDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div[4]")
	WebElement SelSubject;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[2]")
	WebElement TeacherDrpDn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[3]")
	WebElement SelTeacher;
	@FindBy(xpath="//div[contains(@class,'ant-picker-small')]/div/input")
	WebElement DueDate;
	@FindBy(xpath="//span[text()='Apply']")
	WebElement Applybtn;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancelbtn;
	@FindBy(xpath="//span[text()='Clear All']")
	WebElement ClearAllbtn;
	@FindBy(xpath="//input[contains(@class,'assignmentDropdown')]")
	WebElement TitleField;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[1]")
	WebElement SubjectNameDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[1]/div/div/div/div[4]")
	WebElement SubjectName;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[2]")
	WebElement TeacherNameDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div[1]")
	WebElement TeacherName;
	@FindBy(xpath="//span[@class='ant-select-selection-search']/input")
	WebElement ClassDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[1]")
	WebElement ClassName;
	@FindBy(xpath="//div[contains(@class,'assignmentDropdown')]")
	WebElement GradingDrpDwn;
	@FindBy(xpath="//div[text()='Graded']")
	WebElement SelGraded;
	@FindBy(xpath="//div[text()='Ungraded']")
	WebElement SelUngraded;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[1]")
	WebElement Duedate;
	@FindBy(xpath="(//div[text()='1'])[4]")
	WebElement SelDueDate;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[2]")
	WebElement ResultDate;
	@FindBy(xpath="(//div[text()='10'])[4]")
	WebElement SelResultDate;
	@FindBy(xpath="(//span[@class='ant-input-affix-wrapper'])[3]")
	WebElement ChapterName;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[4]/div/div/div/div[5]")
	WebElement SelChaptername;
	@FindBy(xpath="//input[@class='ant-input-number-input']")
	WebElement Index;
	@FindBy(xpath="//textarea[contains(@class,'assignmentDropdown')]")
	WebElement Instructions;
	@FindBy(xpath="//span[text()='Save & Next']")
	WebElement UpdateDetailsButton;
	@FindBy(xpath="//span[text()='Discard']")
	WebElement Discardbutton;
	Actions ac;
	
	/////Details/////
	@FindBy(xpath="//div[contains(@class,'bottomLeft ')]/ul/li[1]")
	WebElement DetailsButton;
	@FindBy(xpath="(//span[contains(@class,'cursor-pointer')])[1]")
	WebElement EyeIcon;
	@FindBy(xpath="//span[contains(@class,'anticon-close')]")
	WebElement Xbutton;
	@FindBy(xpath="(//span[text()='+ Add Question'])[1]")
	WebElement AddQuestion;
	@FindBy(xpath="//div[contains(@class,'cursor-pointer')]/span")
	WebElement EditIcon;
	@FindBy(xpath="//div[@class='quill ']/div/div[1]")
	WebElement EditorText;
	@FindBy(xpath="//span[text()='Save & Close']")
	WebElement SaveAndClosebtn;
	@FindBy(xpath="//span[text()='Add Option']")
	WebElement AddOption;
	@FindBy(xpath="//span[text()='Save & Add More']")
	WebElement SaveandMoreBtn;
	@FindBy(xpath="//span[text()='Save & Next']")
	WebElement Saveandnextbtn;	
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement CancelBtn;
	@FindBy(xpath="(//span[@class='ant-radio'])[3]")
	WebElement RadioBtns;
	@FindBy(xpath="//input[@class='ant-input-number-input']")
	WebElement MarksField;
	
	@FindBy(xpath="(//div[contains(@class,'ant')])[26]/div/span")
	WebElement MenuDOTS;
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[1]")
	WebElement ViewClick;
	@FindBy(xpath="//span[text()='Edit']")
	WebElement EditBtn;
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[3]")
	WebElement CommentClick;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement CommentText;
	@FindBy(xpath="//span[@class='ant-input-suffix']")
	WebElement CommentClickbtn;
	
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[4]")
	WebElement DeleteBtn;
	@FindBy(xpath="//span[text()='OK']")
	WebElement OKbtn;
	
	@FindBy(xpath="(//div[@class='text-center'])[5]/div/span")
	WebElement menuDots;
	@FindBy(xpath="((//div[contains(@class,'ant-dropdown')])[2]/ul/li/div)[1]")
	WebElement Edit;
	@FindBy(xpath="//span[text()='Update Details']")
	WebElement UpdateDetails;
	@FindBy(xpath="((//div[contains(@class,'ant-dropdown')])[2]/ul/li/div)[2]")
	WebElement CloneBttn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])/div/div/div/div[2]")
	WebElement CloneClassname;
	
	@FindBy(xpath="//div[@class='ant-tabs-tab']/div")
	WebElement PublishedBtn;
	@FindBy(xpath="(//div[contains(@class,'color-orange')])[10]/span")
	WebElement PublishedMenuDots;
	@FindBy(xpath="//div[text()='Submissions']")
	WebElement SubmissionBtn;
	/////////ValidationsPopUpMessage///////////
	@FindBy(xpath="//div[text()='Question has been deleted succesfully']")
	WebElement DelPopUpTest;
	
	public AssignmentsPage()
	{
		PageFactory.initElements(driver, this);
	}
	public String validateText()
	{
		return Assignmenttext.getText();
	}
	public void validateFilterApply() throws InterruptedException
	{
		Thread.sleep(2000);
		FilterIcon.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		ac.moveToElement(SelStabdardDrpDwn).click().build().perform();
		Thread.sleep(2000);
		ClassStnadard.click();
		Thread.sleep(3000);
		WebElement ele = SubjectDrpDwn;
		ac.moveToElement(ele).click().sendKeys("S").build().perform();
		Thread.sleep(2000);
		SelSubject.click();
		Thread.sleep(2000);
		WebElement el = TeacherDrpDn;
		ac.moveToElement(el).click().sendKeys("S").build().perform();
		Thread.sleep(3000);
		SelTeacher.click();
		Thread.sleep(2000);
		DueDate.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[text()='30'])[2]")).click();
		Applybtn.click();
		//Cancelbtn.click();
		
	}
	public void validateClearallFilter() throws InterruptedException
	{
		Thread.sleep(2000);
		FilterIcon.click();
		Thread.sleep(2000);
		ClearAllbtn.click();
	}
	public void validateAssignmentCreate(String TestTitle,String index,String instructions) throws InterruptedException
	{
		CreateButton.click();
		TitleField.sendKeys(TestTitle);
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = SubjectNameDrpDwn;
		ac.moveToElement(e).click().sendKeys("S").build().perform();
		Thread.sleep(2000);
		SubjectName.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement el = TeacherNameDrpDwn;
		ac.moveToElement(el).click().sendKeys("S").build().perform();
		Thread.sleep(2000);
		TeacherName.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement ele = ClassDrpDwn;
		ac.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		ClassName.click();
		GradingDrpDwn.click();
		SelGraded.click();
		Duedate.click();
		Thread.sleep(2000);
		SelDueDate.click();
		ResultDate.click();
		Thread.sleep(2000);
		SelResultDate.click();
		ac = new Actions(driver);
		WebElement a = ChapterName;
		ac.moveToElement(a).click().sendKeys("F").build().perform();
		Thread.sleep(2000);
		SelChaptername.click();
		Thread.sleep(2000);
		Index.sendKeys(index);
		Thread.sleep(2000);
		Instructions.sendKeys(instructions);
		UpdateDetailsButton.click();
		//Discardbutton.click();
	}
	
	public void ValidDetails(String Editor,String Optiona,String Optionb,String Optionc,String Optiond,String marks) throws InterruptedException, InvocationTargetException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
//		EyeIcon.click();
		Thread.sleep(2000);
//		Xbutton.click();
		AddQuestion.click();
		EditIcon.click();
		EditorText.sendKeys(Editor);
		Thread.sleep(2000);
		SaveAndClosebtn.click();
		AddOption.click();
		EditorText.sendKeys(Optiona);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(Optionb);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(Optionc);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(Optiond);
		Thread.sleep(2000);
		SaveAndClosebtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ant-radio'])[3]"))).click();
		//RadioBtns.click();
		Thread.sleep(2000);
		MarksField.sendKeys(marks);
		Saveandnextbtn.click();
		String ExtTest = "Question has been deleted succesfully";
		String ele = driver.findElement(By.xpath("//div[text()='Question has been deleted succesfully']")).getText();
		if(ExtTest.equalsIgnoreCase(ele))
		{
		System.out.println("The expected heading is same as actual heading --- " +ele);
		}
		else
		{
		System.out.println("The expected heading doesn't match the actual heading --- " +ele);
		}
		//Thread.sleep(2000);
		CancelBtn.click();
	}
	
	public void ValidViewQuestion(String marks) throws InterruptedException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
		MenuDOTS.click();
		Thread.sleep(2000);
		ViewClick.click();
		Thread.sleep(2000);
		EditBtn.click();
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ant-radio'])[3]"))).click();
		MarksField.sendKeys(marks);
		Saveandnextbtn.click();
	}
	public void ValidComment(String Comment) throws InterruptedException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
		MenuDOTS.click();
		Thread.sleep(2000);
		CommentClick.click();
		CommentText.sendKeys(Comment);
		CommentClickbtn.click();
	}
	
	public void ValidDelete() throws InterruptedException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
		MenuDOTS.click();
		Thread.sleep(2000);
		DeleteBtn.click();
		Thread.sleep(2000);
		//OKbtn.click();
		CancelBtn.click();
		Thread.sleep(2000);
		String ExtTest = "Question has been deleted succesfully";
		String ele = driver.findElement(By.xpath("//div[text()='Question has been deleted succesfully']")).getText();
		if(ExtTest.equalsIgnoreCase(ele))
		{
		System.out.println("The expected heading is same as actual heading --- " +ele);
		}
		else
		{
		System.out.println("The expected heading doesn't match the actual heading --- " +ele);
		}

	}
	
	public void ValidTestEdit(String instructions) throws InterruptedException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
		menuDots.click();
		Edit.click();
		Thread.sleep(2000);
		Instructions.sendKeys(instructions);
		UpdateDetails.click();
		//Discardbutton.click();
	}
	public void ValidClone(String index,String instructions) throws InterruptedException
	{
		MenuDots.click();
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement e = DetailsButton;
		ac.moveToElement(e).click().build().perform();
		menuDots.click();
		CloneBttn.click();
		TitleField.sendKeys("Maths Assignment Test");
		Thread.sleep(2000);
		ac = new Actions(driver);
		WebElement ele = ClassDrpDwn;
		ac.moveToElement(ele).click().build().perform();
		Thread.sleep(2000);
		CloneClassname.click();
		Duedate.click();
		Thread.sleep(2000);
		SelDueDate.click();
		Thread.sleep(2000);
		ResultDate.click();
		Thread.sleep(2000);
		SelResultDate.click();
		Index.sendKeys(index);
		Thread.sleep(2000);
		Instructions.sendKeys(instructions);
		Saveandnextbtn.click();
	}
	public void ValidPublished()
	{
		PublishedBtn.click();
		PublishedMenuDots.click();
		 Detailsbtn.click();
		 SubmissionBtn.click();
	}
	
	
	
	
	

}
