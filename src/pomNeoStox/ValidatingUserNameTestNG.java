package pomNeoStox;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidatingUserNameTestNG {
	
	// globally declaring objects
 WebDriver driver; //2
 NeoStoxHomePage home;
 //(5)
 NeoStoxSignInPage signIn;
 NeoStoxPasswordPage pwd;
 NeoStoxDashBoardPage dash;
 File myFile;       //...(8) 	
 Sheet mySheet;     //...10
	
	
	@BeforeClass
	public void LaunchingApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); //..1
		//WebDriver driver = new ChromeDriver();.....aplyale driver ya object ch khup vela kam padnar ahe
		// mhanun yala globally declare karayach
		driver=new ChromeDriver();  // yala object ch initialization manatat (3)
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
		// ata aplyale sign in vr click kara lagan..ani ata apan home page vr ahe t aplyale tya class cha object create kara lagan
		// to pan globally ch kara lagan
		home=new NeoStoxHomePage(driver);//(4)
		//apan aplyale je objects laganar ahe tyanna ithe initialize karu shakato
		//(6)
		signIn=new NeoStoxSignInPage(driver);
		pwd=new NeoStoxPasswordPage(driver);
		dash=new NeoStoxDashBoardPage(driver);
		
		// ata apan home page vr ahe t tya class madhlya method la call kr ..(7)
		home.clickOnSignInButton();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
	}
	
	@BeforeMethod
	public void LoginToNeostox() throws EncryptedDocumentException, IOException
	{// ata apan sign in page vr alo ahe
		signIn.EnterMobileNo();// ithe aplyale mobile no. excel sheet madhun ghyayacha ahe..
		
	}
	
	
	@Test
  public void validateUserName() 
	{
		
  }
	@AfterMethod
	public void LogOutFromNeostox()
	{
		
	}
	@AfterClass
	public void ClosingBrowser()
	{
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
