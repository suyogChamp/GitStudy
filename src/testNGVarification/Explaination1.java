package testNGVarification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Explaination1 {
  @Test
  public void f() throws InterruptedException 
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		WebElement radio1 = driver.findElement(By.xpath("//input[@value='Radio1']"));
		
		if(radio1.isSelected())
		{
			Reporter.log("radio1 is selected and Tc is passed", true);
		}
		else
		{
			Reporter.log("radio1 is not selected and Tc is failed", true);
			
		}
  }
}// tu jar console pahshil tar else wala statement execute zal
//mnje apali test case fail zali
// pan tech jar testng madhe pahshil tr test case execute zali ahe

// he kas ky
// tar testng ch kam ahe fakt jo code lihila ahe te execute karan..tyachymule to test case passed zali asch sangnar ahe
// he je console ani testng madhe difference disat ahe te tesng ani class madhe co ordination hot naslyamule hote..
// mhanun mag jar apan ekhadi gosht testng madhe validate karat asel tr yachyat if statment chalat nhi

// tar yachyavr solution mhanun aplyakade testng madhe "Verification" mhanun ek featuure ahe
