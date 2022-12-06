package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class OptionDemo {

	@Test
	
	public void testInHeadlessMode()
	{
		
		ChromeOptions opt=new ChromeOptions();
		opt.setHeadless(true);
		WebDriver driver=new ChromeDriver(opt);
		driver.get(" ");
		
		
	}
}
