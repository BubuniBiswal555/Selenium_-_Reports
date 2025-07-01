package Dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("file:///C:/Users/LENOVO/Desktop/Dropdown.html");// copy for MultipleSelect HTML from desktop
		
		  WebElement cars = driver.findElement(By.id("Cars"));
		  Select carsel=new Select(cars);
		  carsel.selectByIndex(0);   //AUDI car
		  carsel.selectByValue("2"); //THAR car
		  carsel.selectByVisibleText("RR"); // RR car
		  
		 // carsel.deselectByIndex(2);
		//  carsel.deselectByValue("2");
		//  carsel.deselectByVisibleText("Audi");
		    carsel.deselectAll();
	}

}
