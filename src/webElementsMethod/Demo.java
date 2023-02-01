package webElementsMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys("hello");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='autocomplete']")).clear();
		Thread.sleep(2000);

		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(2000);

		String actualtext = driver.findElement(By.xpath("//h1[text()='Welcome To Practice Page']")).getText();
		System.out.println("actual text is "+actualtext);
		String expectedtext="Welcome To Practice Page";
		if(actualtext.equals(expectedtext))
			System.out.println("text is matching and hence TC is passed");
		else {
			System.out.println("text is not matching and hence TC is failed");
		}
	}

}
