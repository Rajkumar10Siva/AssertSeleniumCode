package s7examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

public class Jframe {
	
	
	//1. Add the Selenium jar File by selecting the project->Right click->Select properties->Add java build path -> Select Add External JARS and add selenium Jar file -> Select Library -> Add J unit -> Select Apply and close
	

	
	@BeforeClass
	public static void beforeclass()
	{
	System.out.println("before class");
	}
	
	
	
	@AfterClass
		public static void afterclass()
		{
		System.out.println("afterclass");
		}
	

	
	@Before
		public void before()
		{
		System.out.println("before Framework")	;
		}
	

	
	@After
		public  void after()
		{
		System.out.println("after Framework")	;
		}
	
	

	
	
		@Test
		public void test1()
		{
		System.out.println("test 1");
		}
	
	
		@Test
		public void test2()
		{
		System.out.println("test 2");
		}
	
	

}
