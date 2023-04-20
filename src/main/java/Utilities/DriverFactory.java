package Utilities;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {
	
	public static WebDriver driver;
	
	public void init()
	
	{
		
		System.setProperty("webdriver.chrome.driver","D:\\automation\\chromeDriver\\chromedriver.exe");
		driver=new ChromeDriver();
	}

}
