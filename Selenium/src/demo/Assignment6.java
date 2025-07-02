package demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Assignment6 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		String url = driver.getCurrentUrl();
		if(url.equals("https://demowebshop.tricentis.com/"))
			System.out.println("url is matched");
		else
			System.out.println("url does not match");
		driver.findElement(By.cssSelector("input[value='Vote']")).click();
	}
	}


