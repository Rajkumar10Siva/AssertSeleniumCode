package s7examples;

import java.time.Duration;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class AssertExample2 {
	
	
	static WebDriver d;

	
	@BeforeClass
	public static void openbrowser() throws InterruptedException
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		d= new ChromeDriver();
		
		//Go to the particular website	
		d.get("https://letcode.in/");
		
		//Implicit wait
	//	d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Maximize the page
		d.manage().window().maximize();
	
		//Select login
		WebElement log=d.findElement(By.linkText("Log in"));
		log.click();
		
		//Enter email
		WebElement email=d.findElement(By.name("email"));
		email.sendKeys("rkchella17@gmail.com");
		
		//Enter password
		WebElement pass=d.findElement(By.name("password"));
		pass.sendKeys("Anjali@143");
		
		
		Thread.sleep(5000);
		
		//Select login
		WebElement login=d.findElement(By.xpath("//input[@name=\"password\"]//following::button[1]"));
		login.click();
	
		Thread.sleep(10000);
	}
	
	
	




@Test
public void testing()
{
	
	//click work space
	WebElement space= d.findElement(By.linkText("Work-Space"));
	space.click();
	
	//click Button 
	WebElement button= d.findElement(By.linkText("Click"));
	button.click();
}	
	
	
	
	
	
	
	@AfterClass
	public static void Closebrowser()
	{
		//Select signout 
		WebElement signout = d.findElement(By.linkText("Sign out"));
		signout.click(); 
		
		d.quit();
	}
	
	
	
	
	
	
	
	
	

}
