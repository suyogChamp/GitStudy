package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GoIndigo {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.goindigo.in/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("pune");
		Actions act=new Actions(driver);
		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);
		//driver.findElement(By.xpath("(//input[@type='text'])[11]")).clear();
		//driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("20 Jan 2023");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(15000));
		driver.findElement(By.xpath("(//button[text()='Login'])[2]")).click();



		
	}

}
