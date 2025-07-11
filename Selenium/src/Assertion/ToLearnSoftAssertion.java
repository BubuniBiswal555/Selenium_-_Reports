package Assertion;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class ToLearnSoftAssertion {
	@Test
	public void login() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.linkText("Log in")).click();
		
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(driver.getTitle(),"Demo Web Shop. Login","login page is not diplayed");
		
		driver.findElement(By.id("Email")).sendKeys("abcc@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		soft.assertEquals(driver.getTitle(), "Demo Web Shop","Home Page should be displayed");
		soft.assertAll();
	}

}
