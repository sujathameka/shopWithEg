package StepDefinations;

import Utilities.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {
	
	DriverFactory driverFactory=new DriverFactory();
	
	@Before
	public void beforeMethod()
	
	{
		
		driverFactory.init();
	}
	
	@After
	public void afterMethod()
	{
		DriverFactory.driver.quit();
	}

}
