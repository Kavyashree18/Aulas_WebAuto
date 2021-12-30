package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Aulas_Base.TestBase;

public class TestPage extends TestBase
{
	Actions Ac;
	@FindBy(xpath="//h3[text()='Test']")
	WebElement Testtext;
	@FindBy(xpath="//div[contains(@class,'ant-col')]/button/span[@class='anticon anticon-filter']")
	WebElement FilterIcon;
	@FindBy(xpath="(//div[@class='ant-drawer-body']/div/div/div)[1]/span/input[@class='ant-select-selection-search-input']")
	WebElement ClassStandardDrpDwn;
	@FindBy(xpath="//div[@class='rc-virtual-list']/div/div[1]/div/div[4]")
	WebElement SelClass;
	@FindBy(xpath="(//div[@class='ant-drawer-body']/div/div/div)[2]/span/span/span/span/input")
	WebElement SubjectDrpDwn;
	Actions ac;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div[1]")
	WebElement SubjectName;
	@FindBy(xpath="(//div[@class='ant-drawer-body']/div/div/div)[3]/span/span/span/span/input")
	WebElement TeacherDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[2]")
	WebElement TeacherName;
	@FindBy(xpath="(//div[contains(@class,'r-c-sb')])[5]/div/div/input")
	WebElement TestDatebtn;
	@FindBy(xpath="(//div[text()='31'])[1]")
	WebElement SelectTestDate;
	@FindBy(xpath="//span[text()='Apply']")
	WebElement AppltBtn;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement CancelBtn;
	@FindBy(xpath="//span[text()='Clear All']")
	WebElement ClearAllBtn;
	
