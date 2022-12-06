package assesment;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserStack {
	
	WebDriver driver;
	@Parameters({"os","osVersion","browser","browserVersion"})
	@BeforeMethod
	 public void setup(String os,String osVersion,String browser,String browserVersion) {
		 DesiredCapabilities capabilities=new DesiredCapabilities();
		 	capabilities.setCapability("broswerName",browser);
			capabilities.setCapability("broswerVersion",browserVersion);
			capabilities.setCapability("os",os);
			capabilities.setCapability("osVersion",osVersion);
//		 MutableCapabilities capabilities1 = new MutableCapabilities();
//		 capabilities1.setCapability("browserName", "Chrome");
//		 capabilities1.setCapability("browserVersion", "latest");
//		 HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
//		 browserstackOptions.put("os", "Windows");
//		 browserstackOptions.put("osVersion", "11");
//		 browserstackOptions.put("local", "false");
//		 browserstackOptions.put("seleniumVersion", "4.0.0");
//		 capabilities1.setCapability("bstack:options", browserstackOptions);

		 URL url=null;
			try {
				url=new URL("https://sushma_RGhIEm:iK7sykhdEySDAqsmtrgE@hub-cloud.browserstack.com/wd/hub");
				
			}catch(MalformedURLException e){
				e.printStackTrace();
				
			}
			 driver= new RemoteWebDriver(url,capabilities);
			}
	
	@AfterMethod
	public void cleanup() {
		driver.quit();
	}
	
	@Test
	public void testingOnWindows() throws InterruptedException {
		  driver.get("http://137.184.76.209/orangehrm-4.9");
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    	
	        driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
	        driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("ASDFwhuhpp3lhdz3k47iw%");
	        driver.findElement(By.xpath("//input[@type='submit']")).click();
	        Assert.assertEquals(driver.findElement(By.xpath("//b[text()='Admin']")).isDisplayed(), true);
	        
	        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	        driver.findElement(By.xpath("//input[@id='btnAdd']")).click();
	        String url=driver.getCurrentUrl();
	        Assert.assertTrue(url.contains("addEmployee"));
	        
	        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Sushma");
	        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Seelam");
	       
	   //    driver.findElement(By.xpath("//input[@id='photofile']")).sendKeys("C:\Users\seesushm\Pictures\Screenshots\Screenshot (1).png");
	        driver.findElement(By.xpath("//input[@id='btnSave']")).click();
	        Thread.sleep(2000);
	        WebElement e=driver.findElement(By.xpath("//input[@id='personal_txtEmployeeId']"));
	        Assert.assertFalse(e.isEnabled());
	        
	        driver.findElement(By.xpath("//b[normalize-space()='PIM']")).click();
	        
	        driver.findElement(By.xpath("//input[@id='empsearch_employee_name_empName']")).sendKeys("Seelam Sushma");
	        driver.findElement(By.xpath("//input[@id='searchBtn']")).click();
	        driver.findElement(By.xpath("//input[@id='ohrmList_chkSelectAll']")).click();
	        driver.findElement(By.xpath("//input[@id='btnDelete']")).click();
	        
	        driver.findElement(By.xpath("//input[@id='dialogDeleteBtn']")).click();
		    driver.findElement(By.xpath("//a[@id='welcome']")).click();
		    driver.findElement(By.xpath("//a[normalize-space()='Logout']")).click();
	}
	
}







//<?xml version="1.0" encoding="UTF-8"?>
//<!DOCTYPE suite SYSTEM "https://testng.org/testng-1.0.dtd">
//<suite name="Stack" thread-count="5"  parallel="tests">
//  <test name="TestChrome">
//  <parameter name="os" value="windows"/>
//  <parameter name="osVersion" value="10"/>
//  <parameter name="browser" value="chrome"/>
//  <parameter name="browserVersion" value="latest"/>
//    <classes>
//      <class name="assesment.BrowserStack"/>
//    </classes>  
// 
//  </test> <!-- Test -->
//</suite> <!-- Stack -->

//
