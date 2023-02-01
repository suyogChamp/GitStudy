package chromeoptionsStudy;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Eg2 {

	public static void main(String[] args) {

		// in this we will see how to use more than one desired capability
		
		ChromeOptions opt=new ChromeOptions();
		
		ArrayList<String> al=new ArrayList<>();
		al.add("--incognito");
		al.add("--start-maximized");
		opt.addArguments(al);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(opt);    //...(2)
        driver.get("https://paytm.com/");
        
        WebElement text = driver.findElement(By.xpath("//a[text()='Paytm for Consumer']"));
        
        System.out.println(text.getText());
        
        
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
