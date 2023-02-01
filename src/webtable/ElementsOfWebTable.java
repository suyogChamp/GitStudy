package webtable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementsOfWebTable {

	private static final WebDriver JavascriptExecutor = null;

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://vctcpune.com/selenium/practice.html");
        driver.manage().window().maximize();
        Thread.sleep(1000);
       
        List<WebElement> table = driver.findElements(By.xpath("//table[@id='product']//tr"));
        
        for(WebElement t:table)
        {
        	System.out.println(t.getText());
        	
        }
        
        System.out.println("no.of rows in table "+table.size());
        
        System.out.println("====================================================");
        
        //no. of columns in table and we know no.of column is equal to headers
        
        List<WebElement> headers = driver.findElements(By.xpath("//table[@id='product']//tr[1]/th"));
        
        
        for(WebElement h:headers)
        {
        	System.out.println(h.getText());
        }
        
        System.out.println("no.of headers "+headers.size());
        
        
        
		
	}

	
	

}
