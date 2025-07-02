package Listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements  ITestListener{

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is pass",true);     
	                                                                                 
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test script is fail",true);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is skipped",true);
	
	}
}
