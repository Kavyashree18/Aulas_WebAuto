package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Aulas_Base.BaseTest;

public class LoginClass extends BaseTest
{
	@FindBy(xpath="(//div[contains(@class,'ant-col')]/img)[1]")
	WebElement Logo;
	@FindBy(xpath="//a[text()='Privacy Policy']")
	WebElement PrivacyPolicy;
	@FindBy(xpath="//a[text()='Terms & Conditions']")
	WebElement TermsAndConditions;
	@FindBy(xpath="//div[@class='m-t-5']/input")
	WebElement Email;
	@FindBy(xpath="//div[@class='m-t-20']/span/input")
	WebElement Password;
	@FindBy(xpath="(//button[contains(@class,'bold-bold')])[2]")
	WebElement LoginClick;
	@FindBy(xpath="(//button[contains(@class,'ant-btn')]/span)[1]")
	WebElement ForgotPassword;
	@FindBy(xpath="//a[text()='www.aulas.in']")
	WebElement AulasCareLink;
	@FindBy(xpath="(//div[@class='ant-tabs-tab'])[1]")
	WebElement Register;
	@FindBy(xpath="//span[text()='Mobile']")
	WebElement Mobile;
	@FindBy(xpath="//input[@class='form-control']")
	WebElement EnterMobileNumber;
	@FindBy(xpath="//button[contains(@class,'ant-btn-block r-c-c bold-bold')]")
	WebElement sendOTP;
	@FindBy(xpath="//input[@class='aulas-login__input-verify-otp']")
	WebElement EnterOTP;
	@FindBy(xpath="(//button[contains(@class,'ant-btn-block r-c-c bold-bold m-t-20')])[1]")
	WebElement VerifyOTP;
	
	
	//driver.findElement(By.xpath("//div[@class='m-t-5']/input")).sendKeys("Developer@vectorseducation.com");
	//driver.findElement(By.xpath("//div[@class='m-t-20']/span/input")).sendKeys("classroom7@brigosha");
	//driver.findElement(By.xpath("(//button[contains(@class,'bold-bold')])[2]")).click();
	


	
	public LoginClass()
	{
		PageFactory.initElements(driver, this);
	}
	
	public boolean aulasLogo()
	{
		return Logo.isDisplayed();
		
	}
	
	public void Privacypolicy() throws InterruptedException
	{
		Thread.sleep(4000);
		PrivacyPolicy.click();
	}
	
	public void TermsAndConditions() throws InterruptedException
	{
		Thread.sleep(4000);
		TermsAndConditions.click();
	}
	
	public HomePage1 newLogin(String email,String password) throws InterruptedException
	{
		Thread.sleep(4000);
		Email.sendKeys(email);
		Password.sendKeys(password);
		LoginClick.click();
		return new HomePage1();
	}
	
	public void ForgotPassword() throws InterruptedException
	{
		Thread.sleep(4000);
		ForgotPassword.click();
	}
	
	public void AulasCareLink() throws InterruptedException
	{
		Thread.sleep(4000);
		AulasCareLink.click();
	}
	
	public void Register() throws InterruptedException
	{
		Thread.sleep(4000);
		Register.click();
	}
	
	public void MobileRegister() throws InterruptedException
	{
		Thread.sleep(4000);
		Mobile.click();
		EnterMobileNumber.sendKeys("9886599380");
		Thread.sleep(4000);
		sendOTP.click();
		Thread.sleep(4000);
		EnterOTP.sendKeys("592726");
		Thread.sleep(4000);
		VerifyOTP.click();
	}

}
