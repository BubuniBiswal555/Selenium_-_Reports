package testNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleTestClass {
	
	@Test
	public void sample() {
		Reporter.log("Sample test cases exucated",true);
	}
	
	
	@Test
	public void demo() {     //----> test case
		Reporter.log("Demo test cases executed",true);   //---- test case

    }
}
                   
