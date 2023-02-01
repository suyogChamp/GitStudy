package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtestng2 {
	@Parameters("browserName")
	@Test
	public void cbTesting(String bName)
	{
	WebDriver driver = null;
	if(bName.equals("chrome"))
	{
	System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\20 aug even\\selenium\\chromedriver.exe");
	//created object of chromedriver
	driver= new ChromeDriver();
	}
	else if (bName.equals("firefox"))
	{
	System.setProperty("webdriver.gecko.driver", "D:\\Velocity\\Java Class\\20 aug even\\selenium\\geckodriver.exe");
	//created object of firefox driver
	driver= new FirefoxDriver();
	}
	driver.manage().window().maximize();
	//launch url
	driver.get("https://vctcpune.com/selenium/practice.html");
  
  }
}
