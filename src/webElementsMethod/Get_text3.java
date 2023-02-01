package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_text3 {

	public static void main(String[] args) {
  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.cricbuzz.com/");
   String text = driver.findElement(By.xpath("//h4[text()='Featured Matches']")).getText();
 System.out.println("actual text is "+text);
 String expectedtext="FEATURED MATCHES";
 if(text.equals(expectedtext))
	 System.out.println("text is matching and TC is passed");
 else
	 {System.out.println("text is not matching TC is failed");
	}
 


	}

}
