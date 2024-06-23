package s7examples;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HardAssert {
	
	
	
	
	@Test
	public void hardassert()
	{
		String a = "Java";
		String b = "testing";
		
		
		assertEquals(a, b);
		
		
		System.out.println("Test case executed");
	}
	
	
	
	@Test
	public void softassert()
	{
		SoftAssert sa = new SoftAssert();
		
		String a = "Java";
		String b = "testing";
		
		sa.assertNotEquals(a, b);
	
		System.out.println("Test case executed");
	}
	
	
	
	
	
	
	

}
