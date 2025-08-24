package demoPackage;

import java.time.Duration;

import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.util.Set;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestClass {

	public static void main(String[] args) throws InterruptedException {
	
		//WebDriverManager.chromedriver().setup();	
		
		
		//-----To Handle Permisson popup--
		//ChromeOptions option = new ChromeOptions();
		//option.addArguments("--disable-notification");
		
		//WebDriver driver=new ChromeDriver();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		
	
		WebDriver driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
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
