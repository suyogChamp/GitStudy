package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Static.html");
		Thread.sleep(1000);
		
		
		Actions act=new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("(//img[@id='angular'])[1]"));
		WebElement dest = driver.findElement(By.xpath("//div[@id='droparea']"));
		
		//act.dragAndDrop(source, dest).perform();
		
		act.clickAndHold(source).moveToElement(dest).release().build().perform();
		
		
		
		
		
		
		
		
		
	}

}
