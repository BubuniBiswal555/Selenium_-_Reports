package webdriver;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetWindowHandles {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		
		driver.get("https://shoppersstack.com/products_page/81");
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
		    Set<String> allwindowsIds = driver.getWindowHandles();
		    System.out.println(allwindowsIds);
		    
		    for(String s :allwindowsIds)
		    {
		    	System.out.println(s);
				
				
			}
		
		
		       
	}

}