	@FindBy(xpath="//span[text()='+ Create']")
	WebElement CreateBtn;
	@FindBy(xpath="//div[@class='ant-modal-body']/div/input")
	WebElement TitleField;
	@FindBy(xpath="(//span[@class='ant-select-selection-search'])[1]/span/span/span/input")
	WebElement CreateSubjectdrpDwn;
	@FindBy(xpath="//div[@class='rc-virtual-list']/div/div/div/div[1]")
	WebElement CreateSubjectName;
	@FindBy(xpath="(//span[@class='ant-select-selection-search'])[2]/span/span/span/input")
	WebElement CreateExaminerDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[2]/div/div/div/div[2]")
	WebElement SelExaminername;
	@FindBy(xpath="(//div[contains(@class,'r-c-sb')])[3]/div/div/span/input")
	WebElement ClassDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[3]/div/div/div/div[5]")
	WebElement SeleClass;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[1]")
	WebElement TestDate;
	@FindBy(xpath="(//td[@title='2021-08-10'])[1]")
	WebElement SelTestDate;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[2]")
	WebElement ResultDate;
	@FindBy(xpath="(//td[@title='2021-08-20'])[2]")
	WebElement SelResultDate;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[3]")
	WebElement SelTimeBtn;
	@FindBy(xpath="(//div[text()='04'])[1]")
	WebElement SelHR;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[2]/li[31]")
	WebElement SelMin;
	@FindBy(xpath="(//span[text()='Ok'])[1]")
	WebElement OkBtn;
	@FindBy(xpath="(//div[@class='ant-picker-input'])[4]")
	WebElement EndTime;
	@FindBy(xpath="(//div[text()='07'])[3]")
	WebElement SelEndHR;
	@FindBy(xpath="(//ul[@class='ant-picker-time-panel-column'])[4]/li[31]")
	WebElement SelEndMin;
	@FindBy(xpath="(//span[text()='Ok'])[2]")
	WebElement OkEndBtn;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[4]/span/span/span/span/input")
	WebElement ChaptersDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])[4]/div/div/div/div[4]")
	WebElement ChapterName;
	@FindBy(xpath="//input[@class='ant-input-number-input']")
	WebElement index;
	@FindBy(xpath="//textarea[contains(@class,'assignmentDropdown')]")
	WebElement Instructions;
	@FindBy(xpath="//span[text()='Save & Next']")
	WebElement UpdateDetailsButton;
	@FindBy(xpath="//span[text()='Discard']")
	WebElement Discardbutton;
	
	@FindBy(xpath="(//div[contains(@class,'color-orange')])[1]/span")
	WebElement MenuDots;
	@FindBy(xpath="//div[text()=' Details']/span")
	WebElement Detailsbtn;
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
	@FindBy(xpath="//input[@class='ant-input-number-input']")
	WebElement MarksField;
	@FindBy(xpath="(//input[@class='ant-input-number-input'])[2]")
	WebElement NegaitiveMarks;
	@FindBy(xpath="(//div[@class='ant-select-selector'])[2]")
	WebElement SelChapterName;
	@FindBy(xpath="//div[@class='rc-virtual-list']/div/div/div/div/div")
	WebElement chapterName;
	
	@FindBy(xpath="//span[text()='Save Review']")
	WebElement SaveAndReview;
	@FindBy(xpath="//button[text()='Publish']")
	WebElement Publish;
	@FindBy(xpath="//span[text()=' Delete']")
	WebElement Delete;
	@FindBy(xpath="//span[text()='OK']")
	WebElement OK;
	@FindBy(xpath="//span[text()='Cancel']")
	WebElement Cancel;
	
	@FindBy(xpath="(//div[contains(@class,'r-jsb ')]/div/span)[1]")
	WebElement QuestionDots;
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[3]")
	WebElement ViewButton;
	@FindBy(xpath="//span[text()='Edit']")
	WebElement Edit;
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[1]")
	WebElement Comment;
	@FindBy(xpath="//input[@class='ant-input']")
	WebElement CommentBox;
	@FindBy(xpath="//span[@class='ant-input-suffix']")
	WebElement CommentSendBtn;
	@FindBy(xpath="(//li[contains(@class,'ant')]/div)[4]")
	WebElement DeleteBtn;
	
	@FindBy(xpath="(//div[@class='text-center'])[5]/div/span")
	WebElement menuDots;
	@FindBy(xpath="//ul[contains(@class,'assignmentddlmenu')]/li[1]/div")
	WebElement ActionEdit;
	@FindBy(xpath="//span[text()='Update Details']")
	WebElement UpdateDetails;
	@FindBy(xpath="//span[text()='Discard']")
	WebElement DiscardBtn;
	@FindBy(xpath="//ul[contains(@class,'assignmentddlmenu')]/li[2]/div")
	WebElement CloneBtn;
	@FindBy(xpath="//span[@class='ant-select-selection-search']/input")
	WebElement CloneClassDrpDwn;
	@FindBy(xpath="(//div[@class='rc-virtual-list'])/div/div/div/div[3]")
	WebElement CloneClassName;
	@FindBy(xpath="//input[@class='ant-input-number-input']")
	WebElement Index;
	
	
     public TestPage()
     {
    	 PageFactory.initElements(driver, this);
     }
     
     public String ValidateText()
     {
    	 return Testtext.getText();
     }
     public void ValidFilter() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 FilterIcon.click();
    	 ClassStandardDrpDwn.click();
    	 Thread.sleep(2000);
    	 SelClass.click();
    	 Thread.sleep(2000);
    	 WebElement ele =SubjectDrpDwn;
    	 ele.sendKeys("S");
    	 SubjectName.click();
    	 Thread.sleep(2000);
    	 WebElement s =TeacherDrpDwn;
    	 s.sendKeys("F");
    	 TeacherName.click();
    	 TestDatebtn.click();
    	 Thread.sleep(2000);
    	 SelectTestDate.click();
    	 AppltBtn.click();
    	// CancelBtn.click();
     }
     public void validClearAll() throws InterruptedException
     {
    	 Thread.sleep(2000);
    	 FilterIcon.click();
    	 ClassStandardDrpDwn.click();
    	 Thread.sleep(2000);
    	 SelClass.click();
    	 ClearAllBtn.click();
     }
     
     public void validCreate(String Title,String Index,String instructions) throws InterruptedException
     {
    	 CreateBtn.click();
    	 TitleField.sendKeys(Title);
    	 Thread.sleep(3000);
    	 WebElement e =CreateSubjectdrpDwn;
    	 e.sendKeys("S");
    	 //CreateSubjectName.click();
    	 List<WebElement>li = driver.findElements(By.xpath("//div[@class='rc-virtual-list']/div/div/div/div"));
 		int size = li.size();
 		System.out.println(size);
 		for(int i=0;i<4;i++)
 		{
 			Thread.sleep(3000);
 			li.get(i).click();
 			WebElement el =CreateSubjectdrpDwn;
	    	 el.sendKeys("S");
 		}
 		Thread.sleep(2000);
 		WebElement l = CreateExaminerDrpDwn;
 		l.sendKeys("F");
 		SelExaminername.click();
 		ClassDrpDwn.click();
 		Thread.sleep(2000);
 		SeleClass.click();
 		Thread.sleep(2000);
 		TestDate.click();
 		Thread.sleep(2000);
 		SelTestDate.click();
 		Thread.sleep(2000);
 		ResultDate.click();
 		Thread.sleep(2000);
 		SelResultDate.click();
 		Thread.sleep(2000);
 		SelTimeBtn.click();
 		Thread.sleep(2000);
 		SelHR.click();
 		Thread.sleep(2000);
 		Ac = new Actions(driver);
 		Ac.moveToElement(SelMin).click().build().perform();
 		//SelMin.click();
 		OkBtn.click();
 		Thread.sleep(2000);
 		EndTime.click();
 		Thread.sleep(2000);
 		SelEndHR.click();
 		Thread.sleep(2000);
 		Ac = new Actions(driver);
 		Ac.moveToElement(SelEndMin).click().build().perform();
 		OkEndBtn.click();
 		WebElement ele = ChaptersDrpDwn;
 		ele.sendKeys("S");
 		Thread.sleep(2000);
 		ChapterName.click();
 		index.sendKeys(Index);
 		Instructions.sendKeys(instructions);
 		UpdateDetailsButton.click();
 		//Discardbutton.click();
// 		Thread.sleep(2000);
// 		String text = "Please select a chapter for the test";
// 		String elee = driver.findElement(By.xpath("//div[text()='Please select a chapter for the test']")).getText();
// 		if(text.equalsIgnoreCase(elee))
//		{
//		System.out.println("The expected heading is same as actual heading --- " +elee);
//		}
//		else
//		{
//		System.out.println("The expected heading doesn't match the actual heading --- " +elee);
//		}

     }
     public void ValidDetails(String Editor,String Optiona,String Optionb,String Optionc,String Optiond,String marks,String ET,String OptionA,String OptionB,String OptionC,String OptionD,String NegMarks) throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
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
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ant-radio'])[1]"))).click();
		//RadioBtns.click();
		Thread.sleep(2000);
		MarksField.sendKeys(marks);
		SelChapterName.click();
		chapterName.click();
		Saveandnextbtn.click();
		Thread.sleep(2000);
		EditIcon.click();
		EditorText.sendKeys(ET);
		Thread.sleep(2000);
		SaveAndClosebtn.click();
		AddOption.click();
		EditorText.sendKeys(OptionA);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(OptionB);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(OptionC);
		SaveandMoreBtn.click();
		Thread.sleep(2000);
		EditorText.sendKeys(OptionD);
		Thread.sleep(2000);
		SaveAndClosebtn.click();
		WebDriverWait w = new WebDriverWait(driver, 10);
		w.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@class='ant-radio'])[1]"))).click();
		MarksField.sendKeys(marks);
		NegaitiveMarks.sendKeys(NegMarks);
		SelChapterName.click();
		chapterName.click();
		Saveandnextbtn.click();
		Thread.sleep(2000);
		CancelBtn.click();
		Thread.sleep(2000);
		String ExtTest = "Question saved succesfully";
		String ele = driver.findElement(By.xpath("//div[text()='Question saved succesfully']")).getText();
		if(ExtTest.equalsIgnoreCase(ele))
		{
		System.out.println("The expected heading is same as actual heading --- " +ele);
		}
		else
		{
		System.out.println("The expected heading doesn't match the actual heading --- " +ele);
		}
     }
     
     public void validQuestionSave() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		SaveAndReview.click();
 		Thread.sleep(2000);
 		String ExtTest = "Review saved";
		String ele = driver.findElement(By.xpath("//div[text()='Review saved']")).getText();
		if(ExtTest.equalsIgnoreCase(ele))
		{
		System.out.println("The expected heading is same as actual heading --- " +ele);
		}
		else
		{
		System.out.println("The expected heading doesn't match the actual heading --- " +ele);
		}
     }
     
     public void ValidPublish() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
    	 Publish.click();
    	// OK.click();
    	 Cancel.click();
     }
     public void ValidDelete() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
    	 Delete.click();
    	// OK.click();
    	 Cancel.click();
     }
     public void validViewQuestion() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		QuestionDots.click();
 		Thread.sleep(2000);
 		ViewButton.click();
 		Thread.sleep(2000);
 		Edit.click();
 		Saveandnextbtn.click();
 		Thread.sleep(2000);
 		String ExtTest = "Questionss saved succesfully";
		String ele = driver.findElement(By.xpath("//div[text()='Question saved succesfully']")).getText();
		if(ExtTest.equalsIgnoreCase(ele))
		{
		System.out.println("The expected heading is same as actual heading --- " +ele);
		}
		else
		{
		System.out.println("The expected heading doesn't match the actual heading --- " +ele);
		}
     }
     public void validComment() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		QuestionDots.click();
 		Thread.sleep(2000);
 		Comment.click();
 		CommentBox.sendKeys("This is a Testing Comment");
 		CommentSendBtn.click();
     }
     public void validDeleted() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		driver.findElement(By.xpath("(//div[contains(@class,'r-jsb ')]/div/span)[2]")).click();
 		Thread.sleep(3000);
 		DeleteBtn.click();
 		Thread.sleep(2000);
 		OK.click();
   	    //Cancel.click();
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
     public void validTestEdit() throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		menuDots.click();
 		Thread.sleep(2000);
 		ActionEdit.click();
 		UpdateDetails.click();
 		//DiscardBtn.click();
     }
     public void validClone(String Title,String index,String instructions) throws InterruptedException
     {
    	 MenuDots.click();
    	 Thread.sleep(2000);
 		ac = new Actions(driver);
 		WebElement e = Detailsbtn;
 		ac.moveToElement(e).click().build().perform();
 		menuDots.click();
 		Thread.sleep(2000);
 		CloneBtn.click();
 		TitleField.sendKeys(Title);
 		CloneClassDrpDwn.click();
 		Thread.sleep(2000);
 		CloneClassName.click();
 		Thread.sleep(2000);
 		TestDate.click();
 		Thread.sleep(2000);
 		SelTestDate.click();
 		Thread.sleep(2000);
 		ResultDate.click();
 		Thread.sleep(2000);
 		SelResultDate.click();
 		Thread.sleep(2000);
 		SelTimeBtn.click();
 		Thread.sleep(2000);
 		SelHR.click();
 		Thread.sleep(2000);
 		Ac = new Actions(driver);
 		Ac.moveToElement(SelMin).click().build().perform();
 		//SelMin.click();
 		OkBtn.click();
 		Thread.sleep(2000);
 		EndTime.click();
 		Thread.sleep(2000);
 		SelEndHR.click();
 		Thread.sleep(2000);
 		Ac = new Actions(driver);
 		Ac.moveToElement(SelEndMin).click().build().perform();
 		OkEndBtn.click();
 		Index.sendKeys(index);
		Thread.sleep(2000);
		Instructions.sendKeys(instructions);
		Saveandnextbtn.click();
     }
     
     
     
}
