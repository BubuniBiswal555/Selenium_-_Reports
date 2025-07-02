package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CaptureAllTheFaceBookMonth {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
		driver.get("https://www.facebook.com/reg");
		driver.findElement(By.id("Month"));
		
		  WebElement months = driver.findElement(By.id("Month"));
		  Select carsel=new Select(months);
		  List<WebElement> alloptions = carsel.getOptions();
		  System.out.println(alloptions.size());
		  
		  for(WebElement ele:alloptions) {
			  System.out.println(ele.getText());
	   }

	}
}