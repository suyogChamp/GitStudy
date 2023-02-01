package calenderHandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWay {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.redbus.in/");
        driver.manage().window().maximize();
        
        driver.findElement(By.id("onward_cal")).click();
        Thread.sleep(3000);
        
        driver.findElement(By.xpath("//table[@class='rb-monthTable first last']/tbody/tr[7]/td[7]")).click();
        
        // ata hi method ji ahe ti 29paryant ch chalel 30 jan vari la ti date disable 
        //houn jail mnun apan dynamic way use karayacha
        
        
        
        
        
        
        
        
        
        
	}

}
