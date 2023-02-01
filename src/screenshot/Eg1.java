package screenshot;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(500);
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  //......he temporay madhe save hoil karan ki apan yala kuthe save karach te sangitlch nhi
          // yala jar apan print kel tr he jithe save hoil to path aplyala output madhe milnar
		//System.out.println(source);
		
		//ata aplyale to screenshot kuthe thevayacha te path dyayachi ahe
		// t tyachyasathi aplyale file class cha object create kara lagan
		
		File destination=new File("C:\\Selenium\\ScreenShot\\first.png");
		
		//ata source madhala screenshot aplyale destination madhe pathva laganar
		// tr tya sathi apan "FileHandler" navacha class gheto
		
         org.openqa.selenium.io.FileHandler.copy(source, destination);		
		
		
		
		
		
		
		
	}

}
