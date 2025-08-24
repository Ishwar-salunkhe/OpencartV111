package testCases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationPage {
	
	public WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
		
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	@Test
	public void verify_account_registration() 
	{
		
		HomePage hp =new HomePage(driver);
		hp.clickMyaccount();
		hp.clickOnRegister();
		
		AccountRegistrationPage regpage=new AccountRegistrationPage(driver);
		
		regpage.setfirstname("Ishwar");
		regpage.setLastName("Salukhe");
		regpage.setEmail("ishwarsal@12345");
		regpage.setTele("999888777");
		regpage.setPassword("abc@123");
		regpage.setConfirmPass("abc@123");
		regpage.setPrivacyPolicy();
		regpage.ClickContinue();
		
				
	}

}
