package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.uitestpractice.com/");

		Actions act = new Actions(driver);

		WebElement doubleclickbutton = driver.findElement(By.name("dblClick"));

//act.doubleClick(doubleclickbutton).perform();

		// OR
		act.moveToElement(doubleclickbutton).doubleClick().build().perform();

	}

}
