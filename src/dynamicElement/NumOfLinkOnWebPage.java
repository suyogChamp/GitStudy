package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v106.systeminfo.SystemInfo;

public class NumOfLinkOnWebPage {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        
        // finding number of links on webpage
        
        // remember one thing tag name of link is===> <a
        
        
        List<WebElement> links = driver.findElements(By.tagName("a"));
        
        //no.of links
       System.out.println("no.of links on webpage are "+links.size());
       
       // which are those links
       
       for(WebElement g:links)
       {
    	   System.out.println(g.getText());
       }
        
        
        
        
        
        
        
        
        
        
	}

}
