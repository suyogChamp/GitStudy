package listbox_dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		WebElement month = driver.findElement(By.id("month"));
		Select s=new Select(month);
		
		for(int i=0;i<=11;i++)
		{
			s.selectByIndex(i);
			
			
		}
		System.out.println("===================================================");
		
		List<WebElement> month1 = driver.findElements(By.xpath("//select[@id='month']/option"));
		
		for(WebElement m:month1)
		{
			System.out.println(m.getText());
		}
		
		System.out.println("==============================================");
		System.out.println("number of months in list are "+month1.size());
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
