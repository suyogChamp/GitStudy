package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NumOfImagesOnWebPage {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/search?q=shoes+for+men+formal&rlz=1C1RXQR_enIN1018IN1018&sxsrf=AJOqlzW0cIE1qSvLA9q8eiLzxI3HeplCog:1673083634901&source=lnms&tbm=isch&sa=X&ved=2ahUKEwiim_OdkrX8AhXSaGwGHfi2DwcQ_AUoAnoECAEQBA&biw=1536&bih=446&dpr=1.25");
        driver.manage().window().maximize();
        Thread.sleep(1000);
        
        // tagname of image is always ===> <img
        
        
        List<WebElement> images = driver.findElements(By.tagName("img"));
        
        System.out.println("no. of images on webpage are "+images.size());
        
        
       
        
        
        
        
        
	}

}
