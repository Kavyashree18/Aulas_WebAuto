package Aulas_Base;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import com.gargoylesoftware.htmlunit.javascript.host.file.File;

import Util.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
	
	public TestBase()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream ("C:\\Users\\Brigosha_Guest\\Downloads\\Aulas_Project-master\\Aulas_Project-master\\src\\main\\java\\Config\\config.properties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	public static void initilization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Brigosha_Guest\\Downloads\\Aulas_Project-master\\Aulas_Project-master\\Drivers\\chromedriver.exe");
		    driver= new ChromeDriver();
		}
		else if(browserName.equals("FF"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\Brigosha_Guest\\Downloads\\Aulas_Project-master\\Aulas_Project-master\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		Thread.sleep(5000);
		driver.get(prop.getProperty("url"));
		//driver.get(prop.getProperty("KYCURL"));
	}
	
	

}
