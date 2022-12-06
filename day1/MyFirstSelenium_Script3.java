package day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyFirstSelenium_Script3 {

	
       public void setup() {
    	   
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
        driver.get("https://ineuron-courses.vercel.app/login");
		
		
		WebElement username=driver.findElement(By.name("email1"));
		username.sendKeys("SapientTraining@gmail.com");
		driver.findElement(By.id("password1")).sendKeys("Abcd@1234");
		driver.findElement(By.className("submit-btn")).click();
		

//      driver.findElement(By.name("email1")).sendKeys(s1);
//      driver.findElement(By.id("password1")).sendKeys(s2);    
//      driver.findElement(By.className("submit-btn")).click();
//      AssertJUnit.assertEquals(driver.findElement(By.xpath("//button[normalize-space()='Sign out']")).isDisplayed(), true);


		
		
	}

}






