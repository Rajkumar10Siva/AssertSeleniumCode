package s7examples;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;














public class JunitAnnotations {
	
	static WebDriver d;
	
	

	
	
//	/Before
//	public static void openbrowser() throws InterruptedException
//	{
//		//Launh browser
//		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
//		d= new ChromeDriver();
//		
//		//Go to the particular website	
//		d.get("https://letcode.in/");
//		
//		//Implicit wait
//		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//
//		//Maximize the page
//		d.manage().window().maximize();
//	
//	}
//	
//	
//	
//	@Beforetest
//	public static void login() throws InterruptedException
//	{
//		//Select login
//		WebElement log=d.findElement(By.linkText("Log in"));
//		log.click();
//		
//		//Enter email
//		WebElement email=d.findElement(By.name("email"));
//		email.sendKeys("rkchella17@gmail.com");
//		
//		//Enter password
//		WebElement pass=d.findElement(By.name("password"));
//		pass.sendKeys("Anjali@143");
//		
//		
//		Thread.sleep(5000);
//		
//		//Select login
//		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
//		login.click();
//	
//		Thread.sleep(10000);
//		
//	}
//	
//	
//	@Test
//	public static void Test1()
//	{
//
//	//click work space
//		WebElement space= d.findElement(By.linkText("Work-Space"));
//		space.click();
//		
//		//click Button 
//		WebElement button= d.findElement(By.linkText("Click"));
//		button.click();
//	}	
//	
//	@After
//	public static void signout()
//	{
//		//Select signout 
//		WebElement signout = d.findElement(By.linkText("Sign out"));
//		signout.click(); 
//	}
//	
//	@AfterClass
//	
//	public static void closebrowser()
//	{
//		
//		d.quit();
//
//	}




	
	
	
	@BeforeTest
	public void openbrowser() throws InterruptedException
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		d= new ChromeDriver();
		
		//Go to the particular website	
		d.get("https://letcode.in/");
		
		//Implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

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
		
		//Select login
		WebElement login=d.findElement(By.xpath("/html/body/app-root/app-signin/div/div/div/div/form/div[3]/p/button"));
		login.click();
	
		Thread.sleep(8000);
	}
	
	
	@Test
	public  void Test1()
	{

		//click work space
		WebElement space= d.findElement(By.linkText("Work-Space"));
		space.click();
		
		//click Button 
		WebElement button= d.findElement(By.linkText("Click"));
		button.click();
	}	
	
	@AfterTest
	public  void logout()
	{
		
		
		//Select signout 
		WebElement signout = d.findElement(By.linkText("Sign out"));
		signout.click();
		
		//close the browser
		d.quit();
	}
	
	
	

}
