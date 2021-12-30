package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import Aulas_Base.TestBase;

public class New_Test extends TestBase
{
	@FindBy(xpath="//button[@class='ant-btn purpleBtnWrap radius-100']")
	WebElement NewCreateTestButton;
	
	public  New_Test()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidCreateTest()
	{
		NewCreateTestButton.click();
	}

}
