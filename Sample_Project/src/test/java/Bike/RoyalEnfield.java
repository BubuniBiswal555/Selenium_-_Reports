package Bike;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class RoyalEnfield {
	@Test
	public void launch() {
		WebDriver driver=new ChromeDriver();
		
	driver.get("https://www.royalenfield.com/in/en/home/");
	Reporter.log("RoyalEnfield launched",true);
	}

}
