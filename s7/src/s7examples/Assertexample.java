package s7examples;

import static org.junit.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assertexample {

		static WebDriver d;
		@BeforeClass
		public static void openbrowser()
		{
			//Launh browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selinium files\\chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			d = new ChromeDriver(options);
			
			
			
			//Go to the particular website
			d.get("https://demo.guru99.com/test/newtours/login.php");
			
			//print the pagetitle
			String hometitle=d.getTitle();
			System.out.println("home page : " +hometitle);
		}
		
		
		
		
		@Test
		public void testing()
		{
			d.findElement(By.linkText("SIGN-ON")).click();
			String actualtitle= d.getTitle();
			System.out.println("Page title : " +actualtitle);
			String expectedtitle= "Sign-on: Mercury Tours";
			assertEquals(expectedtitle,actualtitle);	
			System.out.println("Test case completed");
		}
		
		
		
		
		
		@AfterClass
		public static void Closebrowser()
		{
			d.quit();
		}
		


}
