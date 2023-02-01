package calenderHandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWay {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("onward_cal")).click();
        
        List<WebElement> dates = driver.findElements(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr/td"));
        
       int totalElements = dates.size();
        
        for(WebElement d:dates)
        {
           String expectedDate="31";
        String actualDate = d.getText();
        	
        	if(expectedDate.equals(actualDate))
        	{
        		d.click();
        	}
        }
        
        
        // ithe apalyale kontihi date lagali t fkt aplyale aplyale expected date ch change kara lagate
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
