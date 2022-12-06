package AllClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyFirstTestNGTest {

	
	@Test
	
	public static void test1() {
		System.out.println("Test 1 Executed");
	}
	
	
	@Test
	public static void test2() {
		System.out.println("Test 2 Executed");
	}
	
	@Test
	public static void test3() {
		System.out.println("Test 3 Executed");
		Assert.assertTrue(true);
		
	}
	


}
