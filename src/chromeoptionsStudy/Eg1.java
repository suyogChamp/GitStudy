package chromeoptionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eg1 {

	public static void main(String[] args) {
		
		// Headless concept
		
		//first we have to create object of chromeoption class.....(1)
		
		ChromeOptions opt=new ChromeOptions();
		
		// now object is passed as argument in chromedriver....(2)
		
		//now use desired capability by calling arguments method with help of object...(3)
		opt.addArguments("--incognito");

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);    //...(2)
        driver.get("https://paytm.com/");
        
        WebElement text = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
        
        System.out.println(text.getText());
        
        
	}

}
