package airCanada;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GF {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
	  WebDriver  driver = new ChromeDriver();
      driver.get("https://www.facebook.com/");	
      driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
      driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
      int count = driver.findElements(By.xpath("//input[@type='radio']")).size();
       System.out.println(count);
       
       for(int i=0;i<count;i++)
       {
    	 driver.findElements(By.xpath("//input[@type='radio']")).get(i).click();
    	   
    	   Thread.sleep(1000);
       }
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
    	   
}}
