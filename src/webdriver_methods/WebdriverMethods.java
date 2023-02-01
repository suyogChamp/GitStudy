package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverMethods {

	public static void main(String[] args) throws InterruptedException {
         System.setProperty("webdriver.chrome.driver", "C:\\\\Selenium\\\\chromedriver.exe");

          WebDriver driver=new ChromeDriver();
           driver.get("https://vctcpune.com/");
          Thread.sleep(2000);
     //driver.close();
	//driver.get("https://www.cricbuzz.com/");
//	Thread.sleep(2000);
  //  driver.get("https://www.google.com/");
   // Thread.sleep(2000);
    //driver.navigate().back();
   // Thread.sleep(2000);
  //driver.navigate().forward();
  //Thread.sleep(2000);
  //driver.navigate().refresh();
         // driver.quit();
          //String title = driver.getTitle();
         // System.out.println("title of site is "+title);

    String url = driver.getCurrentUrl();
    System.out.println("current url is "+url);

	
	
	}

}
