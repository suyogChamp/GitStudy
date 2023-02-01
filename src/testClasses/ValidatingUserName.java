package testClasses;

import org.testng.annotations.Test;

import baseClass.Base;
import newFrameWorkPOMClasses.NeoStoxDashBoardPage4;
import newFrameWorkPOMClasses.NeoStoxHomePage1;
import newFrameWorkPOMClasses.NeoStoxPasswordPage3;
import newFrameWorkPOMClasses.NeoStoxSignInPage2;
import utilityClasses.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;

public class ValidatingUserName extends Base
{
	NeoStoxDashBoardPage4 dash;
	NeoStoxHomePage1 home;
	NeoStoxSignInPage2 signIn;
	NeoStoxPasswordPage3 pwd;
	
	
	 @BeforeClass
	  public void LaunchingNeostoxApp() throws IOException 
	 {
		LaunchingApp();
		home=new NeoStoxHomePage1(driver);
		signIn=new NeoStoxSignInPage2(driver);
		pwd=new NeoStoxPasswordPage3(driver);
		dash=new NeoStoxDashBoardPage4(driver);
		
		home.clickOnSignInButton();
		Utility.implicitWait(driver, 500);
	  }
	 @BeforeMethod
	  public void LoginToNeostox() throws EncryptedDocumentException, IOException, InterruptedException 
	 {
		 signIn.EnterMobileNo(Utility.ReadingExcelSheet(0, 0));
		 signIn.clickOnSignInButton();
		 Utility.implicitWait(driver, 500);
		 pwd.enterPassword(Utility.ReadingExcelSheet(0, 1));
		 pwd.clickOnSubmitButton();
		 Utility.implicitWait(driver, 500);
		 dash.handlePopUp();
		 
	  }
     @Test
      public void validatingUserName() throws EncryptedDocumentException, IOException 
     {
    	 Assert.assertEquals(dash.GetActualText(), Utility.ReadingExcelSheet(0, 2),"actual and expected text are not matching hence TC is failed");
    	 Utility.TakeScreenshot(driver, "TCID-2020");
      }
     
     @Test
     public void validatingBalance() throws IOException
     {
    	 //apalyala ithe fkt balnce null nasl pahije 
    	 Assert.assertNotNull(dash.GetBalance(),"AC balance is null");
    	 Utility.TakeScreenshot(driver, "Ac Balance");
     }
 
     @AfterMethod
     public void LogoutFromNeostox() throws InterruptedException 
     {
    	 dash.clickOnLogOutButton();
     }

 

  @AfterClass
  public void ClosingNeostoxApp() 
  {
	  driver.close();
	  Reporter.log("Closing NeoStox Appliction", true);
  }

}
