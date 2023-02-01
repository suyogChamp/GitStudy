package scrolling;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_into_view {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/");
		Thread.sleep(500);
		driver.manage().window().maximize();
		Thread.sleep(500);

		JavascriptExecutor je = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//strong[text()='Katraj Branch']"));
		
		je.executeScript("arguments[0].scrollIntoView(true);",scroll);
	}

}
