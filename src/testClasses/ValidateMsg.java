package testClasses;

import org.testng.annotations.Test;

import baseClass.Base;
import newFrameWorkPOMClasses.NeoStoxHomePage1;
import newFrameWorkPOMClasses.NeoStoxSignInPage2;
import utilityClasses.Utility;

import org.testng.annotations.BeforeMethod;

import java.io.IOException;

import org.testng.annotations.AfterMethod;

public class ValidateMsg extends Base
{
	NeoStoxHomePage1 home;
	NeoStoxSignInPage2 SignIn;
	
	 @BeforeMethod
	  public void beforeMethod() throws IOException, InterruptedException 
	 {
		 LaunchingApp();
		 home=new NeoStoxHomePage1(driver);
		 SignIn=new NeoStoxSignInPage2(driver);
		 
		 home.clickOnSignInButton();
		 SignIn.EnterMobileNo(Utility.ReadDataFromPropertiesFile("mob"));
		 SignIn.clickOnSignInButton();
		 Thread.sleep(500);
	  }
	 
  @Test
  public void Message()
  {
	  SignIn.wrongNumMsg();
  }
 

}
