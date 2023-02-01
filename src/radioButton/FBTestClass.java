package radioButton;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FBTestClass {
	
	WebDriver driver;
	FBPOM1 logIn;
	FBPOM2 signIn;
	
	@BeforeMethod
	public void LaunchingApp()
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	    driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");
      logIn=new FBPOM1(driver);
      signIn=new FBPOM2(driver);
      logIn.clickoncreateButton();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      signIn.clickOnRadioButton();
      
	}
	
  @Test
  public void ValidatingRadioButton() 
  {
	  Assert.assertTrue(false, "button is clicked");// apali radio button click ahe pn apan ithe boolean condition false ghetali mhanun he fail honar 
  }
  
  @Test
  public void ValidatingRadioButton2() 
  {
	  Assert.assertTrue(true,"button is not clicked");
  }
  
  
  
  
  
  
  
  
  
  
  
  

  
}
