package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnGetOptions {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));	
		
		driver.get("file:///C:/Users/LENOVO/Desktop/Dropdown.html");
	    driver.findElement(By.id("Cars"));
		   

			  WebElement cars = driver.findElement(By.id("Cars"));
			  Select carsel=new Select(cars);
			  List<WebElement> alloptions = carsel.getOptions();
			  System.out.println(alloptions.size());
			  
			  for(WebElement ele:alloptions) {
				  System.out.println(ele.getText());
			  }
	}			  
}
