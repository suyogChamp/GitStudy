package actionsClass;

import java.security.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_Actions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement SignInButton = driver.findElement(By.xpath("//a[text()='Create New Account']"));

		Actions act = new Actions(driver);
		act.click(SignInButton).perform();
		Thread.sleep(1000);

		WebElement day = driver.findElement(By.id("day"));
		act.click(day);
		Thread.sleep(1000);
//   act.sendKeys(day, Keys.ARROW_DOWN).sendKeys(day, Keys.ARROW_DOWN).build().perform();// ekach line madhe
		// Thread.sleep(1000);

		// jithe aplyale date change karayach ahe tithe by dafault ajachi date yenar ahe
		// mnje 12
		// jar aplyale tithe 14 date dyayachi asel tr aplyala 2ne down ya lagnar
		// mhanun apan tithe ekach lline madhe don da method lihili ahe
		// apan tyanna seperate pn lihu shakto

		// act.sendKeys(Keys.ENTER).perform();

		// seperate kas lihayach

		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.ARROW_DOWN).perform();
		Thread.sleep(1000);

		act.sendKeys(Keys.ENTER).perform();
		Thread.sleep(1000);

	}

}
