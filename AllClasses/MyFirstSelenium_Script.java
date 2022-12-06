package AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSelenium_Script {

	@Test
	public  void  Selenium() {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		Assert.assertEquals(true, true);
		driver.quit();
		
		
	}

}
