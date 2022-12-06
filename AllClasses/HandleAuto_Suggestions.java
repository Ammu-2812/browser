package AllClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleAuto_Suggestions {

	
	@Test
	public  void HandleAuto() throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		driver.findElement(By.name("q")).sendKeys("Sushma");
		
		Thread.sleep(3000);
		
		List<WebElement> allElements= driver.findElements(By.xpath("//div[@role='option']"));
		
		
		for(WebElement ele:allElements)
		{
			String str=ele.getText();
			System.out.println(str);
			
			if(str.contains("condition"))
			{
				ele.click();
				Assert.assertEquals(true,true);
				break;
			}
			
		}
		
	}

}
