package poppus;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
        
        driver.findElement(By.name("iframeResult"));
        driver.findElement(By.xpath("//button[text()='Try it']")).click();
        
           Alert popup = driver.switchTo().alert();
           popup.sendKeys("Bubun");
           popup.accept();
	}

}
