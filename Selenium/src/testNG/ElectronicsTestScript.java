package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ElectronicsTestScript extends BaseClass {
	@Test(groups = "smoke")
	public void clickOnElectronic() {
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
		if(driver.getTitle().equals("Demo Web Shop.  Electronics")) {
			Reporter.log(" Electronics Page Should Be displayed",true);
		}else {
			
			Reporter.log(" Electronics page is not displayed",true);
		}
		
	   }	

}
