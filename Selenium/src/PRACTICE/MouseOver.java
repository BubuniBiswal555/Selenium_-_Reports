package PRACTICE;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {
	public static void main(String[] args) {
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		WebElement fashion = driver.findElement(By.xpath("//span[.='Login']"));
		
		Actions act =  new Actions(driver);
		act.moveToElement(fashion).perform();
		WebElement giftcard = driver.findElement(By.linkText("My Profile"));
		giftcard.click();
	}

}
