package listbox_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectable {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		WebElement scroll = driver.findElement(By.xpath("//b[text()='Standard multi select']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		Thread.sleep(1000);
		
WebElement multi = driver.findElement(By.id("cars"));		
		Select s=new Select(multi);
		
		System.out.println("multiselection status is "+s.isMultiple());
		Thread.sleep(1000);

		s.selectByIndex(0);
		Thread.sleep(1000);

		s.selectByValue("saab");
		Thread.sleep(1000);

		s.selectByVisibleText("Opel");
		Thread.sleep(1000);

		
		// now we will see how to deselect===> it is applicable only to Multiselectable dropdown
		
		s.deselectByIndex(2);
		Thread.sleep(1000);
		s.deselectByValue("volvo");
		Thread.sleep(1000);
		s.deselectByVisibleText("Saab");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
