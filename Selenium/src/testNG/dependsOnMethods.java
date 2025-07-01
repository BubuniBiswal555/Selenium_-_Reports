package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethods {
	@Test
	public void register() {
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/register");
		Reporter.log("Registered Succesfully",true);
	}
	
	@Test(dependsOnMethods = "register")
	public void login() {
		 WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/login");
		Reporter.log("Logged Sucessfully",true);
	}   
	@Test(dependsOnMethods = {"register","login"})
	public void addTocart() {
		 WebDriver driver=new ChromeDriver();
			driver.get("https://demowebshop.tricentis.com/cart");
			Reporter.log("product add to cart Successfuly",true);
		
	}

}
