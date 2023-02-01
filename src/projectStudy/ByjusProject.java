package projectStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByjusProject {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvDKnjlMf8wBzzgHVl0xSnQn2iwhcxA99UMC1NGMO5ld3UfQRyBl3rBoCOewQAvD_BwE");
		Thread.sleep(500);
		
		// scrolling
		
		WebElement scroll = driver.findElement(By.xpath("Watch video lessons "));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0],scrollIntoView(true)",scroll);
		
		Select sel=new Select(scroll);
		for(int i=0;i<7;i++)
		{
			sel.selectByIndex(i);
			System.out.println(i);
			Thread.sleep(500);
		 WebElement videos = driver.findElement(By.xpath("//div[@class='row row-inline']//a"));
		 driver.ge
		 
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
