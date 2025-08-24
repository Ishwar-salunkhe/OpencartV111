package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage (WebDriver driver)
	{
		super(driver);
	}
	
	
	//Locators
	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/a/span[1]")
	WebElement inkMyaccount;
	

	@FindBy(xpath="//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")
	WebElement inkRegister;
	
	
	//Action Methods
	
	public void clickMyaccount()
	{
		inkMyaccount.click();
	}
	
	public void clickOnRegister()
	{
		inkRegister.click();
	}
	
		
	
}