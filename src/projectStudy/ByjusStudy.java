package projectStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ByjusStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/byjus-classes-book-free-60-mins-class/?utm_source=google&utm_mode=CPA&utm_campaign=K10-IN-Brand-BYJU%27S-USD-Exact&utm_term=byjus&gclid=CjwKCAjwv4SaBhBPEiwA9YzZvDKnjlMf8wBzzgHVl0xSnQn2iwhcxA99UMC1NGMO5ld3UfQRyBl3rBoCOewQAvD_BwE");
		Thread.sleep(1500);
		
		WebElement scrollView = driver.findElement(By.xpath("//p[text()='Select a class']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		js.executeScript("arguments[0].scrollIntoView(true)", scrollView);
		
		Thread.sleep(1500);
		
		WebElement dropbox = driver.findElement(By.xpath("//select[@class='form-control video-selection']"));
		Thread.sleep(1500);
		dropbox.click();
		
		Select dropdown=new Select(dropbox);
		for(int i=0;i<=7;i++)
		{
			dropdown.selectByIndex(i);
			System.out.println(i);
			Thread.sleep(500);
		}
		
//	 dropdown.selectByVisibleText("Class 5");
	// Thread.sleep(500);
//	 
	// driver.findElement(By.xpath("(//a[@class='video-thumbnail'])[3]")).click();
	 
	 //Thread.sleep(1500);
	 
	 //driver.switchTo().frame(0);
	 
	 
	 //Thread.sleep(3500);
	 
	 
	 String VideoTitle = driver.findElement(By.xpath("//a[@class='ytp-title-link yt-uix-sessionlink']")).getText();
	 
	 
	 System.out.println(VideoTitle);
	 
	 Thread.sleep(1000);
	 
	// driver.findElement(By.xpath("(//button[@type='button'])[14]")).click();
	// Thread.sleep(500);

	// driver.switchTo().defaultContent();
	// Thread.sleep(500);
	 
	 driver.findElement(By.xpath("(//a[text()='Book a FREE Class'])[7]")).click();
	 Thread.sleep(500);
	 
	 driver.findElement(By.xpath("(//input[@class='form-control'])[1]")).sendKeys("Saurabh");
	 Thread.sleep(500);
	 driver.findElement(By.xpath("(//input[@class='form-control'])[2]")).sendKeys("7767922279");
	 Thread.sleep(9500);
	 WebElement otp = driver.findElement(By.xpath("button[@class='btn'])[1]"));
	 otp.click();

	 driver.findElement(By.xpath("(//input[@class='form-control'])[3]")).sendKeys("kulkarnisaurabh08@gmail.com");
	 
	 WebElement statedropdown = driver.findElement(By.xpath("//select[@class='form-control'][1]"));
	 
	 Select statedropdown1=new Select(statedropdown);
		
	 statedropdown1.selectByVisibleText("Maharashtra");
	 
	 Thread.sleep(500);
	 
	 driver.findElement(By.xpath("//button[text()='Try Now']")).click();
	}

}
