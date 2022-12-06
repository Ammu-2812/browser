package assesment;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenShots {
	
	public static void main(String[]args) {
		WebDriver driver=new ChromeDriver();
		driver.get("driver.get(\"https://www.facebook.com/\")");
		//TakeScreenshot ts=(TakeScreenshot)driver;
		//ts.getScreenshotAs(OutputType.FILE);
		//File.src=ts.getScreenshotAs(OutputType.FILE);
		//File dest=new File("./MUkesh.png");
//		try {
//			
//			FileHandler.copy(src, dest);
//			
//		}catch(IOException e){
//			System.out.println("Failed"+e.getMessage());
//		
//			
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		/*
		 * for whole page screenshot
		 */
//		Utility.CaptureScreenshotwithTimeStamp(driver);
//		driver.findElement(By.name("q"));
//		Utility.CaptureScreenshotwithTimeStamp(driver);
//		
		
		/*
		 * for particular things screens shot
		 */
//		WebDriver driver=new ChromeDriver();
//		driver.get("driver.get(\"https://www.facebook.com/\")");
//		Utility.CaptureScreenshotwithTimeStamp(driver);
//		File scr=driver.findElement(By.namee("q")).getScreenshot
//		Utility.CaptureScreenshotwithTimeStamp(driver);
}
}
