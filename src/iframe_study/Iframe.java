package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Iframe {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
driver.get("https://vctcpune.com/selenium/practice.html");
driver.switchTo().frame("courses-iframe");
      String acttext = driver.findElement(By.xpath("//h3[contains(text(),'For Velocity class inquiry ')]")).getText();
		String exptext="For Velocity class inquiry please contact on below numbers";
		if(acttext.equals(exptext))
			System.out.println("text is matching and hence TC is passed");
		else {
			System.out.println("text is not matching and TC is failed");
		}
		
		driver.switchTo().defaultContent();
		
		String text = driver.findElement(By.xpath("//legend[text()='iFrame Example']")).getText();
				System.out.println(text);
	}

}
