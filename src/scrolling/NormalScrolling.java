package scrolling;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalScrolling {

	private static final String JavascriptExecutor = null;

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
        driver.get("https://en.wikipedia.org/wiki/India");
        
      //type cast driver object into JavaScriptExecutor and store in ref variable
         
	}

}
