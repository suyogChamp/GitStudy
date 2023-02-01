package pomNeostoxUsingDDF;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ValidateUserName {
  WebDriver driver;
  NeoStoxHomePage1 home;
  NeoStoxSignInPage2 signIn;
  NeoStoxPasswordPage3 pwd;
  NeoStoxDashBoardPage4 dash;
  File myFile;
  Sheet mySheet;
	@BeforeClass
	public void LaunchingApp() throws InterruptedException, EncryptedDocumentException, IOException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); //..1
		driver=new ChromeDriver();  		
		driver.get("https://neostox.com/");
		Thread.sleep(2000);
		Reporter.log("Launching Application", true);
		home=new NeoStoxHomePage1(driver);
		signIn=new NeoStoxSignInPage2(driver);
		pwd=new NeoStoxPasswordPage3(driver);
		dash=new NeoStoxDashBoardPage4(driver);
		myFile=new File("C:\\\\Selenium\\\\NeostoxDetails.xlsx");
	    mySheet = WorkbookFactory.create(myFile).getSheet("Sheet1");
	    home.clickOnSignInButton();
	    Reporter.log("clicked on signIn button at home page", true);
	}
	
	@BeforeMethod
	public void SignIntoNeoStox() throws EncryptedDocumentException, IOException, InterruptedException
	{
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		signIn.EnterMobileNo(mySheet.getRow(0).getCell(0).getStringCellValue());
	    Reporter.log("Mobile number is handled", true);
        signIn.clickOnSignInButton();
	    Reporter.log("clicked on signIn button", true);

		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		pwd.enterPassword(mySheet.getRow(0).getCell(1).getStringCellValue());
	    Reporter.log("Password is entered", true);

        pwd.clickOnSubmitButton();
        Reporter.log("Clicked on submit button and Signing in is completed", true);
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		dash.handlePopUp();
		Reporter.log("PopUp is Handled", true);
		//apan handle popup ithe execute keli karan ki apli test case hi user name validate karan ahe mhanun tithe fkt tech karach
	}
	
	@Test
   public void ValidateUserName() throws InterruptedException 
	{
		//aplya javal testng madhe "AssertEqual" chi method ahe tyachyamule apan testng madhe if chi condition nhi vaparat
		// mg aplyala pom class madhe pn if chi garaj nhi ahe mhanun pom class madhe fkt actual text get karaych ekhadya method madhe
		// mhanun apan pom class madhe getactualtext navachi method use keli
        // ata aplyale compare karasathi expected text laganar je ki excel sheet madhe ahe
		String actualText = dash.GetActualText();
		String expectedText = mySheet.getRow(0).getCell(2).getStringCellValue();
	    Reporter.log("User Name is validate", true);

		Assert.assertEquals(actualText, expectedText,"actual and expected text are not matching,TC is failed");
    }
	
	
	@AfterMethod
	public void LoggingOutFromNeoStox() throws InterruptedException
	{
		dash.clickOnLogOutButton();
	    Reporter.log("Logged out from NeoStox", true);

	}
	
	@AfterClass
	public void ClosingBrowser()
	{
		driver.close();
	    Reporter.log("Browser is closed", true);

		
	}
	
	
	
	
	
	
}
