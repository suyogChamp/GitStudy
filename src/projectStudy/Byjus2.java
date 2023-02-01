package projectStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Byjus2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvDKnjlMf8wBzzgHVl0xSnQn2iwhcxA99UMC1NGMO5ld3UfQRyBl3rBoCOewQAvD_BwE");
		Thread.sleep(1500);

		
		
		
		 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Saurabh");
		 Thread.sleep(500);
		// driver.findElement(By.xpath("(//input[@name='mobile']")).sendKeys("7767922279");
		 Thread.sleep(500);
		// WebElement otp = driver.findElement(By.xpath("button[@class='btn'])[1]"));
	//	 otp.click();
		 Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kulkarnisaurabh08@gmail.com");
		 
		 WebElement statedropdown = driver.findElement(By.xpath("//select[@class='form-control'][1]"));
		 
		 Select statedropdown1=new Select(statedropdown);
			
		 statedropdown1.selectByVisibleText("Maharashtra");
		 
		 Thread.sleep(500);
		 
		// driver.findElement(By.xpath("//button[text()='Try Now']")).click();
		}
	}


