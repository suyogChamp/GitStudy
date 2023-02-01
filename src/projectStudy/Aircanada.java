package projectStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Aircanada {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.aircanada.com/ca/en/aco/home");
		Thread.sleep(15000);
		

		WebElement scroll = driver.findElement(By.xpath("//div[@class='bkmg-flights-tab-promo-code-input']"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", scroll);
		
		driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
		Thread.sleep(1500);
		
	//	driver.findElement(By.xpath("//input[@class='abc-form-element-input abc-form-element-main text-transform-none ng-untouched ng-pristine ng-valid']")).sendKeys("Delhi DLR");
	//	Thread.sleep(1500);
		
		driver.findElement(By.xpath("(//input[@class='abc-form-element-input abc-form-element-main text-transform-none ng-untouched ng-pristine ng-valid ng-star-inserted'])[3]")).sendKeys("Toronto YTZ");
		Thread.sleep(1500);

	}

}
