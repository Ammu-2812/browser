package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium_Script {

	public static void main(String[] args) {

		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://www.google.com");
		WebElement e=driver.findElement(By.name("q"));
		e.sendKeys("Mukesh Otwani");
		e.sendKeys(Keys.ENTER);
		
		String title=driver.getTitle();
		System.out.println("Title is "+title);
		String url=driver.getCurrentUrl();
		System.out.println("URL is "+url);
		//driver.quit();
		
		
	}

}
