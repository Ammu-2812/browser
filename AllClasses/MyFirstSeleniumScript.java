package AllClasses;



import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MyFirstSeleniumScript {
 
	
	@Test
   public  void Selenium2() {

        ChromeDriver driver=new ChromeDriver();
        FirefoxDriver driver1=new FirefoxDriver();
        EdgeDriver driver2=new EdgeDriver();

        driver.get("http://www.google.com");
        driver.findElement(By.name("q")).sendKeys("Sushma");

        String title=driver.getTitle();
        System.out.println("Title is "+ title);
        String url = driver.getCurrentUrl();
        System.out.println("URL is "+url);
        Assert.assertEquals(false, false);
        driver.quit();

//        String title1=driver1.getTitle();
//        System.out.println("Title is "+ title);
//        String url1 = driver1.getCurrentUrl();
//        System.out.println("URL is "+url1);
//
//        String title2=driver2.getTitle();
//        System.out.println("Title is "+ title);
//        String url2 = driver2.getCurrentUrl();
//        System.out.println("URL is "+url2);
//
//


    }



}
