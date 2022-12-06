package day3;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionDemo {
	
	@Test
	public void test1() {
		Assert.assertEquals(12, 13);
		
	}
	
	@Test
	public void test2() {
		Assert.assertEquals(12, 13,"Count Mismatch");
		
	}
	
	@Test
	public void test3() {
		Assert.assertTrue(false);
		
	}
	
	
	@Test
	public void test4() {
		Assert.assertFalse(false);
		
	}
	
	@Test
	public void test5() {
		String msg="Email already registered";	
		Assert.assertTrue(msg.contains("Registered"));
		
	}
	
	@Test
	public void test6() {	
		String actual="Email already registered";
		String expected="Email already registered";
		Assert.assertTrue(actual.contains("Registered"));
		
	}
	@Test
	public void login() {
		Assert.assertTrue(true);
		System.out.println("Login Done");
		Reporter.log("Login Done",true);
	}
	
	
	// dependsOnMethods gives and  TestNG exception
	
	@Test(dependsOnMethods="login")
	public void logOutFromApplication() {
		System.out.println("Logout Done");
		
	}





}
