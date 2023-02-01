package dynamicElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UnorderedList {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.findElement(By.name("q")).sendKeys("honda");
        Thread.sleep(1000);
         List<WebElement> searchresults = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
        
      //  System.out.println(results);...Apan jar as print kel tr x path print hoil
        
        //pan aplyale tya list madhale nav pahije mhanun mnje ch te text pahije
        
        // ithe "FOR EACH" loop vapara lagate
        
        for(WebElement a:searchresults)
       {
        	//String names = a.getText();
        	System.out.println(a.getText());     // apan jar ithe a print kela asta t xpath ch print zala asta
        }
      System.out.println("=========================================================S");
       //  samaja aplyale tya list madhe kiti elements ahe te pahach ahe
        
       System.out.println("no. of search results are "+searchresults.size());
        
        
        //ata mala ya list madhalya "honda unicorn" la click karayach ahe t ks
        
      for(WebElement result:searchresults)
        {
       	String expected ="honda unicorn";
        	String actual=result.getText();
        	if(expected.equals(actual))
        	{
        		result.click();
        		break;
            	}
        }
        
        
        //mnje ata ya loop madhe ky hoil first result find hoil mg to expected ani actual equal ahe ky te pahil
        //jar equal nasel t nantr cha result find karel ani jevha expected equal to actual hoil tevha to tyala click karel
        // apan actual equal to expected click kelyanantr break yasathi kela to click zalyanantr pn element find karan suruch rahil ast
        //pn click kelyavr apan t dusarya page vr gelo asto mg tyala te element ch naste sapadle ani aplyala mg ekhada exception ala asta
        
        
        
       Thread.sleep(500);
        
       driver.findElement(By.linkText("Images")).click();
        
        
        
        
        
	}

}
