package Dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToLearnSelectedOption {
      public static void main(String[] args) {
    	  WebDriver driver=new ChromeDriver();
  		driver.manage().window().maximize();
  		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
  		driver.get("file:///C:/Users/LENOVO/Desktop/Dropdown.html");
  		
  		 WebElement cars = driver.findElement(By.id("Cars"));
		  Select carsel=new Select(cars);
		  carsel.selectByIndex(2); 
		  carsel.selectByIndex(0); 
		  
		   // WebElement firstselected = carsel.getFirstSelectedOption();   // It's for first selectOption
		  //  System.out.println(firstselected.getText());
		   
		      List<WebElement> allSelecteOpt = carsel.getAllSelectedOptions();
		      System.out.println(allSelecteOpt.size());
		      for(WebElement ele:allSelecteOpt) {
		    	  System.out.println(ele.getText());
		      }
		      System.out.println(carsel.isMultiple());
		    	  
		  
		  
	}
}
