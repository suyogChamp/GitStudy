package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Firefox {
  @Test
  public void firefoxtest() 
  {
	  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
	  //object creation
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		//launch URL
		driver.get("https://vctcpune.com/");
  }
}
