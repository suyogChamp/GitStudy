package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Paytm {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://paytm.com/");
        driver.manage().window().maximize();
        
        List<WebElement> paytmHome = driver.findElements(By.xpath("(//div[@class='_3noxt'])[1]/div"));
        
        for(WebElement a:paytmHome)
        {
        	System.out.println(a.getText());
        }
        
        
        
        
        
	}

}
