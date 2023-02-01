package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList1 {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        driver.findElement(By.name("q")).sendKeys("shoes for");
        Thread.sleep(500);
      List<WebElement> results = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		
      for(WebElement a:results)
      {
    	  System.out.println(a.getText());
      }
		
    System.out.println(results.size());
		
    
		for(WebElement shoes:results)
		{
			String expected="shoes for men formal";
			String actual = shoes.getText();
			if(expected.equals(actual))
			{
				shoes.click();
				break;
			}
			
		}
		Thread.sleep(500);
		driver.findElement(By.linkText("Images")).click();
		
		
		
		
	}

}
