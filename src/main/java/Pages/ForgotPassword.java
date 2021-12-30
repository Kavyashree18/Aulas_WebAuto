package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class ForgotPassword extends BaseTest
{
	
	@FindBy(xpath="//input[@class='ant-input m-t-5 aulas-login__input']")
	WebElement ForgotPassword;

	@FindBy(xpath="//span[text()='Send']")
	WebElement SendButton;
	
	@FindBy(xpath="//div[text()='Go Back']")
	WebElement Goback;
	
	public ForgotPassword()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void Login(String email) throws InterruptedException
	{
		Thread.sleep(5000);
		ForgotPassword.sendKeys(email);
		SendButton.click();
	}
	 public void Goback() throws InterruptedException
	 {
		 Thread.sleep(5000);
		 Goback.click();
	 }
	
	
}
