package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileDownloader {
  
	WebDriver driver;
    @BeforeMethod
    public void setup()
    {
        driver= new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/download");
    }
    
    @AfterMethod
    public void tearDown()
    {
       // driver.quit();
    }
    
    @Test
    public void File()
    {
    	driver.findElement(By.xpath("//a[normalize-space()='Mind Map (3).mymind']")).click();
    }
}
