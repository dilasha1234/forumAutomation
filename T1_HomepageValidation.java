package testCases;

import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import Utilities.logCollection;
import Utilities.testData;

public class T1_HomepageValidation {
	
	public static WebDriver driver;
	
	
	@BeforeMethod
	
	public static void openBrowser()
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Summer QA\\June13\\forumAutomation\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		System.out.println("Chrome is launining");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);	

		
		logCollection.debug("Firefox browser opend successfully");
	}

	
	@Test
	
	public static void homepageValidation() 
	
	{
		driver.get(testData.homeurl);
		
		logCollection.debug("home page URL opend successfully");
			
	}
	
	
	@AfterMethod
	
	public static void closeBrowser()
	
	{
	driver.close();
	}
	
	
}
