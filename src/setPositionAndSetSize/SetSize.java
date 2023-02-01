package setPositionAndSetSize;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetSize {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        
        // Getting default size of window
        
       Dimension defaultSize = driver.manage().window().getSize();
       System.out.println("default size of window is "+defaultSize);
       
       // SET SIZE OF WINDOW
       
       // creating object of dimension class
       
       Dimension d = new Dimension(400,200);
       driver.manage().window().setSize(d);
       System.out.println("new size of window is "+d);
       
       Dimension currentsize = driver.manage().window().getSize();
       System.out.println("current size of window "+currentsize);
	}

}
