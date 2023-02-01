package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText2 {

	public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
driver.manage().window().maximize();
                  String actualText = driver.findElement(By.xpath("//h1[text()='Practice Page']")).getText();
                  String expectedText="practice page";
                  System.out.println("actual text is ");
                  if(actualText.equals(expectedText))
                	  System.out.println("text is matching amd TC is passed");
                  else 
                  {
                	  System.out.println("text is not matching amd TC is failed");
// ithe elese vala statement execute hoil karan ki he case sensitive aste..apan expected text jar p ha capital ghetala asta tr if wala execute zala asta               	  
                  }
	}

}
