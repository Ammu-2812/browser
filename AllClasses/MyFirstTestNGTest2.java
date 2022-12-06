package AllClasses;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class MyFirstTestNGTest2 {

	@Test(priority=1)
	
	public static void login() {
		System.out.println("Login Done");
	}	
	
	@Test
	
	public static void createAccount() {
		System.out.println("Account Created");
	}
	
	@Test
	public static void deleteAccount() {
		System.out.println("Account Deleted");
	}
	
	@Test(priority=2)
	public static void logOutFromApplication() {
		System.out.println("Logout Done");
		Assert.assertTrue(true);
	
	}
}
