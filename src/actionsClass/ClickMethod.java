package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

// creating actions class and providing it argument of webdriver object

		Actions act = new Actions(driver);

// finding element

		WebElement signInButton = driver.findElement(By.xpath("(//a[@role='button'])[2]"));

//using click action from actions class

//act.click(signInButton).perform();

		// OR
		act.moveToElement(signInButton).click().build().perform();

	}

}
