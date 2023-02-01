package airCanada;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CanadaAirTest {
	
	WebDriver driver;
	CanadaPOMClass home;
	
  @Test
  public void verifyingRadioButton() 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
      driver.get("https://www.aircanada.com/us/en/aco/home.html");
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	  
      home=new CanadaPOMClass(driver);
      
      Assert.assertTrue(home.clickOnRadioButton(), "radio button is not clicked");
	  
      
      
      
  }
}
