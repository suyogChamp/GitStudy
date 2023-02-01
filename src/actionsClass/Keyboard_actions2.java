package actionsClass;

import java.util.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_actions2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement signinbutton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		Actions act = new Actions(driver);
		act.click(signinbutton).perform();
		Thread.sleep(1000);
		WebElement day = driver.findElement(By.id("day"));
		act.click(day).perform();
		for (int i = 0; i <= 8; i++) {
			act.sendKeys(Keys.ARROW_DOWN).perform();
			Thread.sleep(1000);

		}
		act.sendKeys(Keys.ENTER).perform();

	}

}
