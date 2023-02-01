package pomNeoStox;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListStudy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
		
		WebElement Tata1 = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-nowrap ps-1'])[1]"));
		WebElement Tata2 = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-nowrap ps-1'])[2]"));
		WebElement Tata3 = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-nowrap ps-1'])[3]"));
		WebElement Tata4 = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-nowrap ps-1'])[4]"));
		WebElement Tata5 = driver.findElement(By.xpath("(//div[@class='col-sm-6 text-nowrap ps-1'])[5]"));
		List<String> searchlist=new ArrayList<>();
		searchlist.add(Tata1.getText());
		searchlist.add(Tata2.getText());
		searchlist.add(Tata3.getText());
		searchlist.add(Tata4.getText());
		searchlist.add(Tata5.getText());
		System.out.println(searchlist);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
