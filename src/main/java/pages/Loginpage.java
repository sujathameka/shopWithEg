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
	
	@FindBy(xpath="//input[@name='email']")
	public WebElement emailid;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//p[text()='sign in']")
	public WebElement signin;
	
	@FindBy(xpath="//button[@type='button']")
			public WebElement CreateAccountButton;
			
	
	

public void clickloginButton() {
	loginButton.click();
}



public void enteremail() {
	 emailid.sendKeys("test@test.com");
}



public void enterpassword() {
		password.sendKeys("test123");
		

	}
public void signin() {
	
	signin.click();
	
}
public void clickCreateAccountButton() {
	
	CreateAccountButton.click();
	
	
	
	
}

	

	
}

