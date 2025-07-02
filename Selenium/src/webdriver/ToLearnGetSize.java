package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetSize {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();     // for empty browser.
		
		driver.manage().window().minimize();      // for manage.
		
		driver.get("https://www.flipkart.com/");
		    
		
		Dimension size = driver.manage().window().getSize();
		//System.out.println(size);                             //it showing width and Height.
		System.out.println(size.getHeight());         //its showing height and width.
		System.out.println(size.getWidth());
		
		
		driver.manage().window().setSize(new Dimension(500,500));  // it's showing for set Size   DIMENSION
	}

}
