package projectStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Profile_User_Story {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://byjus.com/learn/profile");
		Thread.sleep(200);
		
		driver.findElement(By.xpath("//input[@class='phone-text-input  form-control']")).sendKeys("8459313029");
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(25000);
        driver.findElement(By.xpath("(//button[@type='button'])[3]")).click();
        
      
        
        driver.findElement(By.xpath("(//span[text()='Suyog Vaidya'])[1]")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//span[text()='My profile']")).click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@name='fullName']")).sendKeys("Suyog Vaidya");
        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("suyogvaidya26@gmail.com");
        driver.findElement(By.xpath("//input[@name='date_of_birth']")).click();
        
        WebElement month = driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']"));
        Select m=new Select(month);
        m.selectByVisibleText("June");
        
        WebElement year = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
        Select y=new Select(year);
        y.selectByVisibleText("1997");
        
        driver.findElement(By.xpath("//div[text()='26']")).click();
        
        WebElement gender = driver.findElement(By.xpath("(//div[@class=' css-1mqiecu'])[2]"));
        Select g=new Select(gender);
        g.selectByIndex(0);
        
        WebElement city = driver.findElement(By.xpath("(//div[@class=' css-1mqiecu'])[3]"));
           Select c=new Select(city);
           c.selectByVisibleText("Pune");
           
           driver.findElement(By.xpath("//button[text()='Save']")).click();
           Thread.sleep(1000);
           
           driver.findElement(By.xpath("//img[@class='personalDetails_edit__27EUA']")).click();
           Thread.sleep(1000);
           
           driver.findElement(By.xpath("//img[@class='sc-iAbQMe crJrWV']")).click();
           Thread.sleep(500);
           
            driver.findElement(By.xpath("(//div[@class=' css-1mqiecu'])[1]")).click();
           
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
