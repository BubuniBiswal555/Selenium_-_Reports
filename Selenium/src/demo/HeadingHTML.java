package demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HeadingHTML {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String title = driver.getTitle();
	if(title.equals("Facebook – log in or sign up"))
		System.out.println("facebook web page is displayed");
	else
		System.out.println("facebook web page is not displayed");
	driver.findElement(By.partialLinkText("non-users")).click();
	int size=0,h=0;
	for(int i=1;i<=6;i++)
	{
		List<WebElement> allh = driver.findElements(By.tagName("h"+i));
		size= allh.size();
		h=h+size;
		
	}
	System.out.println("total "+h);
	}}

