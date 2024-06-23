package s7examples;



import org.junit.Test;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import java.time.Duration;





public class BeforeAfter {
	
	
	static WebDriver d;
	
	@BeforeClass
	public static void openbrowser() throws InterruptedException
	{
		//Launch browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		 d = new ChromeDriver(options);
		
		
		//Go to the particular website	
		d.get("https://letcode.in/");
		
		//Implicit wait
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//Maximize the page
		d.manage().window().maximize();
	}
	

	@Before
	public void login() throws InterruptedException
	{
		//Select login
		WebElement log=d.findElement(By.linkText("Log in"));
		Actions actions = new Actions(d);
		actions.moveToElement(log).build().perform();
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
	
		Thread.sleep(5000);	
	}
	
	
	@Test
	public  void Test1() throws InterruptedException
	{
		//click work space
		WebElement space= d.findElement(By.linkText("Work-Space"));
		space.click();
		
		//click Button 
		WebElement button= d.findElement(By.linkText("Click"));
		button.click();
		
		System.out.println("@test1 passed");
		
		Thread.sleep(5000);
	}	
	
	@Test
	public void Test2() throws InterruptedException
	{
	
	//Move the mouse to courses element
	 WebElement move = d.findElement(By.xpath("//*[@id='navbar-menu']/div[1]/div[1]/a"));
	 
	
	//Instantiate Action Class
	  Actions actions = new Actions(d);
	   
	   actions.moveToElement(move).build().perform();		   
	   System.out.println("Mouse cursor moved to the speceif element");
	   
	  Thread.sleep(5000);
	  WebElement Allcourse = d.findElement(By.linkText("All Courses"));
	  Allcourse.click();
	  System.out.println("All course clicked");
	  
		System.out.println("@test2 passed");
		
		Thread.sleep(5000);

	}
	

	
	@After
	public  void signout() throws InterruptedException
	{
		//Select signout 
		WebElement signout = d.findElement(By.linkText("Sign out"));
		signout.click(); 
		
		Thread.sleep(12000);
	}
	
	
	
	@AfterClass
	public static void closebrowser()
	{
		d.quit();
	}
//	
//	
//	
//	
//	
//	
//	
//
}
