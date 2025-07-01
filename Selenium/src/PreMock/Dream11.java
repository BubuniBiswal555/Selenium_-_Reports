package PreMock;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dream11 {
	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	
	driver.get("https://www.dream11.com/");
	Thread.sleep(2000);
	WebElement frameId = driver.findElement(By.xpath("//iframe[@id='send-sms-iframe']"));
	driver.switchTo().frame(frameId);
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("123456");
	
	
	driver.findElement(By.xpath("//a[@id='regUser']")).click();
	String error = driver.findElement(By.xpath("//label[@id='errorMob']")).getText();
	System.out.println(error);
	
	driver.switchTo().parentFrame();
	WebElement about = driver.findElement(By.xpath("//a[text()='About Us']"));
    Actions act=new Actions(driver);
    act.scrollToElement(about).perform();
    
    
    
    
		
	
	
	
	
    
	
	
	
	
	
	}
}
