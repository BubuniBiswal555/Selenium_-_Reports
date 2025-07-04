package pollScm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class pollScmTest {
	@Test
	public void demo() {
		WebDriver driver=new ChromeDriver();
		Reporter.log("Poll scm class executed",true);
	}

}
