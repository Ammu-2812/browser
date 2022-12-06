package assesment;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/*
		* Create a new employee
		Login to application using above credentials
		Click on PIM Tab
		Click on Add Employee Tab
		Verify url should contain addEmployee
		Enter First Name
		Enter Last Name
		Upload any file (you can use sendKeys)
		Click on Save
		On the Next page verify Employee id is disabled
		Click on PIM Tab again
		Click on Employee List
		Search for the employee name which is created above using automation
		Click on Search button
		Select the checkbox for employee
		Click on delete
		Click on delete again
		Verify the below message Successfully Deleted
		Click on Welcome >Click on logout
		Verify logout

*/

public class Task2 {
    WebDriver driver;
    @BeforeMethod
    public void setup() {
        driver=new ChromeDriver();
        driver.get("http://137.184.76.209/orangehrm-4.9");
    }
//    @AfterMethod
//    public void clearup() {
//        driver.quit();
//
//    }
    @Test
    public void createEmp() throws IOException, InterruptedException
    {
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
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//input[@id='photofile']"))).click().perform();
        Thread.sleep(3000);
        Runtime.getRuntime().exec("\"C:\\Users\\seesushm\\Desktop\\FileUpload.exe\"");
     //   driver.findElement(By.id("file-submit")).click();
        Thread.sleep(5000);
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