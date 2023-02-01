package testNGXMLStudy;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class NewTest4 {
  @Test(groups = "sanity")
  public void f() 
  {
	  Reporter.log("F is running", true);
  }
  @Test
  public void g() 
  {
	  Reporter.log("G is running", true);
  }
  @Test(groups = "reg")
  public void h() 
  {
	  Reporter.log("H is running", true);
  }
  @Test(groups = "sanity")
  public void i() 
  {
	  Reporter.log("I is running", true);
  }
  @Test(groups = "reg")
  public void j() 
  {
	  Reporter.log("J is running", true);
  }
}
