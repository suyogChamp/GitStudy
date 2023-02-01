package dynamicElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goindigo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.goindigo.in/");
        Thread.sleep(500);

        driver.manage().window().maximize();
        Thread.sleep(500);
        
        
        driver.findElement(By.xpath("(//input[@type='text'])[9]")).sendKeys("Nagpur (NAG)");
        Thread.sleep(500);

        driver.findElement(By.xpath("(//input[@type='text'])[10]")).sendKeys("Kolkata (CCU)");
        Thread.sleep(500);

        driver.findElement(By.xpath("(//input[@type='text'])[11]")).sendKeys("20 Jan 2023");
        Thread.sleep(500);

        driver.findElement(By.xpath("(//input[@type='submit'])")).click();

	}

}
