package listbox_dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@id,'u_0_0')]")).click();
		Thread.sleep(2000);
		WebElement day = driver.findElement(By.id("day"));
		//apan ashhhya prakare sudhha locator gheu shakto
		
		//select ha selenium cha ch class ahe
		Select s=new Select(day);
		s.selectByVisibleText("26");
		
		
		//now selecting month
		WebElement month = driver.findElement(By.id("month"));
		Select s1 = new Select(month);
		s1.selectByIndex(5);
		
		
		//now selecting year
		WebElement year = driver.findElement(By.id("year"));
		Select s2=new Select(year);
		s2.selectByValue("1997");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
