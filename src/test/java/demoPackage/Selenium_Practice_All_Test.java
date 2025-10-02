package demoPackage;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;


public class Selenium_Practice_All_Test {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		//WebDriverManager.chromedriver().setup();	
		
		
		//-----To Handle Permisson popup--
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notification");
		
		//WebDriver driver=new ChromeDriver();
		
		//ChromeOptions options=new ChromeOptions();
		//options.addArguments("--incognito");

		WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.redbus.in/");
         //driver.get("https://testautomationpractice.blogspot.com/");
       // driver.get("https://testautomationpractice.blogspot.com/");
        //driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement dataPickeur=driver.findElement(By.xpath("//span[contains(@class,'doj___e69938')]"));
		Thread.sleep(3000);
		dataPickeur.click();
		
		
		
		
		//WebElement Fname=driver.findElement(By.id("name"));
		
		 //JavascriptExecutor js = (JavascriptExecutor) driver;
	     // js.executeScript("arguments[0].value='Ishwar';", Fname);
		
		//======Scroll to bottum of the page====================
		//JavascriptExecutor js=(JavascriptExecutor) driver;
		//js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		


		/*
		WebElement newtab=driver.findElement(By.xpath("//button[text()='New Tab']"));
		newtab.click();
		
		Set<String> windowIDS=driver.getWindowHandles();
		Iterator<String> it=windowIDS.iterator();
		String parentWind=it.next();
		String child=it.next();
		driver.switchTo().window(child);
		WebElement linkName=driver.findElement(By.linkText("Manual Testing Tutorials"));
		System.out.println(linkName);
	
	
		
		/* To get the All options from the dropdown
		WebElement drpMonth=driver.findElement(By.xpath("(//select[@type='text'])[4]"));
		Select ss=new Select(drpMonth);
		List<WebElement> drplist=ss.getOptions();
		for(WebElement month:drplist)
		{
			System.out.println(month.getText());
			
		}
		System.out.println(drplist.size());
		*/
		/*
		==============Upload file==============
			
		WebElement uploadBtn=driver.findElement(By.xpath("//input[@type='file']"));
		uploadBtn.sendKeys("C:\\Users\\HP\\Desktop\\Test Folder\\testImage");
		WebElement messagedisply=driver.findElement(By.xpath("//p[@id='singleFileStatus']"));
		System.out.println(messagedisply.getText());
		*/
		
	
		/*WebElement fromBtn=driver.findElement(By.xpath("//div[@role='button']"));
		Thread.sleep(2000);
		fromBtn.click();
		fromBtn.sendKeys("Mumbai");
		Thread.sleep(2000);
	    WebElement swargateBtn=driver.findElement(By.xpath("//div[text()='Swargate']"));
		Actions act=new Actions(driver);
		act.moveToElement(swargateBtn).perform();
		*/
		
	
		
		//Scenario: Capture the image ont heh dsler pages
		
		
		
		//WebElement dropdown=driver.findElement(By.xpath("//select[@id='country']"));

		//Select ss=new Select(dropdown);
		//ss.selectByVisibleText("India");
		//ss.selectByIndex(1);
		//ss.selectByValue("Germany");
		
		//======Scroll donw by Move to element
		/*		
		Thread.sleep(3000);
				WebElement Electroninc=driver.findElement(By.xpath("//span[text()='Electronics']"));
				Actions act=new Actions(driver);
				act.moveToElement(Electroninc).perform();
				
				WebElement camEle=driver.findElement(By.xpath("//a[text()='Cameras & Accessories']"));
				act.moveToElement(camEle).perform();
				
				WebElement dslrLink=driver.findElement(By.xpath("//*[text()='DSLR & Mirrorless']"));
				dslrLink.click();
				
				String title=driver.getTitle();
				System.out.println(title);
				*/
				
				
		
		/*//======To get all dropdown options==
		WebElement drp=driver.findElement(By.xpath("//select[@id='country']"));
		Select ss=new Select(drp);
	
		List<WebElement> AllOpt=ss.getOptions();
		for(WebElement value:AllOpt)
		{
			System.out.println(value.getText());
		}
		//==================================================
	
		
		/*=====Get window Handles=======
		Set<String> IDs=driver.getWindowHandles();
		Iterator<String> it=IDs.iterator();
		String ParentID=it.next();
		String ChildID=it.next();
		
		driver.switchTo().window(ChildID);
		String newWintitle=driver.getTitle();
		System.out.println(newWintitle);
		driver.findElement(By.xpath("//a[text()='Advanced Java']")).click();
		//String childTitle= newwindow.getText();
		//System.out.println(childTitle);
		
		//System.out.println(ParentID);
		//System.out.println(ChildID);
		
		//====How to select All checkbox====
		/*List<WebElement>checkboxex=driver.findElements(By.xpath("//input[contains(@id,'day')]"));
		
		for(int i=0; i<checkboxex.size(); i++)
		{
			
			checkboxex.get(i).click();
		}
		*/
		
