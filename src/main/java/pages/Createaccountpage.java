package pages;
import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.DriverFactory;

public class Createaccountpage extends DriverFactory{

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

	public Createaccountpage(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
	}
		
		@FindBy(xpath="//button[text()='Create Account']")
		public WebElement account;
		public void createaccount() {
			wait.until(ExpectedConditions.elementToBeClickable(account));
			account.click();
		
	}
}


	
