package PRACTICE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class close {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/23");
		driver.findElement(By.id("compare")).click();
		
	}

}
