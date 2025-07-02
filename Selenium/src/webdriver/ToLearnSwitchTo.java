package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnSwitchTo {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/23");
		Thread.sleep(20000);
		driver.findElement(By.id("compare")).click();
		
		      Set<String> allwindowsIds = driver.getWindowHandles();
		      
		      for(String id:allwindowsIds)
		      {
		    	  driver.switchTo().window(id);
		    	     String url = driver.getCurrentUrl();
		    	  //  if(url.equals("https://www.amazon.in/")) 
		          //  driver.close();                              //it's close single window(Amazon)
		     { 
		      if(url.equals("https://www.flipkart.com/"));
		        System.out.println(driver.getTitle());
		      
		       
		     } 
		   
		     }
		    	 
		      
		     
		    
		 }
		      
		
		                   
	}


