package PRACTICE;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class closeMehtod {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.get("https://www.snapdeal.com/");
		driver.close();
		
	}

}
