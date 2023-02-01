package projectStudy;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstAssignment {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvDKnjlMf8wBzzgHVl0xSnQn2iwhcxA99UMC1NGMO5ld3UfQRyBl3rBoCOewQAvD_BwE");
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
		driver.manage().window().maximize();
		
		// scroll into view
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement scroll = driver.findElement(By.xpath("//h2[text()='Watch video lessons ']"));
		js.executeScript("arguments[0].scrollIntoView(true)",scroll);
		
		// dropdown handle
	
		WebElement clas = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
		clas.click();
		Select s=new Select(clas);
		s.selectByVisibleText("Class 5");
		driver.findElement(By.xpath("(//a[@class='video-thumbnail'])[3]")).click();
		Thread.sleep(800);
		
		driver.switchTo().frame(0);
		WebElement video = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']"));
		video.getText();
		syso
		
	}

}
