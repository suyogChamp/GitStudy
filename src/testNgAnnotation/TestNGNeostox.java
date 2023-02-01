package testNgAnnotation;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNGNeostox {
  @Test
  public void validateUserName() 
  {
	  Reporter.log("validating user name", true);
  }
  
  @BeforeMethod
  public void login()
  {
	  Reporter.log("logging into neostox", true);
  }
  
  @BeforeClass
  public void launchURL()
  {
	  Reporter.log("launching URL", true);
  }
  
  @AfterMethod
  public void logOut()
  {
	  Reporter.log("logging out", true);
  }
  @AfterClass
  public void closeTab()
  {
	  Reporter.log("closing tab", true);
  }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
}













