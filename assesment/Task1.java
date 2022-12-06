package assesment;


	/*
	* Create a test class which will have 2 test
	Test 1 - User should be able to login and logout with valid credentials
	Test 2-  User should not be able to login if invalid credentials and verify Invalid credentials message

	*/

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

	public class Task1 {
	    WebDriver driver;
	    @BeforeMethod
	    public void setup() {
	        driver=new ChromeDriver();
	        driver.get("http://137.184.76.209/orangehrm-4.9");
	       
	    }
	    @AfterMethod
	    public void clearup() {
	        driver.quit();

	   }
	    @Test
	    public void validCredentials()
	    {
	    	
	       driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Assert.assertEquals(driver.findElement(By.xpath("//b[text()='Admin']")).isDisplayed(), true);
	    }
	    @Test
	    public void validUsernameInvalidPassword()
	    {
	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("ABCD");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ABCDEFG");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Assert.assertEquals(driver.findElement(By.xpath("//span[@id='spanMessage']")).isDisplayed(), true);
	    }
	    



	}