	    // WebElement src=driver.findElement(By.xpath("(//input[@type=\"text\"])[6]"));)
		
	    
		//=====================//================//
		/*TakesScreenshot ts=(TakesScreenshot) driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File dest=new File(".\\screenshots\\test.png");
		FileHandler.copy(src, dest);
		-------------x---------------------
		//Webdriver wait
		
		WebDriverWait mywait=new WebDriverWait(driver,Duration.ofSeconds(10));
		WebElement button=mywait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='button']")));
		
		
		
		WebElement fileUploadBtn=driver.findElement(By.xpath("(//*[@type=\"file\"])[1]"));
		fileUploadBtn.sendKeys("C:\\Users\\HP\\eclipse-workspace\\OpencartV111\\screenshots\\test.png");
		
		
		//https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index
	    //Assert.assertEquals(currentURL, "https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		
		//WebDriverWait mywait= new WebDriverWait(driver, Duration.ofSeconds(5));
		//mywait.until(ExpectedConditions.presenceOfAllElementsLocatedBy())
		
		
		/*List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println("Number of links in the page is..."+links.size());
		int brokenLink=0;
		for(WebElement Alllinks:links)
		{
			String hrefURL=Alllinks.getAttribute("href");
			System.out.println(hrefURL);
			
			if(hrefURL.contains("broken-links"))
			{
				System.out.println("It is broken link");
				 System.out.println((brokenLink++));
			}
			else
			{
				System.out.println("Not broken link");
			}
		}
		
	    //System.out.println("title of the page" +driver.getTitle());
		
		/*WebElement dis =driver.findElement(By.xpath("(//img[@alt=\"close\"])[2]"));
		Alert alt= driver.switchTo().alert();
		alt.dismiss();*/
		
		/*WebElement searchBar =driver.findElement(By.xpath("xpath"));
		System.out.println("Status of the search var" +searchBar.isDisplayed());
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		//driver.findElement(By.xpath("//input[@name=\"search\"]")).sendKeys("abc");
	   //List<WebElement> listcc =driver.findElements(By.xpath("demoxpath"));
	   //listcc.size();
		
		/*WebElement btn =driver.findElement(By.xpath("//input[@type=\"text\"]"));
		String searchbar =btn.getText();
		System.out.println(searchbar);*/
		
		//WebElement dorp =driver.findElement(By.id("dropdown-class-example"));
		
		//Select drp = new Select(dorp);
		
		//drp.selectByVisibleText("Option1");
		//drp.selectByValue("option2");
	    //drp.selectByIndex(1);
		
		//driver.findElement(By.id("checkBoxOption1")).click();
		
		//String ID= driver.getWindowHandle();
		//System.out.println(ID);
		
		/*driver.findElement(By.xpath("//a[@href=\"http://www.orangehrm.com\"]")).click();
		
		Set<String> ids =driver.getWindowHandles();
		Iterator<String> it =ids.iterator();
		String parentID =it.next();
		String child =it.next();
		
		System.out.println("Id of parnet window" + parentID);
		System.out.println("Id of child window" + child);
	
		driver.switchTo().window(parentID);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child);
		System.out.println(driver.getTitle());*/
		
		//driver.findElement(By.linkText("Today's Deals")).click();
		
		//How to capture All links form the page
		
		//List<WebElement> links =driver.findElements(By.tagName("a"));
		//System.out.println("Number of the links is" + links.size());
		
		/*driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Thread.sleep(3000);
		
	    Alert alt =driver.switchTo().alert();
	    String txt =alt.getText();
	    System.out.println(txt);
	    
	    alt.sendKeys("Target");
		Thread.sleep(3000);
	    
	    alt.accept();*/
		 //driver.switchTo().frame("xyz");   //Switch to frames
		
		
		
        //WebElement searchBar =driver.findElement(By.id("APjFqb"));
		
		//searchBar.sendKeys("Selenium");
		
		//searchBar.sendKeys(Keys.ENTER);   //Hit the enter button with selenium send keys.
		
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		
		//WebElement country =driver.findElement(By.id("dropdown-class-example"));
		
		//Select drp= new Select(country);
		
		//System.out.println(drp.getOptions().size());
		
		//drp.selectByIndex(3);
		
		
		
		

		
		
		
		
		
		
	

	}

}
