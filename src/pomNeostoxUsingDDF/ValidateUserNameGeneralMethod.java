package pomNeostoxUsingDDF;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class ValidateUserNameGeneralMethod {
	WebDriver driver;
	NeoStoxHomePage1 home;
	NeoStoxDashBoardPage4 dash;
	NeoStoxPasswordPage3 pwd;
	NeoStoxSignInPage2 signIn;
	String s="TCID-2314";
	
	 @BeforeClass
	  public void launchingApp() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\chromedriver.exe"); //..1
			driver=new ChromeDriver();  		
			driver.get("https://neostox.com/");
			Thread.sleep(2000);
			home=new NeoStoxHomePage1(driver);
			signIn=new NeoStoxSignInPage2(driver);
			pwd=new NeoStoxPasswordPage3(driver);
			dash=new NeoStoxDashBoardPage4(driver);
		    home.clickOnSignInButton();
		    GeneralMethod.implicitWait(driver, 1000);
		 
	  }
	 
	 @BeforeMethod
	  public void LoginToNeoStox() throws EncryptedDocumentException, IOException, InterruptedException 
	 {
		 signIn.EnterMobileNo(GeneralMethod.ReadingExcelSheet(0, 0));
		 signIn.clickOnSignInButton();
		 GeneralMethod.implicitWait(driver, 1000);
		 pwd.enterPassword(GeneralMethod.ReadingExcelSheet(0, 1));
		 Thread.sleep(500);
		 pwd.clickOnSubmitButton();
		 GeneralMethod.implicitWait(driver, 1000);
		 dash.handlePopUp();
	  }
	 
     @Test
     public void ValidatingUserName() throws EncryptedDocumentException, IOException 
     {
    	 Assert.assertEquals(dash.GetActualText(),GeneralMethod.ReadingExcelSheet(0, 2));
    	 GeneralMethod.TakeScreenshot(driver, s);
  }
 

  @AfterMethod
  public void LogOutFromNeoStox() throws InterruptedException
  {
	  dash.clickOnLogOutButton();
  }

  

  @AfterClass
  public void afterClass()
  {
	  driver.close();
  }

}
