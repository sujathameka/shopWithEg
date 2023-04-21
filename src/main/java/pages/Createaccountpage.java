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
		
		@FindBy(xpath="//input[@name='firstName']")
		public WebElement firstname;
		public void firstName() {
			wait.until(ExpectedConditions.elementToBeClickable(firstname));
		firstname.sendKeys("q");
		
		}
		
		@FindBy(xpath="//p[text()='create account']")
		public WebElement createaccount;
		public void CreateAccount() {
			wait.until(ExpectedConditions.elementToBeClickable(createaccount));
			createaccount.click();
			
		}
		
		@FindBy(xpath="//p[text()='First name must be 2 to 30 characters']")
		public WebElement error;
		public void errorvalidation() {
			wait.until(ExpectedConditions.elementToBeClickable(error));
			Boolean geterror=error.isDisplayed();


			
			
		
		

		}
}

	
