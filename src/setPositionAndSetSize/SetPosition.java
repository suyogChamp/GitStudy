package setPositionAndSetSize;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPosition {

	public static void main(String[] args) throws InterruptedException {
     
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        // default position of window
        
        Point defaultposition = driver.manage().window().getPosition();
        System.out.println("default position of window "+defaultposition);
        Thread.sleep(2000);
        // CHANGING POSITION OF WINDOW
        
        //creating object of POINT class
        
        Point p =new Point(100, 9);
          driver.manage().window().setPosition(p);
          Thread.sleep(2000);

        
        Point p1=new Point(200,300);
        driver.manage().window().setPosition(p1);
        
        //new position of window
        
        Point newposition = driver.manage().window().getPosition();
        System.out.println("new position of window is "+newposition);

        
	}

}
