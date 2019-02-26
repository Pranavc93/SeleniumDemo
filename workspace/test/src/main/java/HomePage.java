import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FlightFinderPage.FlightFinderPage;

public class HomePage 
{
WebDriver driver;
By userName = By.name("userName");
By password = By.name("password");
By loginButton =By.name("login");

public HomePage(WebDriver driver)
{
	this.driver = driver;
}

//Login method
public FlightFinderPage loginUser(String uname,String pwd)
{
	driver.findElement(userName).sendKeys(uname);
	((WebElement) driver.findElements(password)).sendKeys(pwd);
	driver.findElement(loginButton).click();
	
	return new FlightFinderPage(driver);
}
}
