package poppus;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.source.tree.SwitchTree;

import webdriver.ToLearnSwitchTo;

public class ChiildWindowPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
		
		     
	   // Set<String> allwindowIds = driver.getWindowHandles();//1. capture window ids
	    
	 //   for(String id:allwindowIds) {                        // 2. use swithcTo().window(id)
	   // 	driver.switchTo().window(id);
	    //	String actUrl = driver.getCurrentUrl();
	    	//if(actUrl.contains("flipkart")) {
	    	//	break;

	    swithchToWindow(driver, "amazon");
	    System.out.println(driver.getTitle());
	    swithchToWindow(driver, "shoppers");
	    swithchToWindow(driver, "flipkart");
	    
	   
	    
	    driver.close();
		   
		
		
	
       public static void swithchToWindow(WebDriver driver,String expUrl) {
       Set<String> allwindowsID = driver.getWindowHandles();
       for(String id:allwindowsID) {
    	   driver.switchTo().window(id);
    	   String actUrl = driver.getCurrentUrl();
    	   
    	   if(actUrl.contains(expUrl)) {
    		   break;
    	   }
       }
       }
    	   

}
