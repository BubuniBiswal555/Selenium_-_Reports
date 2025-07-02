package extentreport;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class createReport {
	@Test
	public void createReports() {
		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_Report/createReport.html");
		
		
		ExtentReports eReport=new ExtentReports();
		
		eReport.attachReporter(spark);
		
		
		ExtentTest test = eReport.createTest("createReports");
		
		
		test.log(Status.PASS, "Log message added into report");
		
		
		eReport.flush();
		
		
		
	}

}
