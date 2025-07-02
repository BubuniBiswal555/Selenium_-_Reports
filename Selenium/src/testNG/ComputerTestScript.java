package testNG;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ComputerTestScript extends BaseClass{
	@Test
	public void clickOnComputer() {
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		if(driver.getTitle().equals("Demo Web Shop. Computers")) {
			Reporter.log("Computers Page Should Be displayed",true);
		}else {
			
			Reporter.log("Computers page is not displayed",true);
		}
		
	   }	
}


