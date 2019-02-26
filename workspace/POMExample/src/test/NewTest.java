package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Guru99HomePage;
import pages.Guru99Login;

public class NewTest 
{
  WebDriver driver;
  Guru99Login objLogin;
  Guru99HomePage objHomePage;
  @BeforeTest
  public void setup()
  {
	  ChromeDriver driver= new ChromeDriver();
	  ((WebDriver) driver).get("http://demo.guru99.com/V4/");
  }
	  
@Test
  public void test()
  {
	objLogin = new Guru99Login(driver);
	
	String loginPageTitle = objLogin.getLoginTitle();
    Assert.assertTrue(loginPageTitle.toLowerCase().contains("guru99 bank"));
    
    objLogin.loginToGuru99("mgr123", "mgr!23");
    objHomePage = new Guru99HomePage(driver);
    Assert.assertTrue(objHomePage.getHomePageDashboardUserName().toLowerCase().contains("manger id : mgr123"));
  }
}
