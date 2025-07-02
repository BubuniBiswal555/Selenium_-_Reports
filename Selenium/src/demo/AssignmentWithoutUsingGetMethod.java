package demo;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentWithoutUsingGetMethod {
	
	public static void main(String[] args) throws MalformedURLException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	    driver.navigate().to("https://www.ajio.com/");
		driver.navigate().to(new URL("https://www.ajio.com/"));
		
		
		      String tile = driver.getTitle();
		      System.out.println(tile);
		
		  driver.navigate().back();
		  driver.navigate().forward();
		  
		  driver.manage().window().setPosition(new Point(350, 270));
		  driver.manage().window().setSize(new Dimension(400, 300));
		  
		
		
	}

}
