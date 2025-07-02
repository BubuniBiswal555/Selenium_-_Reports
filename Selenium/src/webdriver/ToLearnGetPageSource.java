package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetPageSource {
	public static void main(String[] args) {
		WebDriver drive = new ChromeDriver();
		
		drive.get("https://www.myntra.com/?utm_source=dms_google&utm_medium=searchbrand_cpc&utm_campaign=dms_google_searchbrand_cpc_Search_Brand_Myntra_Brand_India_BM_TROAS_SOK_New&gad_source=1&gclid=CjwKCAjw8IfABhBXEiwAxRHlsNxmCKvMf7dlL7DVr-vvMRkAFyd3nWiuerZqZjdkQov0WD1hp5WjHxoCVfIQAvD_BwE");
	
	     String sourceCode = drive.getPageSource();
	     System.out.println(sourceCode);
	     
	
	}

}
