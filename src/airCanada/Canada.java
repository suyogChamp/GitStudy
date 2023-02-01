package airCanada;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Canada {

	public static void main(String[] args) {


		  System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	      driver.get("https://www.aircanada.com/us/en/aco/home.html");
	      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(3000));
	     // WebElement iframe = driver.findElement(By.xpath("//iframe[@id='lightningjs-frame-usabilla_live']"));
	      //driver.switchTo().frame(iframe);
	      driver.switchTo().frame(2);
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		
		
		
		
		
		
		
	}

}
