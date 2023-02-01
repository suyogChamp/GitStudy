package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBtestng {
  
	@Parameters("browserName")
	@Test
  public void CBTest(String bName) 
  {
		
	  WebDriver driver = null;
	  
	  if(bName.equals("chrome"))
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			 driver = new ChromeDriver();
			
	  }
	  else if (bName.equals("firefox"))
	  {
		  System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
		  //object creation
			 driver = new FirefoxDriver();
			
	}
	  driver.manage().window().maximize();
		//launch URL
		driver.get("https://vctcpune.com/");
  }
} // ata yachi xml file tayar karun tyamadhe "parameter" he tag add karayach tyach name dyayach
// nantr tyachi value dyayachi...tr ti je value ahe ektr "chrome" dyayachi kivha "firefox" dyayachi
// tya value nusar te firefox kivha chrome madhe launch honar
// or apan yach serial parallel execution sudhha karu shakto

