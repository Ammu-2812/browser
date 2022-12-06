package day3;

	import java.time.Duration;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.WebDriverWait;


   public class GenericMethod { 


	   public static void main(String[] args) throws InterruptedException {
	        WebDriver driver= new ChromeDriver();
	        
	        driver.manage().window().maximize();
	        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
	        driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
	           
	        driver.get("https://ineuron-courses.vercel.app/login");
	        
	        
	        WebElement wb=driver.findElement(By.xpath("//input[@id='email1']"));
	        
	        synchroMethod(driver,wb,30000);
	        wb.sendKeys("vishnupriyajorrigala@gmail.com");
	    
	   }
	    
	        
	   
	   
	  public static void  synchroMethod(WebDriver driver, WebElement locator,int sec) throws InterruptedException {
	        int count=0;
	        do {
	            count++;
	            Thread.sleep(1000);//polling time
	        if(locator.isDisplayed())
	            break;
	        if(count==30)
	        { System.out.println("timeout");
	            break;
	        }
	            
	        
	        }while(true);



	   }



	   }
   

   