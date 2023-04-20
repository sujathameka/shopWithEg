package StepDefinations;

import Utilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Loginpage;
import pages.Createaccountpage;


public class StepDefination {
	
	Loginpage loginpage=new Loginpage(DriverFactory.driver);
	Createaccountpage createaccountpage=new Createaccountpage(DriverFactory.driver);
	
	@Given("user launches shopwithegsite")
	public void user_launches_shopwithegsite() {
		DriverFactory.driver.get("https://stg.shopwitheg.com/");
	   
	    
	}

	@When("user clicks login button")
	public void user_clicks_login_button() {
		
		loginpage.clickloginButton();
		
		
		
		
	   
	 
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		
		
	
		loginpage.enteremail();
		
		loginpage.enterpassword();
		
	    
	   
	}

	@Then("user will sucessfully logged in")
	public void user_will_sucessfully_logged_in() {
		
		loginpage.signin();
	   
	    
	}


@Then("user clicks on create Account button")
public void user_clicks_on_create_account_button() {
	
	createaccountpage.createaccount();
	
}

@When("user eneters firstname with lessthan two characters")
public void user_eneters_firstname_with_lessthan_characters(Integer int1) {
    
}


@Then("validate the erorr message")
public void validate_the_erorr_message() {

	
}

	
	
}


