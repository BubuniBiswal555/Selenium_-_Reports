package demo;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentSwithtoSwap {
     public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/23");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
		switchToWindow(driver,"flipkart");
		  Point flposition = driver.manage().window().getPosition();
		  
		
		switchToWindow(driver, "ebay");
		  Point ebpositon = driver.manage().window().getPosition();
		  
		  driver.manage().window().setPosition(flposition);
		  
		switchToWindow(driver, "flipkart");
		  driver.manage().window().setPosition(ebpositon);
		
		
		
	}

	public static void switchToWindow(WebDriver driver, String expUrl) {
		// TODO Auto-generated method stub
		
		  Set<String> allwindowsId = driver.getWindowHandles();
		  for(String id:allwindowsId) {
			  driver.switchTo().window(id);
			 String actUrl = driver.getCurrentUrl();
			 if(actUrl.contains(expUrl)) {
				 break;
			 }
		  }
		
	}
}
