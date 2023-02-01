package testClasses;

import org.testng.annotations.Test;

import baseClass.Base;
import newFrameWorkPOMClasses.NeoStoxDashBoardPage4;
import newFrameWorkPOMClasses.NeoStoxHomePage1;
import newFrameWorkPOMClasses.NeoStoxPasswordPage3;
import newFrameWorkPOMClasses.NeoStoxSignInPage2;
import utilityClasses.Utility;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
@Listeners(testClasses.Listener.class)
public class ValidatingUserNameByProperty extends Base
{
	NeoStoxDashBoardPage4 dash;
	NeoStoxHomePage1 home;
	NeoStoxPasswordPage3 pwd;
	NeoStoxSignInPage2 signIn;
	
	
	@BeforeClass
	  public void beforeClass() throws IOException {
		
		LaunchingApp();
		home=new NeoStoxHomePage1(driver);
		signIn=new NeoStoxSignInPage2(driver);
		pwd=new NeoStoxPasswordPage3(driver);
		dash=new NeoStoxDashBoardPage4(driver);
		
		home.clickOnSignInButton();
		Utility.implicitWait(driver, 1000);
			  }
	 @BeforeMethod
	  public void beforeMethod() throws EncryptedDocumentException, IOException, InterruptedException
	 {
		 signIn.EnterMobileNo(Utility.ReadDataFromPropertiesFile("mobileNum"));
		 signIn.clickOnSignInButton();
		 Utility.implicitWait(driver, 1000);
		 pwd.enterPassword(Utility.ReadDataFromPropertiesFile("password"));
		 Thread.sleep(500);
		 pwd.clickOnSubmitButton();
		 Utility.implicitWait(driver, 1000);
		 dash.handlePopUp();
 	  }
      @Test
      public void ValidatingUserName() throws IOException 
      {
 		 Utility.implicitWait(driver, 1000);

    	  Assert.assertEquals(dash.GetActualText(), Utility.ReadDataFromPropertiesFile("UserName"));
    	  Utility.TakeScreenshot(driver, Utility.ReadDataFromPropertiesFile("SrcName"));
       }
     @Test
     public void ValidatingACBalance() throws IOException
     {   Assert.fail();
    	 Assert.assertNotNull(dash.GetBalance(), "AC balnce is null");
    	 //Utility.TakeScreenshot(driver, "AC balance2");...ha ata listener class madhun yeil
     }
     
     @Test
     public void ValidatingSearchedElement() throws IOException
     {
    	 Assert.assertEquals(dash.gettingList(),Utility.ReadDataFromPropertiesFile("searchElement"));
     }

    @AfterMethod
    public void afterMethod() throws InterruptedException 
    {
	  dash.clickOnLogOutButton();
	  Thread.sleep(500);
    }

     @AfterClass
     public void afterClass() 
     {
    	 driver.close();
    	 Reporter.log("closing NeoStox Application", true);
     }

}
