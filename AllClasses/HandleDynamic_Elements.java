package AllClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleDynamic_Elements {

	@Test
	public  void Handle() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		driver.findElement(By.xpath("//button[text()='Click me to start timer']")).click();
	
		WebElement element=null;
		
		for(int i=0;i<20;i++)
		{
			
			try 
			{
			element=driver.findElement(By.xpath("//p[text()='WebDriver']"));
			}
			catch (NoSuchElementException e) 
			{
				System.out.println("Waiting for WebElement");
				Thread.sleep(1000);
			}
			
		}
		
		if(element.isDisplayed()) {
			System.out.println("Element found");
		}
		else {
			System.out.println("Not found");
			Assert.assertEquals(true, false);
			driver.quit();
		}
		
		
		
	}

}
