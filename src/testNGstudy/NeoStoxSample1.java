package testNGstudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxSample1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
	}
         // HA ZALA SADHA CLASS testNG CHA
	// ATA YACHYANANTR APAN PAHANAR AHE KI testNG CHA CLASS KASA ASTO...SAMPLE2 CLASS MADHE
}
