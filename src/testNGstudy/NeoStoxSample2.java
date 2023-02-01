package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class NeoStoxSample2 {
  @Test
  public void NeoStoxLaunch() throws InterruptedException
  {System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://neostox.com/");
	Thread.sleep(2000);
	
      //System.out.println("hello its a sprinting statement");// he fakt console madhe disanar..report madhe nhi
	
	// jar aplyala sprinting statement report madhe pn disli pahije t mg ek new method ahe
	// Reporter mhanun
      
      //Reporter.log("hi this is reporter", true);
      //Reporter.log("hii hello");
	
	Reporter.log("hello its a reporter", false);
      
      
      
      
      
  }
}      // ha ahe testNG cha class...
       
      // ya madhe aaplyala automatic test report milato
