package Listeners;

import org.junit.Test;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
@Listeners(ListenerImplementation.class)
public class TestScript {
	@Test
	public void login() {
		Reporter.log("Open Browse an enter url",true);  
		Reporter.log("Click on the loginLink",true); 
		Reporter.log("Enter password",true);  
		Reporter.log("Click on the login Button",true);   
		Assert.assertEquals(true,false);
	}

}
