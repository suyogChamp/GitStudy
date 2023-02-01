package iframe_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class NestedIframe {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		Thread.sleep(500);
		
		//focusing to frame 1
		
		driver.switchTo().frame("frame1");
		Thread.sleep(500);

		driver.findElement(By.tagName("input")).sendKeys("selenium");
		
		//focusing to child frame
		
		driver.switchTo().frame("frame3");
		Thread.sleep(500);
		driver.findElement(By.id("a")).click();
		
		//focusing to main page
		
		driver.switchTo().defaultContent();
		Thread.sleep(500);
		String text = driver.findElement(By.xpath("//span[text()='Not a Friendly Topic']")).getText();
		
		System.out.println(text);
		
		//focusing to second frame
		
		driver.switchTo().frame("frame2");
		Thread.sleep(500);
		WebElement list = driver.findElement(By.id("animals"));
		
		Select sel=new Select(list);
		sel.selectByIndex(1);
		Thread.sleep(500);
		sel.selectByVisibleText("Big Baby Cat");
		Thread.sleep(500);
		sel.selectByValue("avatar");
		
		
		
		
		
		
		

	}

}
