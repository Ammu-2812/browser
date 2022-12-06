package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SmokeTest {
	
	 WebDriver driver;
	 
	@BeforeMethod
	public void setup()
	{
		System.out.println("Running Before Method-Creating Browser Session");
		WebDriver driver= new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login ");
	}

	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		System.out.println("Running After Method-Browser session closed");
		
	}
	
	
	@Test
	public void verifyURL() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("index.php"));
		driver.quit();
	}
	
	
	
	@Test
	public void verifyTitle() {
		WebDriver driver=new ChromeDriver();
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.getCurrentUrl().contains("OrangeHRM"));
		driver.quit();
	}
	
	@Test
	
	public void verifySocialMediaAcocunt() {
	
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertEquals(driver.findElements(By.xpath("//div[@id='social-icons']//img")).size(),5);
		driver.quit();
	}
	
	
	
	@Test
	public void verifyForgotPasswordLink() {
		
		driver.get("http://137.184.76.209/orangehrm-4.9/symfony/web/index.php/auth/login");
		Assert.assertTrue(driver.findElement(By.linkText("Forgot your password?")).isDisplayed());
		driver.quit();
	}
	
	
}
	
