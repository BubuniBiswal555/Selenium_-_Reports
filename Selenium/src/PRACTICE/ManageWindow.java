package PRACTICE;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageWindow {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.snapdeal.com/");
		//Dimension size = driver.manage().window().getSize();  ====> It is use for getSize
	 //   System.out.println(size.getHeight()) 
		//System.out.println(size.getWidth());
	//	driver.manage().window().setSize(new Dimension(500, 500)); ====> It is use for setSize
	//	Point position = driver.manage().window().getPosition();
	//	System.out.println(position.getX());
	//	System.out.println(position.getY());    ==============> It use for getPosition
				
	//	driver.manage().window().setPosition(new Point(300, 250))	;
	//	driver.navigate().back();
	//	driver.navigate().forward();
		
		driver.navigate().to("https://www.flipkart.com/");
		}

}
