package testNGKeywords;

import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class InvokeCount {
  @Test(invocationCount = 6)
  public void testing() 
  {
	  Reporter.log("testing is running", true);
  }
  @AfterMethod
  public void testing2()
  {
	  Reporter.log("testing2 is running", true);
  }
}// fakt @Test la ch invocation applicable ahe
