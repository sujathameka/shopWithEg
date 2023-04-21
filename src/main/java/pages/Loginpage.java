package pages;
import java.time.Duration;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Utilities.DriverFactory;

public class Loginpage extends DriverFactory{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));

	public Loginpage(WebDriver driver) {
		
		PageFactory.initElements( driver,this);
}
	
	@FindBy(xpath="//p[text()='login']")
	public WebElement loginButton;
	public void clickloginButton() {
		loginButton.click();
	}
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailid;
	public void enteremail() {
		 emailid.sendKeys("test@test.com");
	}
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	public void enterpassword() {
		password.sendKeys("test123");
		

	}
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	public void signin() {
		
		signin.click();
		
	}
	
	@FindBy(xpath="//button[@type='button']")
			public WebElement CreateAccountButton;

public void clickCreateAccountButton() {
	
	CreateAccountButton.click();
			
	
	











	
	
	
	
}

	

	
}

