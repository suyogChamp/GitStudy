package pomNeoStox;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeoStoxTestClass {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {

		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://neostox.com/");
		Thread.sleep(2000);

		// Create object of homepage
		 
		NeoStoxHomePage home = new NeoStoxHomePage(driver);
		home.clickOnSignInButton();
		
		// Create object of signIn page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		NeoStoxSignInPage signIn =new NeoStoxSignInPage(driver);
		signIn.EnterMobileNo();
		signIn.clickOnSignInButton();
		
		// Create object of password page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		NeoStoxPasswordPage password =new NeoStoxPasswordPage(driver);
		password.enterPassword();
		password.clickOnSubmitButton();
		
		// Create object of dash board page
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

		
		NeoStoxDashBoardPage dashBoard =new NeoStoxDashBoardPage(driver);
		dashBoard.handlePopUp();
		dashBoard.validateText();
		dashBoard.clickOnLogOutButton();
		
		driver.close();
				
		
	}

}
