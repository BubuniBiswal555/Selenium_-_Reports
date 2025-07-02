package Actons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToLearnMouseHover {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://www.vtiger.com/");
	
	 // WebElement features = driver.findElement(By.partialLinkText("Features"));
	  
	 //Actions act=new Actions(driver);
	 // act.moveToElement(features).perform();
	  
      // WebElement salesAuto = driver.findElement(By.partialLinkText(" Sales Automation\r\n"));
	  
	 // Actions actt=new Actions(driver);
	 // actt.moveToElement(salesAuto).perform();
	  Actions act=new Actions(driver);
	  act.moveByOffset(357, 102).perform();  
	  
	;
}

}
