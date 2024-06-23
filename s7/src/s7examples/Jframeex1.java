package s7examples;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Jframeex1 {
	
	@Test
	public  void test1()
	{
		System.out.println("Login test 1");
	}
	@Test
	public  void test2()
	{
		System.out.println("Login test 2");
	}
	@BeforeClass
	public static void openbrowser()
	{
		System.out.println("Before class : Open browser");
	}
	@AfterClass
	public static void closebrowser()
	{
		System.out.println("After class : Close browser");
	}
	@Before
	public void loginpageopen()
	{
		System.out.println("Before : Open login page and enter credentials");
	}
	@After
	public void loginpageclose()
	{
		System.out.println("After: Close loginpage");
	}
}

