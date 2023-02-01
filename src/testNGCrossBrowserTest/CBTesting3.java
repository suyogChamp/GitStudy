package testNGCrossBrowserTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CBTesting3 {
	@Parameters("browserName")
	@Test
	public void cbTest(String bName) {

		WebDriver driver = null;
		if (bName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
			// object creation
			driver = new ChromeDriver();

		} else if (bName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\geckodriver.exe");
			// object creation
			driver = new FirefoxDriver();

		}

		driver.manage().window().maximize();
		// launch URL
		driver.get("https://vctcpune.com/");

	}
}
