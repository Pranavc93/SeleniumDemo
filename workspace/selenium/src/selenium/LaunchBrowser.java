package selenium;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class LaunchBrowser 

{
	@Test
	public void openChrome() 
	{
		
		System.setProperty("webdriver.chrome.driver", "C:\\WebDriver");
		//ChromeDriver driver=new ChromeDriver();
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		 //((Object) driver).get("https://www.google.com");
	}
}
