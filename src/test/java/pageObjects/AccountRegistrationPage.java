package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage{
	
	
	public AccountRegistrationPage (WebDriver driver)
	{
		super(driver);
	}
	
	
	//Locators
	
	@FindBy(xpath="//input[@id=\"input-firstname\"]")
	WebElement txtFirstname;
	
	@FindBy(xpath="//input[@id=\"input-lastname\"]")
	WebElement txtlastname;
	
	@FindBy(xpath="//input[@id=\"input-email\"]")
	WebElement txtEmail;
	
	@FindBy(xpath="//input[@id=\"input-telephone\"]")
	WebElement txtTele;
	
	@FindBy(xpath="//input[@id=\"input-password\"]")
	WebElement txtpwd;
	
	@FindBy(xpath="//input[@id=\"input-confirm\"]")
	WebElement txtConfirmpwd;
	
	@FindBy(xpath="//input[@name=\"agree\"]")
	WebElement chkdPolicy;
	
	@FindBy(xpath="//input[@value=\"Continue\"]")
	WebElement btnContinue;
	
	
	//Action Methods
	
	
	public void setfirstname(String fname)
	{
		txtFirstname.sendKeys(fname);
	}
	
	public void setLastName(String lname)
	{
		txtlastname.sendKeys(lname);
	}
	
	public void setEmail(String email)
	{
		txtEmail.sendKeys(email);
	}
	
	public void setTele(String tel)
	{
		txtTele.sendKeys(tel);
	}
	
	public void setPassword(String pwd)
	{
		txtpwd.sendKeys(pwd);
	}
	
	public void setConfirmPass(String pwd)
	{
		txtConfirmpwd.sendKeys(pwd);
	}
	
	public void setPrivacyPolicy()
	{
		chkdPolicy.click();
	}
	
	public void ClickContinue()
	{
		btnContinue.click();
	}
	
	
	
	
	
	
	
	

	
	
	
	

}
