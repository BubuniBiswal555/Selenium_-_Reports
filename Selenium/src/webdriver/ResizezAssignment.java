package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ResizezAssignment {
   public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();     // Maximized
	
	driver.get("https://www.myntra.com/");      // its showing MyntraApp URL.
       String url = driver.getCurrentUrl();     // it's performing for UrlPrint
       System.out.println(url);
       
       
       Dimension size = driver.manage().window().getSize();
       System.out.println(size.getHeight());
       System.out.println(size.getWidth());         //  SIZE WITH HEIGHT AND WIDTH
       
       driver.manage().window().setSize(new Dimension(500,500));  // Dimension.
	
	
}
}
